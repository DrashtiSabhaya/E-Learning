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
                + "(school_id,faculty_id,faculty,standard,medium,subject,subject_id,topic,file_name,due_date) "
                + "values("+
                s.getSchool_id()        +","+
                s.getFaculty_id()       +",'"+
                s.getFaculty()          +"',"+
                s.getStandard()         +",'"+
                s.getMedium()           +"','"+
                s.getSubject()          +"',"+
                s.getSubject_id()       +",'"+
                s.getTopic()            +"','"+
                s.getFilename()         +"','"+
                s.getDuedate()          +"')";
        System.out.println("\n\nQuery "+sql);
        return template.update(sql);
    }
    public List<Assignment> getAssignement(String id)
    {
        return template.query("select * from assignment where faculty_id = "+id,new RowMapper<Assignment>()
        {
            @Override
            public Assignment mapRow(ResultSet rs, int row) throws SQLException {
                Assignment e=new Assignment();
                e.setId(rs.getInt(1));
                e.setStandard(rs.getInt(5));
                e.setMedium(rs.getString(6));
                e.setSubject(rs.getString(7));
                e.setTopic(rs.getString(9));
                e.setFilename(rs.getString(10));
                e.setDate(rs.getString(11));
                e.setDuedate(rs.getString(12));
                return e;
            }
        });
    }
    
}
