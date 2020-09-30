/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.DiscussionForum;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class DiscussionDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveComment(DiscussionForum s){    
        String sql="insert into discussion_forum(video_id,username,comment) values('"
                +s.getVideoid()+"','"+
                s.getUsername()+"','"+
                s.getComment()+"')";    
        return template.update(sql);    
    }
    public List<DiscussionForum> getComments(int id){
    return template.query("select * from discussion_forum where video_id = "+id,new RowMapper<DiscussionForum>(){    
        @Override
        public DiscussionForum mapRow(ResultSet rs, int row) throws SQLException {    
            DiscussionForum e = new DiscussionForum();    
            e.setId(rs.getInt(1));    
            e.setVideoid(rs.getInt(2));
            e.setUsername(rs.getString(3));
            e.setComment(rs.getString(4));
            e.setDate(rs.getString(5));
            return e;    
        }    
        });    
    }
    
}
