/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Subject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class SubjectDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveSubject(Subject s){    
        String sql="insert into subject(medium,standard_id,subject_name) values('"+s.getMedium()+"',"+s.getStandard()+",'"+s.getName()+"')";    
        return template.update(sql);    
    }
    public List<Subject> getSubjects(){
    return template.query("select subject_id,medium,standard_id,subject_name from subject",new RowMapper<Subject>(){    
        @Override
        public Subject mapRow(ResultSet rs, int row) throws SQLException {    
            Subject e=new Subject();    
            e.setId(rs.getInt(1));    
            e.setMedium(rs.getString(2));
            e.setStandard(rs.getInt(3));
            e.setName(rs.getString(4));    
            return e;    
        }    
        });    
    }
}