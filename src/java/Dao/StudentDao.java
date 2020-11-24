/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Dao;

import Bean.Login;
import Bean.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
                + "(school_id,standard,medium,rollno,fname,mname,lname,email,contactno,gender,dob,photo,username,password) "
                + "values("+
                s.getSchool_id()    +","+
                s.getStandard()     +",'"+
                s.getMedium()       +"',"+
                s.getRollno()       +",'"+
                s.getFname()        +"','"+
                s.getMname()        +"','"+
                s.getLname()        +"','"+
                s.getEmail()        +"','"+
                s.getContactno()    +"','"+
                s.getGender()       +"','"+
                s.getDob()          +"','"+
                s.getFilename()     +"','"+
                s.getUsername()     +"','"+
                s.getPassword()      +"')";
        return template.update(sql);
    }
    public List<Student> getStudent(String id)
    {
        return template.query("select * from student where school_id="+id,new RowMapper<Student>()
        {
            @Override
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e=new Student();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setStandard(rs.getInt(3));
                e.setMedium(rs.getString(4));
                e.setRollno(rs.getInt(5));
                e.setFname(rs.getString(6));
                e.setMname(rs.getString(7));
                e.setLname(rs.getString(8));
                e.setEmail(rs.getString(9));
                e.setContactno(rs.getString(10));
                e.setGender(rs.getString(11));
                e.setDob(rs.getString(12));
                e.setFilename(rs.getString(13));
                e.setUsername(rs.getString(14));
                e.setPassword(rs.getString(15));
                return e;
            }
        });
    }
    public Student validateStudent(Login login) {
        String sql = "select * from student where username='" +
                login.getUsername()
                + "' and ( password='" +
                login.getPassword() + "' or email = '"+
                login.getEmail()+ "')";
        List<Student> student = template.query(sql, new RowMapper<Student>()
        {
            @Override
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e=new Student();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setStandard(rs.getInt(3));
                e.setMedium(rs.getString(4));
                e.setRollno(rs.getInt(5));
                e.setFname(rs.getString(6));
                e.setMname(rs.getString(7));
                e.setLname(rs.getString(8));
                e.setEmail(rs.getString(9));
                e.setContactno(rs.getString(10));
                e.setGender(rs.getString(11));
                e.setDob(rs.getString(12));
                e.setUsername(rs.getString(14));
                e.setPassword(rs.getString(15));
                return e;
            }
        });
        return student.size() > 0 ? student.get(0) : null;
    }
    public Student checkStudent(int school_id, int standard, String medium, int rollno) {
        String sql = "select * from student where"
                + " school_id=" +school_id
                + " and standard =" +standard
                + " and medium ='" +medium
                + "' and rollno =" +rollno;
        List<Student> student = template.query(sql, new RowMapper<Student>()
        {
            @Override
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e=new Student();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setStandard(rs.getInt(3));
                e.setMedium(rs.getString(4));
                e.setRollno(rs.getInt(5));
                e.setFname(rs.getString(6));
                e.setMname(rs.getString(7));
                e.setLname(rs.getString(8));
                e.setEmail(rs.getString(9));
                e.setContactno(rs.getString(10));
                e.setGender(rs.getString(11));
                e.setDob(rs.getString(12));
                e.setUsername(rs.getString(14));
                e.setPassword(rs.getString(15));
                return e;
            }
        });
        return student.size() > 0 ? student.get(0) : null;
    }
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM student WHERE id="+ id;
        return template.queryForObject(sql, BeanPropertyRowMapper.newInstance(Student.class));
    }
    public int saveUpdate(Student f)
    {
        if(f.getId()>0){
            String sql="Update student set "
                    + "standard = "         +f.getStandard()
                    + ", rollno = "         +f.getRollno()
                    + ", medium = '"        +f.getMedium()  +"'"
                    + ", fname = '"         +f.getFname()   +"'"
                    + ", mname ='"          +f.getMname()   +"'"
                    + ", lname ='"          +f.getLname()   +"'"
                    + ", contactno ='"      +f.getContactno()+"'"
                    + ", email ='"          +f.getEmail()    +"'"
                    + ", gender ='"         +f.getGender()   +"'"
                    + ", dob ='"            +f.getDob()      +"'"
                    + " where id = "        +f.getId();
            return template.update(sql);
        }
        return 0;
    }
    public int deleteStudent(int p)
    {
        String sql="DELETE FROM student WHERE id=?";
        return template.update(sql,p);
    }
}