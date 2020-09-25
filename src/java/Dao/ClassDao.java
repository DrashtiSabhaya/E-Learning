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
                + "(standard_id,subject_id,classname,photo) "
                + "values("+
                s.getStandard()         +","+
                s.getSubject()          +",'"+
                s.getClassname()        +"','"+
                s.getCoverphoto()         +"')";    
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
            e.setStandard(rs.getInt(3));
            e.setSubject(rs.getInt(4));
            e.setClassname(rs.getString(5));
            e.setCoverphoto(rs.getString(6));
            return e;    
        }    
        });    
    }
}
