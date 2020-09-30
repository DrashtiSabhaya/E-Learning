package Dao;

import Bean.Feedback;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drashti
 */
public class FeedbackDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }
    public int saveFeedback(Feedback s){    
        String sql="insert into feedback(name,email,message) values('"
                +s.getName()+"','"+
                s.getEmail()+"','"+
                s.getMessage()+"')";    
        return template.update(sql);    
    }
    public List<Feedback> getFeedback(){
    return template.query("select * from feedback",new RowMapper<Feedback>(){    
        @Override
        public Feedback mapRow(ResultSet rs, int row) throws SQLException {    
            Feedback e = new Feedback();    
            e.setId(rs.getInt(1));    
            e.setName(rs.getString(2));
            e.setEmail(rs.getString(3));
            e.setMessage(rs.getString(4));
            return e;    
        }    
        });    
    }  
    public int deleteFeedback(int p)
    {
        String sql="DELETE FROM feedback WHERE id=?";    
        return template.update(sql,p);
    }
}
