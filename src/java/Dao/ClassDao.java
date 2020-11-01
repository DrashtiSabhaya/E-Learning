/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Dao;

import Bean.StClass;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class ClassDao {
    JdbcTemplate template;
    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int saveClass(StClass s) throws IOException
    {
        String sql="insert into class"
                + "(school_id,faculty_id,faculty,standard,medium,subject,subject_id,classname) "
                + "values("+
                s.getSchool_id()        +","+
                s.getFaculty_id()       +",'"+
                s.getFaculty()          +"',"+
                s.getStandard()         +",'"+
                s.getMedium()           +"','"+
                s.getSubject()          +"',"+
                s.getSubject_id()       +",'"+
                s.getClassname()        +"')";
        return template.update(sql);
    }
    public List<StClass> getClasses()
    {
        return template.query("select * from class",new RowMapper<StClass>()
        {
            @Override
            public StClass mapRow(ResultSet rs, int row) throws SQLException {
                StClass e=new StClass();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setFaculty_id(rs.getInt(3));
                e.setStandard(rs.getInt(5));
                e.setMedium(rs.getString(6));
                e.setSubject(rs.getString(7));
                e.setSubject_id(rs.getInt(8));
                e.setClassname(rs.getString(9));
                return e;
            }
        });
    }
}
