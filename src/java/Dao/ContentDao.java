/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Assignment;
import Bean.Content;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class ContentDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveContent(Content s)
    {        
        String sql="insert into content"
                + "(standard_id,subject_id,topic,filename) "
                + "values("+
                s.getStandard()     +","+
                s.getSubject()      +",'"+
                s.getTopic()        +"','"+
                s.getFilename()     +"')";    
        System.out.println("\n\nQuery "+sql);
        return template.update(sql);    
    }
    public List<Content> getContent()
    {
        return template.query("select * from content",new RowMapper<Content>()
        {    
        @Override
        public Content mapRow(ResultSet rs, int row) throws SQLException {    
            Content e=new Content();    
            e.setId(rs.getInt(1)); 
            e.setStandard(rs.getInt(2));
            e.setSubject(rs.getInt(3));
            e.setTopic(rs.getString(4));
            e.setFilename(rs.getString(5));
            return e;    
        }    
        });    
    }
    
}
