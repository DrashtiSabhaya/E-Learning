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
import org.springframework.jdbc.core.ResultSetExtractor;
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
        String sql="insert into faculty"
                + "(school_id,username,password,first_name,middle_name,last_name,contact_no,email,"
                + "gender,experience,subject,photo) values("
                + f.getSchool_id() +",'"+
                f.getUsername() +"','"+
                f.getPassword() +"','"+
                f.getFname()    +"','"+
                f.getMname()    +"','"+
                f.getLname()    +"','"+
                f.getContactno()+"','"+
                f.getEmail()    +"','"+
                f.getGender()   +"',"+
                f.getExperience()+",'"+
                f.getSubject()  +"','"
                + f.getFilename() +"')";
        return template.update(sql);
    }
    public List<Faculty> getFaculty(String id)
    {
        return template.query("select * from faculty where school_id = "+id,new RowMapper<Faculty>()
        {
            @Override
            public Faculty mapRow(ResultSet rs, int row) throws SQLException {
                Faculty e=new Faculty();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setFname(rs.getString(5));
                e.setMname(rs.getString(6));
                e.setLname(rs.getString(7));
                e.setContactno(rs.getString(8));
                e.setEmail(rs.getString(9));
                e.setGender(rs.getString(10));
                e.setExperience(rs.getInt(11));
                e.setSubject(rs.getString(12));
                e.setFilename(rs.getString(13));
                return e;
            }
        });
    }
    public Faculty validateFaculty(Login login) {
        String sql = "select * from faculty where username='" +
                login.getUsername()
                + "' and ( password='" +
                login.getPassword() + "' or email = '"+
                login.getEmail()+ "')";
        List<Faculty> faculty = template.query(sql, new RowMapper<Faculty>()
        {
            @Override
            public Faculty mapRow(ResultSet rs, int row) throws SQLException {
                Faculty e=new Faculty();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setUsername(rs.getString(3));
                e.setPassword(rs.getString(4));
                e.setFname(rs.getString(5));
                e.setMname(rs.getString(6));
                e.setLname(rs.getString(7));
                e.setEmail(rs.getString(9));
                e.setContactno(rs.getString(8));
                e.setGender(rs.getString(10));
                e.setExperience(rs.getInt(11));
                return e;
            }
        });
        return faculty.size() > 0 ? faculty.get(0) : null;
    }
    public Faculty getFacultyByEmail(int school_id, String email, String username) {
        String sql = "select * from faculty where school_id=" +
                school_id+ " and ( email = '"+
                email + "' or username = '"+username+"')";
        List<Faculty> faculty = template.query(sql, new RowMapper<Faculty>()
        {
            @Override
            public Faculty mapRow(ResultSet rs, int row) throws SQLException {
                Faculty e=new Faculty();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setUsername(rs.getString(3));
                e.setPassword(rs.getString(4));
                e.setFname(rs.getString(5));
                e.setMname(rs.getString(6));
                e.setLname(rs.getString(7));
                e.setEmail(rs.getString(9));
                e.setContactno(rs.getString(8));
                e.setGender(rs.getString(10));
                e.setExperience(rs.getInt(11));
                return e;
            }
        });
        return faculty.size() > 0 ? faculty.get(0) : null;
    }
    
    public Faculty getFacultyById(int id, String school_id) {
        String sql = "select * from faculty where id="+ id +" AND school_id = "+school_id;
        return template.query(sql,new ResultSetExtractor<Faculty>(){
            @Override
            public Faculty extractData(ResultSet rs) throws SQLException {
                if(rs.next())
                {
                    Faculty e = new Faculty();
                    e.setId(rs.getInt(1));
                    e.setSchool_id(rs.getInt(2));
                    e.setFname(rs.getString(5));
                    e.setMname(rs.getString(6));
                    e.setLname(rs.getString(7));
                    e.setContactno(rs.getString(8));
                    e.setEmail(rs.getString(9));
                    e.setGender(rs.getString(10));
                    e.setExperience(rs.getInt(11));
                    e.setSubject(rs.getString(12));
                    e.setFilename(rs.getString(13));
                    return e;
                }
                return null;
            }
        });
    }
    public int saveUpdate(Faculty f)
    {
        if(f.getId()>0){
            String sql="Update faculty set "
                    + "school_id = "       +f.getSchool_id() +
                    ", first_name = '"     +f.getFname()   +"'"
                    + ", middle_name ='"   +f.getMname()    +"'"
                    + ", last_name ='"     +f.getLname()    +"'"
                    + ", contact_no ='"    +f.getContactno()+"'"
                    + ", email ='"         +f.getEmail()    +"'"
                    + ", gender ='"        +f.getGender()   +"'"
                    + ", experience ="     +f.getExperience()
                    + ", subject ='"       +f.getSubject()   +"'"
                    + " where id = "       +f.getId();
            System.out.println(sql);
            return template.update(sql);
        }
        return 0;
    }
    public int deleteFaculty(int p)
    {
        String sql="DELETE FROM faculty WHERE id=?";
        return template.update(sql,p);
    }
}
