/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Admin;
import Bean.Login;
import Bean.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class StudentDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveStudent(Student s)
    {        
        String sql="insert into student"
                + "(standard_id,medium,rollno,fname,mname,lname,email,contactno,gender,dob,username,password) "
                + "values("+
                s.getStandard_id()  +",'"+
                s.getMedium()       +"',"+
                s.getRollno()       +",'"+
                s.getFname()        +"','"+
                s.getMname()        +"','"+
                s.getLname()        +"','"+
                s.getEmail()        +"',"+
                s.getContactno()    +",'"+
                s.getGender()       +"','"+
                s.getDob()          +"','"+
                s.getUsername()     +"','"+
                s.getPassword()      +"')";    
        return template.update(sql);    
    }
    public List<Student> getStudent()
    {
        return template.query("select * from student",new RowMapper<Student>()
        {    
        @Override
        public Student mapRow(ResultSet rs, int row) throws SQLException {    
            Student e=new Student();    
            e.setId(rs.getInt(1)); 
            e.setSchool_id(rs.getInt(2));
            e.setStandard_id(rs.getInt(3));
            e.setMedium(rs.getString(4));
            e.setRollno(rs.getInt(5));
            e.setFname(rs.getString(6));
            e.setMname(rs.getString(7));
            e.setLname(rs.getString(8));
            e.setEmail(rs.getString(9));
            e.setContactno(rs.getInt(10));
            e.setGender(rs.getString(11));
            e.setDob(rs.getString(12));
            e.setUsername(rs.getString(14));
            e.setPassword(rs.getString(15));
            return e;    
        }    
        });    
    }
    public Student validateStudent(Login login) {
        String sql = "select * from student where username='" + 
                login.getUsername() 
                + "' and password='" + 
                login.getPassword() + "'";
        List<Student> student = template.query(sql, new RowMapper<Student>()
        {    
        @Override
        public Student mapRow(ResultSet rs, int row) throws SQLException {    
            Student e=new Student();    
            e.setId(rs.getInt(1)); 
            e.setSchool_id(rs.getInt(2));
            e.setStandard_id(rs.getInt(3));
            e.setMedium(rs.getString(4));
            e.setRollno(rs.getInt(5));
            e.setFname(rs.getString(6));
            e.setMname(rs.getString(7));
            e.setLname(rs.getString(8));
            e.setEmail(rs.getString(9));
            e.setContactno(rs.getInt(10));
            e.setGender(rs.getString(11));
            e.setDob(rs.getString(12));
            e.setUsername(rs.getString(14));
            e.setPassword(rs.getString(15));
            return e;    
        }    
        });    
        return student.size() > 0 ? student.get(0) : null;
    }
}