/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Assignment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class AssignmentDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveAssignment(Assignment s)
    {        
        String sql="insert into assignment"
                + "(standard_id,subject_id,topic,file_name,due_date) "
                + "values("+
                s.getStandard()     +","+
                s.getSubject()      +",'"+
                s.getTopic()        +"','"+
                s.getFilename()     +"','"+
                s.getDuedate()      +"')";    
        System.out.println("\n\nQuery "+sql);
        return template.update(sql);    
    }
    public List<Assignment> getAssignement()
    {
        return template.query("select * from assignment",new RowMapper<Assignment>()
        {    
        @Override
        public Assignment mapRow(ResultSet rs, int row) throws SQLException {    
            Assignment e=new Assignment();    
            e.setId(rs.getInt(1)); 
            e.setStandard(rs.getInt(2));
            e.setSubject(rs.getInt(3));
            e.setTopic(rs.getString(4));
            e.setFilename(rs.getString(5));
            e.setDate(rs.getString(6));
            e.setDuedate(rs.getString(7));
            return e;    
        }    
        });    
    }
    
}
