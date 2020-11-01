package Controller;

import Bean.Admin;
import Bean.Feedback;
import Bean.Login;
import Bean.MailInfo;
import Bean.School;
import Bean.SchoolList;
import Dao.AdminDao;
import Dao.FeedbackDao;
import Dao.MailInfoDao;
import Dao.SchoolDao;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
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
            MailInfoDao maildao;
    @Autowired
    private JavaMailSender mailSender;
    
    
    /***********
     * Login
     * @return
     ************/
    @RequestMapping(value="login",method = RequestMethod.GET)
    public String login()
    {
        return "Admin/login";
    }
    
    /***********
     * Login Check
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
     * Home Page
     * @param modelMap
     * @return
     ************/
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String admin_home(ModelMap modelMap,Model m)
    {
        List<School> pending=scldao.getSchool(0);
        List<School> accepted=scldao.getSchool(1);
        List<School> rejected=scldao.getSchool(2);
        List<SchoolList> mschool = scldao.getSchoolList("month");
        List<SchoolList> yschool = scldao.getSchoolList("year");
        
        modelMap.put("pending", pending.size());
        modelMap.put("accepted", accepted.size());
        modelMap.put("rejected", rejected.size());
        m.addAttribute("mlist",mschool);
        m.addAttribute("ylist",yschool);
        
        return "Admin/index";
    }
    
    /***********
     * School Request
     * @param m
     * @return
     ************/
    @RequestMapping(value="view_request",method = RequestMethod.GET)
    public String view_request(Model m)
    {
        List<School> list=scldao.getSchool(0);
        m.addAttribute("list",list);
        return "Admin/view_request";
    }
    
    /***********
     * School Rejected Request
     * @param m
     * @return
     ************/
    @RequestMapping(value="view_rejected_request",method = RequestMethod.GET)
    public String view_rejected_request(Model m)
    {
        List<School> list=scldao.getSchool(2);
        m.addAttribute("list",list);
        return "Admin/view_rejected_request";
    }
    
    /***********
     * School Request Approve
     * @param request
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
        
        mailSender.send(email);
        
        MailInfo mailinfo = new MailInfo();
        mailinfo.setSchool_id(id);
        mailinfo.setMailto(recipientAddress);
        mailinfo.setSubject(subject);
        mailinfo.setMessage(message);
        maildao.saveMail(mailinfo);
        
        session.setAttribute("mailstatus", "Request Approval Mail is Sent Sucessfully");
        
        scldao.updateStatus(id,1);
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
        int id = Integer.parseInt(request.getParameter("id"));
        String recipientAddress = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        
        System.out.println("To: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message);
        
        mailSender.send(email);
        
        MailInfo mailinfo = new MailInfo();
        mailinfo.setSchool_id(id);
        mailinfo.setMailto(recipientAddress);
        mailinfo.setSubject(subject);
        mailinfo.setMessage(message);
        maildao.saveMail(mailinfo);
        
        scldao.updateStatus(id,2);
        session.setAttribute("mailstatus", "Your Request Rejection Mail is Sent Sucessfully");
        return "redirect:/Admin/view_request";
    }
    
    /********
     * Edit School Page
     * @return
     *********/
    @RequestMapping(value="edit_school",method = RequestMethod.GET)
    public String edit_school()
    {
        return "Admin/edit_school";
    }
    
    /***********
     * Edit School
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
     * Save Updates for School
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
     * List School
     * @param m
     * @return
     ************/
    @RequestMapping(value="list_school",method = RequestMethod.GET)
    public String view_school(Model m){
        List<School> list=scldao.getSchool(1);
        m.addAttribute("list",list);
        return "Admin/list_school";
    }
    
    /***********
     * School Delete
     * @param session
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
    
    /*********
     * Mail Information
     * @param m
     * @return
     *********/
    @RequestMapping(value="mailinfo",method = RequestMethod.GET)
    public String view_Mails(Model m){
        List<MailInfo> list=maildao.getMails();
        m.addAttribute("list",list);
        return "Admin/mailinfo";
    }
    
    /***********
     * Client Feedback
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
     * Delete Feedback
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
     * Download PDF Report
     * @param request
     * @param response
     * @throws java.io.IOException
     *************/
    @RequestMapping(value = "/downloadPdf")
    public void downloadPDF(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        final ServletContext servletContext = request.getSession().getServletContext();
        final File tempDirectory = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
        final String temperotyFilePath = tempDirectory.getAbsolutePath();
        
        String fileName = "LearnPortal.pdf";
        response.setContentType("application/pdf");
        response.setHeader("Content-disposition", "attachment; filename="+ fileName);
        
        List<School> pending=scldao.getSchool(0);
        List<School> accepted=scldao.getSchool(1);
        List<School> rejected=scldao.getSchool(2);
        
        try {
            CreatePDF.createPDF(temperotyFilePath+"\\"+fileName, pending, accepted, rejected);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos = convertPDFToByteArrayOutputStream(temperotyFilePath+"\\"+fileName);
            OutputStream os = response.getOutputStream();
            baos.writeTo(os);
            os.flush();
        } catch (IOException e) {
            System.out.println("Exception = "+e);
        }
    }
    
    private ByteArrayOutputStream convertPDFToByteArrayOutputStream(String fileName) {
        InputStream inputStream = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            inputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[1024];
            baos = new ByteArrayOutputStream();
            
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception = "+e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Exception = "+e);
                }
            }
        }
        return baos;
    }
    
    /*********
     * Download Excel(XLS) Report
     * @param response
     ********/
    
    @RequestMapping(value = "/downloadXLS")
    public void downloadXLS(HttpServletResponse response) {
        try {
            response.setContentType("application/vnd.ms-excel");
            String reportName = "School_XLS_Report.xls";
            response.setHeader("Content-disposition", "attachment; filename=" + reportName);
            ArrayList<String> rows = new ArrayList<String>();
            rows.add("Id");
            rows.add("\t");
            rows.add("School Name");
            rows.add("\t");
            rows.add("Register No.");
            rows.add("\t");
            rows.add("Email");
            rows.add("\t");
            rows.add("Joined Date");
            rows.add("\n");
            
            int i=0;
            List<School> pending=scldao.getSchool(0);
            List<School> accepted=scldao.getSchool(1);
            List<School> rejected=scldao.getSchool(2);
            for (School school:pending) {
                rows.add(""+(++i));
                rows.add("\t");
                rows.add(school.getName());
                rows.add("\t");
                rows.add(school.getRegisterno());
                rows.add("\t");
                rows.add(school.getEmail());
                rows.add("\t");
                rows.add(school.getDate());
                rows.add("\n");
            }
            for (School school:accepted) {
                rows.add(""+(++i));
                rows.add("\t");
                rows.add(school.getName());
                rows.add("\t");
                rows.add(school.getRegisterno());
                rows.add("\t");
                rows.add(school.getEmail());
                rows.add("\t");
                rows.add(school.getDate());
                rows.add("\n");
            }
            for (School school:rejected) {
                rows.add(""+(++i));
                rows.add("\t");
                rows.add(school.getName());
                rows.add("\t");
                rows.add(school.getRegisterno());
                rows.add("\t");
                rows.add(school.getEmail());
                rows.add("\t");
                rows.add(school.getDate());
                rows.add("\n");
            }
            Iterator<String> iter = rows.iterator();
            while (iter.hasNext()) {
                String outputString = (String) iter.next();
                response.getOutputStream().print(outputString);
            }
            response.getOutputStream().flush();
            
        } catch (IOException e) {
            System.out.println("Exception = "+e);
        }
    }
    
    /***********
     * Logout
     * @param session
     * @return
     ***********/
    @RequestMapping(value="logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("id");
        return "redirect:/Admin/login";
    }
}
