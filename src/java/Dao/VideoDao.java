/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.School;
import Bean.Video;
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
public class VideoDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveVideo(Video s){    
        String sql="insert into video"
                + "(standard_id,subject_id,topic,link) "
                + "values("+
                s.getStandard()     +",'"+
                s.getSubject()      +"','"+
                s.getTopic()        +"','"+
                s.getLink()         +"')";    
        System.out.println("\n\nQuery "+sql);
        return template.update(sql);    
    }
    public List<Video> getVideo(){
    return template.query("select * from video",new RowMapper<Video>(){    
        @Override
        public Video mapRow(ResultSet rs, int row) throws SQLException {    
            Video e=new Video();    
            e.setId(rs.getInt(1)); 
            e.setStandard(rs.getInt(2));
            e.setSubject(rs.getString(3));
            e.setTopic(rs.getString(4));
            e.setLink(rs.getString(5));
            return e;    
        }    
        });    
    }
    public List<Video> getVideoBySubjectId(int id){
    return template.query("select * from video where subject_id = '"+id+"'",new RowMapper<Video>(){    
        @Override
        public Video mapRow(ResultSet rs, int row) throws SQLException {    
            Video e=new Video();    
            e.setId(rs.getInt(1)); 
            e.setStandard(rs.getInt(2));
            e.setSubject(rs.getString(3));
            e.setTopic(rs.getString(4));
            e.setLink(rs.getString(5));
            return e;    
        }    
        });    
    }
    public Video getVideoById(int id) {
        String sql = "SELECT * FROM video WHERE subject_id='"+ id+"' LIMIT 1";
        return template.queryForObject(sql, BeanPropertyRowMapper.newInstance(Video.class));
    }
}
