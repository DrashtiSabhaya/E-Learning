/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Controller;

import Bean.Assignment;
import Bean.Content;
import Bean.Subject;
import Bean.SubjectAssign;
import Bean.Video;
import Dao.AssignmentDao;
import Dao.ClassDao;
import Dao.ContentDao;
import Dao.SubjectAssignDao;
import Dao.SubjectDao;
import Dao.VideoDao;
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
@RequestMapping(value = "Faculty")
public class FacultyController {
    
    @Autowired
            AssignmentDao astdao;
    @Autowired
            ClassDao clsdao;
    @Autowired
            VideoDao vidao;
    @Autowired
            ContentDao ctdao;
    @Autowired
            SubjectAssignDao assigndao;
    @Autowired
            SubjectDao subdao;
    
    public static String UPLOAD_DIRECTORY="resources/upload-material";
    
    @RequestMapping(value="faculty_home",method = RequestMethod.GET)
    public String view_class(Model m, HttpSession session){
        List<SubjectAssign> list=assigndao.getAssignedSubjectsByFaculty(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/faculty_home";
    }
    
    @RequestMapping(value="add_video",method = RequestMethod.GET)
    public String add_video(){
        return "Faculty/add_video";
    }
    
    @RequestMapping(value="/addvideo",method = RequestMethod.POST)
    public String saveVideo(@ModelAttribute("vid") Video vid,HttpSession session){
        Subject subject = new Subject();
        subject.setMedium(vid.getMedium());
        subject.setName(vid.getSubject());
        subject.setSchool_id(Integer.parseInt(session.getAttribute("school_id").toString()));
        subject.setStandard(vid.getStandard());
        subject = subdao.checkSubject(subject);
        vid.setSubject_id(subject.getId());
        vidao.saveVideo(vid);
        return "redirect:/Faculty/view_video";
    }
    @RequestMapping(value="view_video")
    public String view_video(Model m, HttpSession session){
        List<Video> list=vidao.getVideo(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/view_video";
    }
    
    @RequestMapping(value="add_content",method = RequestMethod.GET)
    public String add_content(){
        return "Faculty/add_content";
    }
    
    @RequestMapping(value="addcontent",method = RequestMethod.POST)
    public String saveContent(HttpSession session ,HttpServletRequest request,@RequestParam CommonsMultipartFile file) throws FileNotFoundException, IOException{
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        int std = Integer.parseInt(request.getParameter("standard"));
        String medium = request.getParameter("medium");
        String sub = request.getParameter("subject");
        String topic = request.getParameter("topic");
        
        Content ct=new Content();
        Subject subject = new Subject();
        subject.setMedium(medium);
        subject.setName(sub);
        subject.setSchool_id(school_id);
        subject.setStandard(std);
        subject = subdao.checkSubject(subject);
        
        ct.setSchool_id(school_id);
        ct.setFaculty(session.getAttribute("faculty").toString());
        ct.setFaculty_id(Integer.parseInt(session.getAttribute("id").toString()));
        ct.setStandard(std);
        ct.setMedium(medium);
        ct.setSubject(sub);
        ct.setSubject_id(subject.getId());
        ct.setTopic(topic);
        
        ServletContext context = session.getServletContext();
        String path = context.getRealPath(UPLOAD_DIRECTORY);
        String filename = file.getOriginalFilename();
        
        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(new File(path + File.separator+subject.getId()+ filename)));
        stream.write(bytes);
        stream.flush();
        stream.close();
        
        ct.setFilename(subject.getId()+filename);
        
        ctdao.saveContent(ct);
        return "redirect:/Faculty/view_material";
    }
    
    @RequestMapping(value="view_material")
    public String view_content(Model m,HttpSession session){
        List<Content> list=ctdao.getContent(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/view_material";
    }
    
    @RequestMapping(value="/assignment",method = RequestMethod.GET)
    public String assignment(){
        return "Faculty/assignment";
    }
    
    @RequestMapping(value="/add_assignment",method = RequestMethod.POST)
    public String saveAssignment(HttpSession session ,HttpServletRequest request,@RequestParam CommonsMultipartFile file) throws FileNotFoundException, IOException{
        Assignment ast=new Assignment();
        
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        int std = Integer.parseInt(request.getParameter("standard"));
        String medium = request.getParameter("medium");
        String sub = request.getParameter("subject");
        String topic = request.getParameter("topic");
        String due_date = request.getParameter("duedate");
        
        Subject subject = new Subject();
        subject.setMedium(medium);
        subject.setName(sub);
        subject.setSchool_id(school_id);
        subject.setStandard(std);
        subject = subdao.checkSubject(subject);
        
        ast.setSchool_id(school_id);
        ast.setFaculty(session.getAttribute("faculty").toString());
        ast.setFaculty_id(Integer.parseInt(session.getAttribute("id").toString()));
        ast.setStandard(std);
        ast.setMedium(medium);
        ast.setSubject(sub);
        ast.setSubject_id(subject.getId());
        ast.setTopic(topic);
        ast.setDuedate(due_date);
        
        ServletContext context = session.getServletContext();
        String path = context.getRealPath(UPLOAD_DIRECTORY);
        String filename = file.getOriginalFilename();
        
        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(new File(path + File.separator+"assignment_"+ filename)));
        stream.write(bytes);
        stream.flush();
        stream.close();
        
        ast.setFilename("assignment_"+filename);
        
        astdao.saveAssignment(ast);
        return "redirect:/Faculty/view_assignment";
    }
    
    @RequestMapping(value="view_assignment")
    public String view_assignment(Model m,HttpSession session){
        List<Assignment> list=astdao.getAssignement(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/view_assignment";
    }
    
    @RequestMapping(value="review",method = RequestMethod.GET)
    public String review(){
        return "Faculty/review";
    }
    @RequestMapping(value="check_assignment",method = RequestMethod.POST)
    public String checkAssignment(Model m,HttpServletRequest request,HttpSession session){
        int topic = Integer.parseInt(request.getParameter("topic"));
        List<Assignment> list=astdao.getAssignement(Integer.toString(topic));
        if(session.getAttribute("assignid")!=null)
        {
            session.removeAttribute("assignid");
        }
        session.setAttribute("assignid", 1);
        m.addAttribute("list",list);
        return "Faculty/check_assignment";
    }
    /*****
     * Standards
     * @param session
     * @return
     ******/
    @ModelAttribute("standard")
    public List<String> getFacultyStandardList(HttpSession session)
    {
        List<SubjectAssign> list=assigndao.getAssignedSubjectsByFaculty(session.getAttribute("id").toString());
        List<String> standard=new ArrayList<String>();
        for(SubjectAssign std:list)
        {
            standard.add(Integer.toString(std.getStandard()));
        }
        return standard;
    }
    
    /*******
     * Mediums
     * @param session
     * @return
     *******/
    @ModelAttribute("medium")
    public List<String> getMediums(HttpSession session)
    {
        List<SubjectAssign> list=assigndao.getAssignedSubjectsByFaculty(session.getAttribute("id").toString());
        List<String> medium=new ArrayList<String>();
        for(SubjectAssign std:list)
        {
            if(!medium.contains(std.getMedium()))
                medium.add(std.getMedium());
        }
        return medium;
    }
    
    @ModelAttribute("subject")
    public List<String> getSubjects(HttpSession session)
    {
        List<SubjectAssign> list=assigndao.getAssignedSubjectsByFaculty(session.getAttribute("id").toString());
        List<String> subject=new ArrayList<String>();
        for(SubjectAssign sub:list)
        {
            if(!subject.contains(sub.getSubject()))
                subject.add(sub.getSubject());
        }
        return subject;
    }
    
    @ModelAttribute("topic")
    public Map<String,String> getTopics(HttpSession session)
    {
        List<Assignment> list=astdao.getAssignement(session.getAttribute("id").toString());
        Map<String,String> topic=new HashMap<String,String>();
        for(Assignment sub:list)
        {
            topic.put(Integer.toString(sub.getId()),sub.getTopic());
        }
        return topic;
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
        return "redirect:/login";
    }
}
