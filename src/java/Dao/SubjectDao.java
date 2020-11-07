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
    public int saveSubject(Subject s, String id){
        String sql="insert into subject(school_id,medium,standard,subject_name) values("+id+",'"+s.getMedium()+"',"+s.getStandard()+",'"+s.getName()+"')";
        return template.update(sql);
    }
    public List<Subject> getSubjects(String id){
        return template.query("select * from subject where school_id = "+id,new RowMapper<Subject>(){
            @Override
            public Subject mapRow(ResultSet rs, int row) throws SQLException {
                Subject e=new Subject();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setMedium(rs.getString(3));
                e.setStandard(rs.getInt(4));
                e.setName(rs.getString(5));
                return e;
            }
        });
    }
    public List<Subject> getDistinctSubjects(String id){
        return template.query("select DISTINCT subject_name from subject where school_id = "+id,new RowMapper<Subject>(){
            @Override
            public Subject mapRow(ResultSet rs, int row) throws SQLException {
                Subject e=new Subject();
                e.setName(rs.getString(1));
                return e;
            }
        });
    }
    
    public Subject checkSubject(Subject s)
    {
        String sql="SELECT * FROM subject WHERE school_id="+s.getSchool_id()+ " AND standard ="+s.getStandard()+" AND medium='"+s.getMedium()+"' AND subject_name='"+s.getName()+"' LIMIT 1";
        System.out.println(sql);
        List<Subject> std= template.query(sql,new RowMapper<Subject>(){
            @Override
            public Subject mapRow(ResultSet rs, int row) throws SQLException {
                Subject e=new Subject();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setMedium(rs.getString(3));
                e.setStandard(rs.getInt(4));
                return e;
            }
        });
        return std.size() > 0 ? std.get(0) : null;
    }
    public int deleteSubject(int p)
    {
        String sql="DELETE FROM subject WHERE subject_id=?";
        return template.update(sql,p);
    }
}