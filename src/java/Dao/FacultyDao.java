/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Faculty;
import Bean.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class FacultyDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveFaculty(Faculty f)
    {        
        String sql="insert into faculty(username,password,first_name,middle_name,last_name,contact_no,email,"
                + "gender,experience,standard_id,subject) values('"+
                f.getUsername() +"','"+
                f.getPassword() +"','"+
                f.getFname()    +"','"+
                f.getMname()    +"','"+
                f.getLname()    +"',"+
                f.getContactno()+",'"+
                f.getEmail()    +"','"+
                f.getGender()   +"',"+
                f.getExperience()+","+
                f.getStdid()    +",'"+
                f.getSubject()  +"')";    
        return template.update(sql);    
    }
    public List<Faculty> getFaculty()
    {
        return template.query("select * from faculty",new RowMapper<Faculty>()
        {    
        @Override
        public Faculty mapRow(ResultSet rs, int row) throws SQLException {    
            Faculty e=new Faculty();    
            e.setId(rs.getInt(1));    
            e.setFname(rs.getString(5));
            e.setEmail(rs.getString(9));
            e.setContactno(rs.getInt(8)); 
            e.setGender(rs.getString(10));
            e.setExperience(rs.getInt(11));    
            return e;    
        }    
        });    
    }
    public Faculty validateFaculty(Login login) {
        String sql = "select * from faculty where username='" + 
                login.getUsername() 
                + "' and password='" + 
                login.getPassword() + "'";
        List<Faculty> faculty = template.query(sql, new RowMapper<Faculty>()
        {    
        @Override
        public Faculty mapRow(ResultSet rs, int row) throws SQLException {    
            Faculty e=new Faculty();    
            e.setId(rs.getInt(1));    
            e.setFname(rs.getString(5));
            e.setEmail(rs.getString(9));
            e.setContactno(rs.getInt(8)); 
            e.setGender(rs.getString(10));
            e.setExperience(rs.getInt(11));    
            return e;    
        }    
        });    
        return faculty.size() > 0 ? faculty.get(0) : null;
    }
}
