/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Faculty;
import Bean.Feedback;
import Bean.Login;
import Bean.School;
import Bean.Student;
import Dao.FacultyDao;
import Dao.FeedbackDao;
import Dao.SchoolDao;
import Dao.StudentDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * saveFeedback
 * @author Drashti
 */
@Controller
public class ClientController {
    @Autowired    
    FeedbackDao fbdao;
    @Autowired    
    SchoolDao scldao;
    @Autowired
    StudentDao studdao;
    @Autowired
    FacultyDao facdao;
    
    /*********** 
     * Home page
     * @return  
     ************/
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String view_request()
    {
        return "index";
    }
    
    /******* 
     * About us
     * @return  
     *********/
    @RequestMapping(value="about",method = RequestMethod.GET)
    public String aboutUs()
    {
        return "about";
    }
    
    /******** 
     * Contact Us
     * @return  
     *********/
    @RequestMapping(value="contact",method = RequestMethod.GET)
    public String contact()
    {
        return "contact";
    }
    
    /********* 
     * Save Feedback
     * @param fb
     * @param session
     * @return  
     ********/
    @RequestMapping(value="savefeedback", method = RequestMethod.POST)    
    public String saveFeedback(@ModelAttribute("fb") Feedback fb, HttpSession session){    
        fbdao.saveFeedback(fb); 
        session.setAttribute("message","Thank you for your valuable Feedback ");
        return "redirect:/contact";    
    } 
    
    /********** 
     * Login Page
     * @return  
     **********/
    @RequestMapping(value="login",method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }
    
    /*********** 
     * @name Login Check
     * @param request
     * @param response
     * @param session
     * @param modelMap
     * @param login
     * @return  
     *********/
    @RequestMapping(value = "loginCheck", method = RequestMethod.POST)
    public String loginCheck(
            HttpServletRequest request, 
            HttpServletResponse response,
            HttpSession session, ModelMap modelMap,
            @ModelAttribute("login") Login login){
        
        String user = "";
        
        if(request.getParameter("loginas")!=null)
            user=request.getParameter("loginas");
        
        if(user.equals("student"))
        {
            Student student = studdao.validateStudent(login);
            if (null != student) {
                session.setAttribute("username", student.getUsername());
                session.setAttribute("id",student.getId());
                session.setAttribute("standard_id",student.getStandard_id());
                return "redirect:/Student/student_home";
            } else {
                modelMap.put("error", "Invalid Username or Password ");
                return "login";
            }
        }
        
        if(user.equals("teacher"))
        {
            Faculty faculty = facdao.validateFaculty(login);
            if (null != faculty) {
                //session.setAttribute("username", faculty.getUsername());
                session.setAttribute("id",faculty.getId());
                return "redirect:/Faculty/faculty_home";
            } else {
                modelMap.put("error", "Invalid Username or Password ");
                return "login";
            }
        }
        
        if(user.equals("school"))
        {
            School school = scldao.validateSchool(login);
            if (null != school) {
                if(school.getStatus()!= 0 && school.getStatus() != 2){
                    session.setAttribute("username", school.getUsername());
                    session.setAttribute("id",school.getId());
                    return "redirect:/School/school_home";
                }
                else{
                    modelMap.put("error", "Your Access Request is not approved yet");
                    return "login";
                }   
            } else {
                modelMap.put("error", "Invalid Username or Password ");
                return "login";
            }
        }
        modelMap.put("error", "Please Select Valid Option");
        return "login";
    }
    
    /**********
     * School Sign Up Page
     * @return  
     *********/ 
    @RequestMapping(value="signup",method = RequestMethod.GET)
    public String signup()
    {
        return "signup";
    }
    
    /********* 
     * Register School
     * @param scl
     * @param modelMap
     * @return  
     ********/
    @RequestMapping(value="register", method = RequestMethod.POST)    
    public String saveSchool(@ModelAttribute("scl") School scl, ModelMap modelMap){    
        scldao.saveSchool(scl);
        modelMap.put("message", "Thank you for Registration! Admin will allow access Soon.");            
        return "signup";    
    }
    
    /******** 
     * Forgot Password
     * @return  
     *********/
    @RequestMapping(value="forgot",method = RequestMethod.GET)
    public String forgot()
    {
        return "forgot";
    }
}
