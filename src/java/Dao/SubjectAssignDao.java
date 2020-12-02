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
    public int saveAssignedSubject(SubjectAssign s){
        String sql="insert into subject_assign(school_id,standard,medium,subject,subject_id,faculty,faculty_id) "
                + "values("+s.getSchool_id()+","+s.getStandard()+",'"+s.getMedium()+"','"+s.getSubject()+
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
        return template.query("select * from subject_assign where faculty_id = "+id+" ORDER BY standard ASC",new RowMapper<SubjectAssign>(){
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
    public SubjectAssign checkAssignSubject(SubjectAssign sub){
        String sql = "select * from subject_assign where "
                + "school_id = "+sub.getSchool_id()
                +" and standard = "+sub.getStandard()
                +" and medium = '"+sub.getMedium()+"'"
                +" and subject = '"+sub.getSubject()+"'"
                +" and faculty_id = "+sub.getFaculty_id();
        List<SubjectAssign> subassign = template.query(sql,new RowMapper<SubjectAssign>(){
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
        return subassign.size() > 0 ? subassign.get(0) : null;
    }
    /**
     * GetSubjectById
     * @param standard_id
     * @param school_id
     * @param medium
     * @return
     */
    public List<SubjectAssign> getSubjectsByStd(int standard_id,int school_id,String medium){
        String sql = "select * from subject_assign where "
                + " school_id="+school_id
                + " and standard ="+standard_id
                + " and medium='"+medium+"'";
        return template.query(sql,new RowMapper<SubjectAssign>(){
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
