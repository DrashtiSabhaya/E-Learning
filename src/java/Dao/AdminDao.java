/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Admin;
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
public class AdminDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public List<Admin> fetchData()
    {
        return template.query("select * from admin",new RowMapper<Admin>()
        {    
        @Override
        public Admin mapRow(ResultSet rs, int row) throws SQLException {    
            Admin e=new Admin();    
            e.setId(rs.getInt(1));    
            e.setUsername(rs.getString(2));
            e.setPassword(rs.getString(3));
            return e;    
        }    
        });    
    } 
    public Admin validateAdmin(Login login) {
        String sql = "select * from admin where username='" + 
                login.getUsername() 
                + "' and password='" + 
                login.getPassword() + "'";
        List<Admin> admin = template.query(sql, new RowMapper<Admin>()
        {    
        @Override
        public Admin mapRow(ResultSet rs, int row) throws SQLException {    
            Admin e=new Admin();    
            e.setId(rs.getInt(1));    
            e.setUsername(rs.getString(2));
            e.setPassword(rs.getString(3));
            return e;    
        }    
        });    
        return admin.size() > 0 ? admin.get(0) : null;
    }
}
