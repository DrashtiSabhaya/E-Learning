package Controller;

import Bean.Admin;
import Bean.Feedback;
import Bean.Login;
import Bean.School;
import Dao.AdminDao;
import Dao.FeedbackDao;
import Dao.SchoolDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Drashti
 */
@Controller
@RequestMapping(value = "Admin")
public class AdminController {
    @Autowired    
    AdminDao admindao;
    @Autowired    
    FeedbackDao fbdao;
    @Autowired    
    SchoolDao scldao;
    @Autowired
    private JavaMailSender mailSender;
    
    
    /*********** 
     * @name Login
     * @return  
     ************/
    @RequestMapping(value="login",method = RequestMethod.GET)
    public String login()
    {
        return "Admin/login";
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
        Admin admin = admindao.validateAdmin(login);
        if (null != admin) {
            session.setAttribute("username", admin.getUsername());
            session.setAttribute("id",admin.getId());
            return "redirect:/Admin/index";
        } else {
            modelMap.put("error", "Invalid Username or Password !");
            return "Admin/login";
        }
    }
    /*********** 
     * @name Home Page
     * @return  
     ************/
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String admin_home()
    {
        return "Admin/index";
    }
    /*********** 
     *@name  School Request
     * @param m
     * @return  
     ************/
    @RequestMapping(value="view_request",method = RequestMethod.GET)
    public String view_request(Model m)
    {
        List<School> list=scldao.getSchoolRequest();    
        m.addAttribute("list",list); 
        return "Admin/view_request";
    }
    /***********
     * @param request
     * @name School Request Approve    
     * @param session    
     * @return  
     ************/    
    @RequestMapping(value="/approve",method = RequestMethod.GET)    
    public String approve(HttpServletRequest request,HttpSession session){    
        int id = Integer.parseInt(request.getParameter("id"));
        String recipientAddress =  request.getParameter("email");
        String name = request.getParameter("name");
        String subject = "Learn Portal: Access Request Approved";
        String message = "Dear Mr/Ms "+name+",\n\n"+
                "Congratulations! your request for access Learn Portal Platform is Approved!. Now, You can Manage your school with Us.\n"+
                "If you have any further Queries kindly contact us at learnportal1@gmail.com.\n"+
                "Thank you!\n\n"
                + "Regards,\nLearn Team\nlearnportal1@gmail.com";
        
        System.out.println("To: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message);
         
        // sends the e-mail
        mailSender.send(email);         
        session.setAttribute("mailstatus", "Request Approval Mail is Sent Sucessfully");
        
        scldao.updateStatus(id); 
        session.setAttribute("message", "Request Approved");
        return "redirect:/Admin/view_request";    
    } 
    /********** 
     * Reject Mail
     * @param request
     * @param session
     * @return  
     **********/
    @RequestMapping(value="sendEmail",method = RequestMethod.POST)
    public String doSendEmail(HttpServletRequest request, HttpSession session) {
        // takes input from e-mail form
        String recipientAddress = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
         
        // prints debug info
        System.out.println("To: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
         
        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message);
        
        // sends the e-mail
        mailSender.send(email);
         
        session.setAttribute("mailstatus", "Your Request Rejection Mail is Sent Sucessfully");
        return "redirect:/Admin/view_request";
    }
    /******** 
     * @name Edit School Page
     * @return  
     *********/
    @RequestMapping(value="edit_school",method = RequestMethod.GET)
    public String edit_school()
    {
        return "Admin/edit_school";
    }
    /***********
     * @name Edit School
     * @param request    
     * @param m    
     * @return  
     ************/    
    @RequestMapping(value="/editschool", method = RequestMethod.GET)    
    public String editSchool(HttpServletRequest request, Model m){  
        int id = Integer.parseInt(request.getParameter("id"));
        School school=scldao.getSchoolById(id);
        m.addAttribute("school",school);
        return "Admin/edit_school";    
    }
    /********* 
     * @name Save Updates for School 
     * @param school
     * @param modelMap
     * @return 
     *********/
    @RequestMapping(value="/saveupdate", method = RequestMethod.POST)    
    public String editSave(@ModelAttribute("school") School school, ModelMap modelMap){  
        int id = scldao.saveUpdate(school);
        if(id>0)    
            modelMap.put("message", "School is Updated!");
        else
            modelMap.put("error", "School Updation failed!");
        return "Admin/edit_school";    
    }
    /*********** 
     * @name List School
     * @param m    
     * @return  
     ************/    
    @RequestMapping(value="list_school",method = RequestMethod.GET)    
    public String view_school(Model m){    
        List<School> list=scldao.getSchool();    
        m.addAttribute("list",list);  
        return "Admin/list_school";    
    }
    /***********
     * @param session
     * @name School Delete
     * @param request
     * @return  
     *********/
    @RequestMapping(value="/deleteschool", method = RequestMethod.GET)    
    public String deleteSchool(HttpServletRequest request, HttpSession session){  
        int id = Integer.parseInt(request.getParameter("id"));
        int r=scldao.deleteSchool(id);
        if(r>0)
            session.setAttribute("message","School is Deleted!");
        else
            session.setAttribute("error","School is not Deleted!");
        return "redirect:/Admin/list_school";    
    }
    /*********** 
     * @name Client Feedback
     * @param m    
     * @return  
     ************/    
    @RequestMapping(value="feedback",method = RequestMethod.GET)    
    public String view_feedback(Model m){    
        List<Feedback> list=fbdao.getFeedback();    
        m.addAttribute("list",list); 
        return "Admin/feedback";    
    }
    /*********** 
     * @name Delete Feedback 
     * @param request
     * @param session
     * @return 
     **********/
    @RequestMapping(value="/deletefeedback", method = RequestMethod.GET)    
    public String deleteFeedback(HttpServletRequest request, HttpSession session){  
        int id = Integer.parseInt(request.getParameter("id"));
        int r=fbdao.deleteFeedback(id);
        if(r>0)
            session.setAttribute("message","Feedback is Deleted!");
        else
            session.setAttribute("error","Feedback is not Deleted!");
        return "redirect:/Admin/feedback";    
    }
    /*********** 
     * @name Logout
     * @param session    
     * @return  
     ************/    
    @RequestMapping(value="logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("id");
        return "redirect:/Admin/login";
    }
}
