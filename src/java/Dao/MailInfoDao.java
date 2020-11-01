/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Dao;

import Bean.MailInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class MailInfoDao {
    JdbcTemplate template;
    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int saveMail(MailInfo s)
    {
        String sql="insert into mailinfo"
                + "(school_id,mailto,subject,message) "
                + "values("+
                s.getSchool_id()    +",'"+
                s.getMailto()       +"','"+
                s.getSubject()      +"','"+
                s.getMessage()      +"')";
        return template.update(sql);
    }
    public List<MailInfo> getMails()
    {
        return template.query("select * from mailinfo",new RowMapper<MailInfo>()
        {
            @Override
            public MailInfo mapRow(ResultSet rs, int row) throws SQLException {
                MailInfo e=new MailInfo();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setMailto(rs.getString(3));
                e.setSubject(rs.getString(4));
                e.setMessage(rs.getString(5));
                e.setDate(rs.getString(6));
                return e;
            }
        });
    }
}
