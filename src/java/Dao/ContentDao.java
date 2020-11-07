/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Dao;

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
                + "(school_id,faculty_id,faculty,standard,medium,subject,subject_id,topic,filename) "
                + "values("+
                s.getSchool_id()        +","+
                s.getFaculty_id()       +",'"+
                s.getFaculty()          +"',"+
                s.getStandard()         +",'"+
                s.getMedium()           +"','"+
                s.getSubject()          +"',"+
                s.getSubject_id()       +",'"+
                s.getTopic()            +"','"+
                s.getFilename()     +"')";
        System.out.println("\n\nQuery "+sql);
        return template.update(sql);
    }
    public List<Content> getContent(String id)
    {
        return template.query("select * from content where faculty_id = "+id,new RowMapper<Content>()
        {
            @Override
            public Content mapRow(ResultSet rs, int row) throws SQLException {
                Content e=new Content();
                e.setId(rs.getInt(1));
                e.setStandard(rs.getInt(5));
                e.setMedium(rs.getString(6));
                e.setSubject(rs.getString(7));
                e.setTopic(rs.getString(9));
                e.setFilename(rs.getString(10));
                return e;
            }
        });
    }
    public List<Content> getContentBySubject(String id)
    {
        return template.query("select * from content where subject_id = "+id,new RowMapper<Content>()
        {
            @Override
            public Content mapRow(ResultSet rs, int row) throws SQLException {
                Content e=new Content();
                e.setId(rs.getInt(1));
                e.setFaculty(rs.getString(4));
                e.setStandard(rs.getInt(5));
                e.setMedium(rs.getString(6));
                e.setSubject(rs.getString(7));
                e.setTopic(rs.getString(9));
                e.setFilename(rs.getString(10));
                return e;
            }
        });
    }
    public int deleteContent(int p)
    {
        String sql="DELETE FROM content WHERE id=?";
        return template.update(sql,p);
    }
}
