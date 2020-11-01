/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Dao;

import Bean.SubjectAssign;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Drashti
 */
public class SubjectAssignDao {
    JdbcTemplate template;
    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int saveAssignedSubject(SubjectAssign s, String id){
        String sql="insert into subject_assign(school_id,standard,medium,subject,subject_id,faculty,faculty_id) "
                + "values("+id+","+s.getStandard()+",'"+s.getMedium()+"','"+s.getSubject()+
                "',"+s.getSubject_id()+",'"
                +s.getFaculty()+"',"
                +s.getFaculty_id()+")";
        return template.update(sql);
    }
    public List<SubjectAssign> getAssignedSubjects(String id){
        return template.query("select * from subject_assign where school_id = "+id,new RowMapper<SubjectAssign>(){
            @Override
            public SubjectAssign mapRow(ResultSet rs, int row) throws SQLException {
                SubjectAssign e=new SubjectAssign();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setStandard(rs.getInt(3));
                e.setMedium(rs.getString(4));
                e.setSubject(rs.getString(5));
                e.setSubject_id(rs.getInt(6));
                e.setFaculty(rs.getString(7));
                e.setFaculty_id(rs.getInt(8));
                return e;
            }
        });
    }
    public int deleteAssignedSubject(int p)
    {
        String sql="DELETE FROM subject_assign WHERE id=?";
        return template.update(sql,p);
    }
    public List<SubjectAssign> getAssignedSubjectsByFaculty(String id){
        return template.query("select * from subject_assign where faculty_id = "+id,new RowMapper<SubjectAssign>(){
            @Override
            public SubjectAssign mapRow(ResultSet rs, int row) throws SQLException {
                SubjectAssign e=new SubjectAssign();
                e.setId(rs.getInt(1));
                e.setSchool_id(rs.getInt(2));
                e.setStandard(rs.getInt(3));
                e.setMedium(rs.getString(4));
                e.setSubject(rs.getString(5));
                e.setSubject_id(rs.getInt(6));
                e.setFaculty(rs.getString(7));
                e.setFaculty_id(rs.getInt(8));
                return e;
            }
        });
    }
}
