/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Login;
import Bean.School;
import Bean.SchoolList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class SchoolDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveSchool(School s)
    {        
        String sql="insert into school"
            + "(school_name,username,password,owner_name,register_num,school_contact,address,email,standard,medium) "
            + "values('"+
            s.getName()             +"','"+
            s.getUsername()         +"','"+
            s.getPassword()         +"','"+
            s.getOwnername()        +"','"+
            s.getRegisterno()       +"',"+
            s.getContactno()        +",'"+
            s.getAddress()          +"','"+
            s.getEmail()            +"','"+
            s.getStandard()         +"','"+
            s.getMedium()           +"')";    
        return template.update(sql);    
    }
    public List<School> getSchool(int status)
    {
        return template.query("select * from school where status = "+status,new RowMapper<School>()
        {    
        @Override
        public School mapRow(ResultSet rs, int row) throws SQLException {    
            School e=new School();    
            e.setId(rs.getInt(1)); 
            e.setName(rs.getString(2));
            e.setUsername(rs.getString(3));
            e.setPassword(rs.getString(4));
            e.setOwnername(rs.getString(5));
            e.setRegisterno(rs.getString(6));
            e.setContactno(rs.getString(7));
            e.setAddress(rs.getString(8));
            e.setEmail(rs.getString(9));
            e.setStandard(rs.getString(10));
            e.setMedium(rs.getString(11));
            e.setStatus(rs.getInt(12));
            e.setDate(rs.getString(13));
            return e;    
        }    
        });    
    }
    public List<School> getSchoolRequest(int status)
    {
        return template.query("select * from school where status = "+status,new RowMapper<School>()
        {    
        @Override
        public School mapRow(ResultSet rs, int row) throws SQLException {    
            School e=new School();    
            e.setId(rs.getInt(1)); 
            e.setName(rs.getString(2));
            e.setUsername(rs.getString(3));
            e.setPassword(rs.getString(4));
            e.setOwnername(rs.getString(5));
            e.setRegisterno(rs.getString(6));
            e.setContactno(rs.getString(7));
            e.setAddress(rs.getString(8));
            e.setEmail(rs.getString(9));
            e.setStandard(rs.getString(10));
            e.setMedium(rs.getString(11));
            e.setStatus(rs.getInt(12));
            return e;    
        }    
        });    
    }
    public int updateStatus(int p,int status){    
        String sql="update school set status = "+status+" where id="+p+"";    
        return template.update(sql);    
    }    
    public int saveUpdate(School s)
    {   
        if(s.getId()>0){
        String sql="Update school set "
            + "school_name='"       +s.getName()+"'"
            + ",owner_name='"       +s.getOwnername()+"'"
            + ",register_num ='"    +s.getRegisterno()+"'"
            + ",school_contact ='"  +s.getContactno()+"'"
            + ",address ='"         +s.getAddress()+"'"
            + ",email ='"           +s.getEmail()+"'"
            + ",standard = '"       +s.getStandard()+"'"
            + ",medium = '"         +s.getMedium()+"'"
            + "where id = "         +s.getId();
            return template.update(sql);  
        }
        return 0;
    }
    
    public int deleteSchool(int p)
    {
        String sql="DELETE FROM school WHERE id=?";    
        return template.update(sql,p);
    }
    
    public School get(int id) {
        String sql = "SELECT * FROM school WHERE id="+ id;
        return template.queryForObject(sql, BeanPropertyRowMapper.newInstance(School.class));
    }
    
    public School getSchoolById(int id)
    {
        String sql="SELECT * FROM school WHERE id = "+id;
        return template.query(sql,new ResultSetExtractor<School>(){    
        @Override
        public School extractData(ResultSet rs) throws SQLException {  
            if(rs.next())
            {
                School e = new School();    
                e.setId(rs.getInt(1)); 
                e.setName(rs.getString(2));
                e.setUsername(rs.getString(3));
                e.setPassword(rs.getString(4));
                e.setOwnername(rs.getString(5));
                e.setRegisterno(rs.getString(6));
                e.setContactno(rs.getString(7));
                e.setAddress(rs.getString(8));
                e.setEmail(rs.getString(9));
                e.setStandard(rs.getString(10));
                e.setMedium(rs.getString(11));
                e.setStatus(rs.getInt(12));
                e.setDate(rs.getString(13));
                return e;  
            }
            return null;
        }    
        });    
    }
    public School validateSchool(Login login) {
        String sql = "select * from school where username='" + 
                login.getUsername() 
                + "' and password='" + 
                login.getPassword() + "'";
        List<School> school = template.query(sql, new RowMapper<School>(){    
        
        @Override
        public School mapRow(ResultSet rs, int row) throws SQLException {    
            School e=new School();    
            e.setId(rs.getInt(1)); 
            e.setName(rs.getString(2));
            e.setUsername(rs.getString(3));
            e.setPassword(rs.getString(4));
            e.setOwnername(rs.getString(5));
            e.setRegisterno(rs.getString(6));
            e.setContactno(rs.getString(7));
            e.setAddress(rs.getString(8));
            e.setEmail(rs.getString(9));
            e.setStandard(rs.getString(10));
            e.setMedium(rs.getString(11));
            e.setStatus(rs.getInt(12));
            return e;    
        }    
        });    
        return school.size() > 0 ? school.get(0) : null;
    }
    public List<SchoolList> getSchoolList(String criteria)
    {
        String year;
        String month="";
        if(criteria.equals("month"))
        {
            year=Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
            month="Where Year(date)="+year;
        }
        String sql = "Select count(*) as schools,"+criteria+"(date) as criteria from school "+month+" GROUP By "+criteria+"(date)"
                + "ORDER BY "+criteria+"(date)";
        List<SchoolList> list = template.query(sql,new RowMapper<SchoolList>()
        {    
        @Override
        public SchoolList mapRow(ResultSet rs, int row) throws SQLException {    
            SchoolList e=new SchoolList();    
            e.setCount(rs.getInt(1)); 
            e.setCriteria(rs.getInt(2));
            return e;    
        }    
        });     
        return list;
    }
}