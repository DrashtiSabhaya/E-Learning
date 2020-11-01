/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Dao;

import Bean.Standards;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class StandardDao {
    JdbcTemplate template;
    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int saveStandard(Standards s){
        String sql="insert into standards(school_id,standard,medium) values("+s.getSchool_id()+","+s.getStandard()+",'"+s.getMedium()+"')";
        return template.update(sql);
    }
    public int checkStandard(Standards s)
    {
        String sql="SELECT * FROM standards WHERE school_id ="+s.getSchool_id()+ " AND standard ="+s.getStandard()+" AND medium='"+s.getMedium()+"' LIMIT 1";
        List<Standards> std= template.query(sql,new RowMapper<Standards>(){
            @Override
            public Standards mapRow(ResultSet rs, int row) throws SQLException {
                Standards e=new Standards();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setStandard(rs.getInt(3));
                e.setMedium(rs.getString(4));
                return e;
            }
        });
        return std.size() > 0 ? 1 : 0;
    }
    public List<Standards> getStandard(String id){
        return template.query("select * from standards where school_id="+id,new RowMapper<Standards>(){
            @Override
            public Standards mapRow(ResultSet rs, int row) throws SQLException {
                Standards e=new Standards();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setStandard(rs.getInt(3));
                e.setMedium(rs.getString(4));
                return e;
            }
        });
    }
    public int deleteStandard(int p)
    {
        String sql="DELETE FROM standards WHERE id=?";
        return template.update(sql,p);
    }
}