/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.UploadAssignment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class UploadAssignmentDao {
    JdbcTemplate template;
    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
        public int saveUploadAssignment(UploadAssignment s)
    {
        String sql="insert into upload_assignment"
                + "(school_id,subject,topic,assign_id,student_id,filename) "
                + "values("+
                s.getSchool_id()        +",'"+
                s.getSubject()          +"','"+
                s.getTopic()            +"',"+
                s.getAssign_id()        +","+
                s.getStudent_id()       +",'"+
                s.getFilename()         +"')";
        return template.update(sql);
    }
    public List<UploadAssignment> getAssignementByStudent(String id)
    {
        return template.query("select * from upload_assignment where student_id = "+id,new RowMapper<UploadAssignment>()
        {
            @Override
            public UploadAssignment mapRow(ResultSet rs, int row) throws SQLException {
                UploadAssignment e=new UploadAssignment();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setSubject(rs.getString(3));
                e.setTopic(rs.getString(4));
                e.setAssign_id(rs.getInt(5));
                e.setStudent_id(rs.getInt(6));
                e.setFilename(rs.getString(7));
                e.setSubmitdate(rs.getString(8));
                e.setRemarks(rs.getString(9));
                e.setStatus(rs.getInt(10));
                return e;
            }
        });
    }
    public List<UploadAssignment> getAssignementAssignId(String id)
    {
        String sql="select upload_assignment.*,student.standard,student.fname,student.mname,student.lname from upload_assignment join student on student.id=upload_assignment.student_id where assign_id = "+id;
        return template.query(sql,new RowMapper<UploadAssignment>()
        {
            @Override
            public UploadAssignment mapRow(ResultSet rs, int row) throws SQLException {
                UploadAssignment e=new UploadAssignment();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setSubject(rs.getString(3));
                e.setTopic(rs.getString(4));
                e.setAssign_id(rs.getInt(5));
                e.setStudent_id(rs.getInt(6));
                e.setFilename(rs.getString(7));
                e.setSubmitdate(rs.getString(8));
                e.setRemarks(rs.getString(9));
                e.setStatus(rs.getInt(10));
                e.setStd(rs.getInt(11));
                e.setName(rs.getString(12)+" "+rs.getString(13)+" "+rs.getString(14));
                return e;
            }
        });
    }
    public int updateAssignmentStatus(int p,String remarks){
        String sql="update upload_assignment set status = 1, remarks='"+remarks+"' where id="+p;
        return template.update(sql);
    }
}
