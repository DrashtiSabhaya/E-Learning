/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Controller;

import Bean.Faculty;
import Bean.School;
import Bean.Standards;
import Bean.Student;
import Bean.Subject;
import Bean.SubjectAssign;
import Dao.FacultyDao;
import Dao.SchoolDao;
import Dao.StandardDao;
import Dao.StudentDao;
import Dao.SubjectAssignDao;
import Dao.SubjectDao;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author Drashti
 */
@Controller
@RequestMapping(value = "School")
public class SchoolController {
    @Autowired
            StandardDao stddao;
    @Autowired
            SubjectDao subdao;
    @Autowired
            FacultyDao facdao;
    @Autowired
            StudentDao stdao;
    @Autowired
            SchoolDao scldao;
    @Autowired
            SubjectAssignDao assigndao;
    
    public static String UPLOAD_DIRECTORY="resources/photos";
    
    /********
     * School Home
     * @return
     **********/
    @RequestMapping(value="school_home",method = RequestMethod.GET)
    public String school_home(){
        return "School/school_home";
    }
    
    /******
     * Add Standard
     * @return
     *******/
    @RequestMapping(value="add_standard",method = RequestMethod.GET)
    public String addStandard(){
        return "School/add_standard";
    }
    
    /********
     * Add New Standard
     * @param std
     * @param session
     * @return
     *******/
    @RequestMapping(value="addstandard",method = RequestMethod.POST)
    public String saveStandrad(@ModelAttribute("std") Standards std,HttpSession session){
        if(stddao.checkStandard(std)==0){
            stddao.saveStandard(std);
            session.setAttribute("message", "New Standard is Added");
        } else {
            session.setAttribute("error", "Standard is already Exist");
        }
        return "redirect:/School/add_standard";
    }
    
    /*******
     * View Standards
     * @param m
     * @param session
     * @return
     ********/
    @RequestMapping(value="view_standard")
    public String view_standard(Model m,HttpSession session){
        List<Standards> list=stddao.getStandard(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "School/view_standard";
    }
    
    /***********
     * Delete Standard
     * @param request
     * @param session
     * @return
     **********/
    @RequestMapping(value="/deletestd", method = RequestMethod.GET)
    public String deleteStandard(HttpServletRequest request, HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        int r=stddao.deleteStandard(id);
        if(r>0)
            session.setAttribute("message","Standard is Deleted!");
        else
            session.setAttribute("error","Standard is not Deleted!");
        return "redirect:/School/view_standard";
    }
    
    /******
     * Add Subject
     * @return
     *******/
    @RequestMapping(value="add_subject",method = RequestMethod.GET)
    public String addSubject(){
        return "School/add_subject";
    }
    
    /********
     * Save Subject
     * @param sub
     * @param session
     * @return
     ********/
    @RequestMapping(value="savesubject",method = RequestMethod.POST)
    public String saveSubject(@ModelAttribute("sub") Subject sub, HttpSession session){
        if(subdao.checkSubject(sub)==null){
            subdao.saveSubject(sub,session.getAttribute("id").toString());
            session.setAttribute("message", "New Subject is Added");
        } else {
            session.setAttribute("error", "Subject is already Exist for given Standard");
        }
        return "redirect:/School/add_subject";
    }
    
    /******
     * View Subjects
     * @param m
     * @param session
     * @return
     *******/
    @RequestMapping(value="view_subjects", method = RequestMethod.GET)
    public String view_subjects(Model m, HttpSession session){
        List<Subject> list=subdao.getSubjects(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "School/view_subjects";
    }
    
    /***********
     * Delete Subject
     * @param request
     * @param session
     * @return
     **********/
    @RequestMapping(value="/deletesub", method = RequestMethod.GET)
    public String deleteSubject(HttpServletRequest request, HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        int r=subdao.deleteSubject(id);
        if(r>0)
            session.setAttribute("message","Subject is Deleted!");
        else
            session.setAttribute("error","Subject is not Deleted!");
        return "redirect:/School/view_subjects";
    }
    
    /******
     * Add Faculty
     * @return
     *******/
    @RequestMapping(value="add_faculty",method = RequestMethod.GET)
    public String addFaculty(){
        return "School/add_faculty";
    }
    
    /******
     * Save New Faculty
     * @param session
     * @param request
     * @param file
     * @return
     * @throws java.io.FileNotFoundException
     ********/
    @RequestMapping(value="/savefaculty",method = RequestMethod.POST)
    public String saveFaculty(HttpSession session ,HttpServletRequest request,@RequestParam CommonsMultipartFile file) throws FileNotFoundException, IOException{
        
        Faculty fac = new Faculty();
        fac.setSchool_id(Integer.parseInt(request.getParameter("school_id")));
        fac.setUsername(request.getParameter("username"));
        fac.setPassword(request.getParameter("password"));
        fac.setFname(request.getParameter("fname"));
        fac.setMname(request.getParameter("mname"));
        fac.setLname(request.getParameter("lname"));
        fac.setContactno(request.getParameter("contactno"));
        fac.setEmail(request.getParameter("email"));
        fac.setExperience(Integer.parseInt(request.getParameter("experience")));
        fac.setGender(request.getParameter("gender"));
        fac.setSubject(request.getParameter("subject"));
        
        ServletContext context = session.getServletContext();
        String path = context.getRealPath(UPLOAD_DIRECTORY);
        String filename = file.getOriginalFilename();
        
        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(new File(path + File.separator + filename)));
        stream.write(bytes);
        stream.flush();
        stream.close();
        
        fac.setFilename(filename);
        
        facdao.saveFaculty(fac);
        return "redirect:/School/view_faculty";
    }
    
    /******
     * View Faculties
     * @param m
     * @param session
     * @return
     *******/
    @RequestMapping(value="view_faculty")
    public String view_faculty(Model m,HttpSession session){
        List<Faculty> list=facdao.getFaculty(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "School/view_faculty";
    }
    
    @RequestMapping(value="edit_faculty")
    public String edit_faculty(HttpServletRequest request, Model m,HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        Faculty fac=facdao.getFacultyById(id,session.getAttribute("id").toString());
        m.addAttribute("faculty",fac);
        return "School/edit_faculty";
    }
    
    /*********
     * Save Updates for Faculty
     * @param faculty
     * @param modelMap
     * @return
     *********/
    @RequestMapping(value="/saveupdatefac", method = RequestMethod.POST)
    public String editSave(@ModelAttribute("faculty") Faculty faculty, ModelMap modelMap){
        int id = facdao.saveUpdate(faculty);
        if(id>0)
            modelMap.put("message", "Faculty is Updated!");
        else
            modelMap.put("error", "Faculty Updation failed!");
        return "School/edit_faculty";
    }
    
    /***********
     * Delete Faculty
     * @param request
     * @param session
     * @return
     **********/
    @RequestMapping(value="/deletefaculty", method = RequestMethod.GET)
    public String deleteFaculty(HttpServletRequest request, HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        int r = facdao.deleteFaculty(id);
        if(r>0)
            session.setAttribute("message","Faculty is Deleted!");
        else
            session.setAttribute("error","Faculty is not Deleted!");
        return "redirect:/School/view_faculty";
    }
    
    /******
     * Assign Faculties to Subject
     * @param m
     * @param session
     * @return
     *******/
    @RequestMapping(value="assign_faculty")
    public String assign_faculty(Model m,HttpSession session){
        return "School/assign_faculty";
    }
    
    /********
     * Save Subject Assigned to Faculty
     * @param sub
     * @param session
     * @return
     ********/
    @RequestMapping(value="assignsubject",method = RequestMethod.POST)
    public String saveAssignSubject(@ModelAttribute("subassign") SubjectAssign sub, HttpSession session){
        Subject subject = new Subject();
        subject.setMedium(sub.getMedium());
        subject.setName(sub.getSubject());
        subject.setSchool_id(Integer.parseInt(session.getAttribute("id").toString()));
        subject.setStandard(sub.getStandard());
        subject = subdao.checkSubject(subject);
        Faculty fac = facdao.getFacultyById(sub.getFaculty_id(),session.getAttribute("id").toString());
        sub.setFaculty(fac.getFname()+" "+fac.getMname()+" "+fac.getLname());
        sub.setSubject_id(subject.getId());
        assigndao.saveAssignedSubject(sub,session.getAttribute("id").toString());
        session.setAttribute("message", "Faculty is Assigned to Subject");
        return "redirect:/School/assign_faculty";
    }
    
    /******
     * View Assigned Subjects
     * @param m
     * @param session
     * @return
     *******/
    @RequestMapping(value="view_assign_faculty", method = RequestMethod.GET)
    public String view_AssignedSubjects(Model m, HttpSession session){
        List<SubjectAssign> list=assigndao.getAssignedSubjects(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "School/view_assign_faculty";
    }
    
    /***********
     * Delete Assigned Subject
     * @param request
     * @param session
     * @return
     **********/
    @RequestMapping(value="/deleteassign", method = RequestMethod.GET)
    public String deleteAssignSubject(HttpServletRequest request, HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        int r=assigndao.deleteAssignedSubject(id);
        if(r>0)
            session.setAttribute("message","Assigned Subject is Deleted!");
        else
            session.setAttribute("error","Assigned Subject is not Deleted!");
        return "redirect:/School/view_assign_faculty";
    }
    
    /******
     * Add Student
     * @return
     *******/
    @RequestMapping(value="add_student",method = RequestMethod.GET)
    public String addStudent(){
        return "School/add_student";
    }
    
    /*********
     * Save New Student
     * @param session
     * @param request
     * @param file
     * @return
     * @throws java.io.FileNotFoundException
     ********/
    @RequestMapping(value="savestudent",method = RequestMethod.POST)
    public String saveStudent(HttpSession session ,HttpServletRequest request,@RequestParam CommonsMultipartFile file) throws FileNotFoundException, IOException{
        
        Student st = new Student();
        st.setSchool_id(Integer.parseInt(request.getParameter("school_id")));
        st.setStandard(Integer.parseInt(request.getParameter("standard")));
        st.setMedium(request.getParameter("medium"));
        st.setRollno(Integer.parseInt(request.getParameter("rollno")));
        st.setUsername(request.getParameter("username"));
        st.setPassword(request.getParameter("password"));
        st.setFname(request.getParameter("fname"));
        st.setMname(request.getParameter("mname"));
        st.setLname(request.getParameter("lname"));
        st.setContactno(request.getParameter("contactno"));
        st.setEmail(request.getParameter("email"));
        st.setGender(request.getParameter("gender"));
        st.setDob(request.getParameter("dob"));
        
        ServletContext context = session.getServletContext();
        String path = context.getRealPath(UPLOAD_DIRECTORY);
        String filename = file.getOriginalFilename();
        
        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(new File(path + File.separator +request.getParameter("rollno")+ filename)));
        stream.write(bytes);
        stream.flush();
        stream.close();
        
        st.setFilename(request.getParameter("rollno")+filename);
        
        stdao.saveStudent(st);
        return "redirect:/School/view_students";
    }
    
    /******
     * View Students
     * @param m
     * @param session
     * @return
     ********/
    @RequestMapping(value="view_students")
    public String view_students(Model m, HttpSession session){
        List<Student> list=stdao.getStudent(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "School/view_students";
    }
    
    @RequestMapping(value="edit_student")
    public String edit_Student(HttpServletRequest request, Model m){
        int id = Integer.parseInt(request.getParameter("id"));
        Student stud=stdao.getStudentById(id);
        m.addAttribute("student",stud);
        return "School/edit_student";
    }
    
    /*********
     * Save Updates for Student
     * @param student
     * @param modelMap
     * @return
     *********/
    @RequestMapping(value="/updatestudent", method = RequestMethod.POST)
    public String editSaveStudent(@ModelAttribute("student") Student student, ModelMap modelMap){
        int id = stdao.saveUpdate(student);
        if(id>0)
            modelMap.put("message", "Student is Updated!");
        else
            modelMap.put("error", "Student Updation failed!");
        return "School/edit_student";
    }
    
    
    /***********
     * Delete Student
     * @param request
     * @param session
     * @return
     **********/
    @RequestMapping(value="/deletestud", method = RequestMethod.GET)
    public String deleteStudent(HttpServletRequest request, HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        int r = stdao.deleteStudent(id);
        if(r>0)
            session.setAttribute("message","Student is Deleted!");
        else
            session.setAttribute("error","Student is not Deleted!");
        return "redirect:/School/view_students";
    }
    
    /***********
     * Logout
     * @param session
     * @return
     ************/
    @RequestMapping(value="logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("id");
        return "redirect:/login";
    }
    
    /*****
     * Standards
     * @param session
     * @return
     ******/
    @ModelAttribute("standard")
    public List<String> getStandardList(HttpSession session)
    {
        int id = Integer.parseInt(session.getAttribute("id").toString());
        School school=scldao.getSchoolById(id);
        String[] std = school.getStandard().split("-");
        List<String> standard=new ArrayList<String>();
        for(int i=Integer.parseInt(std[0]);i<=Integer.parseInt(std[1]);i++)
        {
            standard.add(Integer.toString(i));
        }
        return standard;
    }
    
    /*******
     * Mediums
     * @param session
     * @return
     *******/
    @ModelAttribute("medium")
    public String[] getMediums(HttpSession session)
    {
        int id = Integer.parseInt(session.getAttribute("id").toString());
        School school=scldao.getSchoolById(id);
        String[] medium = school.getMedium().split(",");
        return medium;
    }
    
    /*****
     * Standards
     * @param session
     * @return
     ******/
    @ModelAttribute("school_standard")
    public List<String> getSchoolStandardList(HttpSession session)
    {
        List<Standards> list=stddao.getStandard(session.getAttribute("id").toString());
        List<String> standard=new ArrayList<String>();
        for(Standards std:list)
        {
            standard.add(Integer.toString(std.getStandard()));
        }
        return standard;
    }
    
    @ModelAttribute("subject")
    public List<String> getSubjects(HttpSession session)
    {
        List<Subject> list=subdao.getDistinctSubjects(session.getAttribute("id").toString());
        List<String> subject=new ArrayList<String>();
        for(Subject sub:list)
        {
            subject.add(sub.getName());
        }
        return subject;
    }
    
    @ModelAttribute("faculty")
    public Map<String,String> getFaculty(HttpSession session)
    {
        List<Faculty> list=facdao.getFaculty(session.getAttribute("id").toString());
        Map<String,String> faculty=new HashMap<String,String>();
        for(Faculty fac:list)
        {
            faculty.put(Integer.toString(fac.getId()),fac.getFname()+" "+fac.getMname()+ " "+fac.getLname());
        }
        return faculty;
    }
}
