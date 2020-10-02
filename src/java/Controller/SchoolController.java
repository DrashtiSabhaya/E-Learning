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
import Dao.FacultyDao;
import Dao.SchoolDao;
import Dao.StandardDao;
import Dao.StudentDao;
import Dao.SubjectDao;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
     * @return 
     *******/
    @RequestMapping(value="addstandard",method = RequestMethod.POST)    
    public String saveStandrad(@ModelAttribute("std") Standards std){    
        stddao.saveStandard(std);    
        return "redirect:/School/view_standard";    
    }
    
    /******* 
     * View Standards 
     * @param m
     * @return 
     ********/
    @RequestMapping(value="view_standard")    
    public String view_standard(Model m){    
        List<Standards> list=stddao.getStandard();    
        m.addAttribute("list",list);  
        return "School/view_standard";    
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
     * @return 
     ********/
    @RequestMapping(value="savesubject",method = RequestMethod.POST)    
    public String saveSubject(@ModelAttribute("sub") Subject sub){    
        subdao.saveSubject(sub);    
        return "redirect:/School/view_subjects";    
    }
    
    /****** 
     * View Subjects 
     * @param m
     * @return 
     *******/
    @RequestMapping(value="view_subjects", method = RequestMethod.GET)    
    public String view_subjects(Model m){    
        List<Subject> list=subdao.getSubjects();    
        m.addAttribute("list",list);  
        return "School/view_subjects";    
    }
    
    /****** 
     * Save New Faculty
     * @param fac
     * @return  
     ********/
    @RequestMapping(value="/savefaculty",method = RequestMethod.POST)    
    public String saveFaculty(@ModelAttribute("fac") Faculty fac){    
        facdao.saveFaculty(fac);    
        return "redirect:/School/view_faculty";    
    }
    
    /****** 
     * View Faculties 
     * @param m
     * @return 
     *******/
    @RequestMapping(value="view_faculty")    
    public String view_faculty(Model m){    
        List<Faculty> list=facdao.getFaculty();    
        m.addAttribute("list",list);  
        return "School/view_faculty";    
    }
    
    /********* 
     * Save New Student 
     * @param st
     * @return 
     ********/
    @RequestMapping(value="savestudent",method = RequestMethod.POST)    
    public String saveStudent(@ModelAttribute("st") Student st){    
        stdao.saveStudent(st);    
        return "redirect:/School/view_students";    
    }
    
    /****** 
     * View Students 
     * @param m
     * @return 
     ********/
    @RequestMapping(value="view_students")    
    public String view_students(Model m){    
        List<Student> list=stdao.getStudent();    
        m.addAttribute("list",list);  
        return "School/view_students";    
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
    
    @ModelAttribute("subject")
    public String[] getSubjects(HttpSession session)
    {
        int id = Integer.parseInt(session.getAttribute("id").toString());
        School school=scldao.getSchoolById(id);
        String[] medium = school.getMedium().split(",");
        return medium;
    }
}
