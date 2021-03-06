/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Controller;

import Bean.Assignment;
import Bean.Content;
import Bean.DiscussionForum;
import Bean.SubjectAssign;
import Bean.UploadAssignment;
import Bean.Video;
import Dao.AssignmentDao;
import Dao.ClassDao;
import Dao.ContentDao;
import Dao.DiscussionDao;
import Dao.SubjectAssignDao;
import Dao.SubjectDao;
import Dao.UploadAssignmentDao;
import Dao.VideoDao;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    @Autowired
            UploadAssignmentDao uploadassigndao;
    @Autowired
            DiscussionDao dfdao;

    
    public static String UPLOAD_DIRECTORY="resources/upload-material";
    
    /********
     * Faculty Home
     * @return
     *********/
    @RequestMapping(value="faculty_home",method = RequestMethod.GET)
    public String view_class(Model m, HttpSession session){
        List<SubjectAssign> list=assigndao.getAssignedSubjectsByFaculty(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/faculty_home";
    }
    
    /********
     * Add Video
     * @return
     *********/
    @RequestMapping(value="add_video",method = RequestMethod.GET)
    public String add_video(){
        return "Faculty/add_video";
    }
    
    /********
     * Save Video
     * @param vid
     * @param session
     * @return
     *********/
    @RequestMapping(value="/addvideo",method = RequestMethod.POST)
    public String saveVideo(@ModelAttribute("vid") Video vid,HttpSession session){
        SubjectAssign subject = new SubjectAssign();
        subject.setSchool_id(Integer.parseInt(session.getAttribute("school_id").toString()));
        subject.setStandard(vid.getStandard());
        subject.setMedium(vid.getMedium());
        subject.setSubject(vid.getSubject());
        subject.setFaculty_id(Integer.parseInt(session.getAttribute("id").toString()));
        subject = assigndao.checkAssignSubject(subject);
        if(subject == null)
        {
            session.setAttribute("error", "Subject is not Assigned to Logged In Faculty");
            return "Faculty/add_video";
        }
        vid.setSubject_id(subject.getSubject_id());
        vidao.saveVideo(vid);
        session.setAttribute("message", "Video Details is Saved");
        return "redirect:/Faculty/view_video";
    }
    
    /********
     * View Video
     * @param m
     * @param session
     * @return
     *********/
    @RequestMapping(value="view_video")
    public String view_video(Model m, HttpSession session){
        List<Video> list=vidao.getVideo(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/view_video";
    }
    
    /********
     * View Video Comments
     * @param m
     * @param session
     * @param request
     * @return
     *********/
    @RequestMapping(value="viewcomments")
    public String view_comments(Model m, HttpSession session, HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        List<DiscussionForum> list=dfdao.getComments(id);
        m.addAttribute("list",list);
        return "Faculty/viewcomments";
    }
    
    /********
     * Delete Video
     * @param m
     * @param session
     * @param request
     * @return
     *********/
    @RequestMapping(value="deletevid",method = RequestMethod.GET)
    public String deleteVideo(Model m, HttpSession session, HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        int r=vidao.deleteVideo(id);
        if(r>0)
            session.setAttribute("message","Video Details is Deleted!");
        else
            session.setAttribute("error","Video Details is not Deleted!");
        return "redirect:/Faculty/view_video";
    }
    
    /********
     * Add Material
     * @return
     *********/
    @RequestMapping(value="add_content",method = RequestMethod.GET)
    public String add_content(){
        return "Faculty/add_content";
    }
    
    /********
     * Save Material
     * @param session
     * @param request
     * @param file
     * @return
     * @throws java.io.FileNotFoundException
     *********/
    @RequestMapping(value="addcontent",method = RequestMethod.POST)
    public String saveContent(HttpSession session ,HttpServletRequest request,@RequestParam CommonsMultipartFile file) throws FileNotFoundException, IOException{
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        int std = Integer.parseInt(request.getParameter("standard"));
        String medium = request.getParameter("medium");
        String sub = request.getParameter("subject");
        String topic = request.getParameter("topic");
        
        Content ct=new Content();
        SubjectAssign subject = new SubjectAssign();
        subject.setSchool_id(school_id);
        subject.setStandard(std);
        subject.setMedium(medium);
        subject.setSubject(sub);
        subject.setFaculty_id(Integer.parseInt(session.getAttribute("id").toString()));
        subject = assigndao.checkAssignSubject(subject);
        if(subject == null)
        {
            session.setAttribute("error", "Subject is not Assigned to Logged In Faculty");
            return "Faculty/add_content";
        }
        
        ct.setSchool_id(school_id);
        ct.setFaculty(session.getAttribute("faculty").toString());
        ct.setFaculty_id(Integer.parseInt(session.getAttribute("id").toString()));
        ct.setStandard(std);
        ct.setMedium(medium);
        ct.setSubject(sub);
        ct.setSubject_id(subject.getSubject_id());
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
        session.setAttribute("message", "Subject Material Details is Saved");
        return "redirect:/Faculty/view_material";
    }
    
    /********
     * View Material
     * @param m
     * @param session
     * @return
     *********/
    @RequestMapping(value="view_material")
    public String view_content(Model m,HttpSession session){
        List<Content> list=ctdao.getContent(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/view_material";
    }
    
    /********
     * Delete Material
     * @param m
     * @param session
     * @param request
     * @return
     *********/
    @RequestMapping(value="deletematerial",method = RequestMethod.GET)
    public String deleteMaterial(Model m, HttpSession session,HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        int r=ctdao.deleteContent(id);
        if(r>0)
            session.setAttribute("message","Material Details is Deleted!");
        else
            session.setAttribute("error","Material Details is not Deleted!");
        return "redirect:/Faculty/view_material";
    }
    
    /********
     * Add Assignment
     * @return
     *********/
    @RequestMapping(value="/assignment",method = RequestMethod.GET)
    public String assignment(){
        return "Faculty/assignment";
    }
    
    /********
     * Save Assignment
     * @param session
     * @param request
     * @param file
     * @return
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     *********/
    @RequestMapping(value="/add_assignment",method = RequestMethod.POST)
    public String saveAssignment(HttpSession session ,HttpServletRequest request,@RequestParam CommonsMultipartFile file) throws FileNotFoundException, IOException{
        Assignment ast=new Assignment();
        
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        int std = Integer.parseInt(request.getParameter("standard"));
        String medium = request.getParameter("medium");
        String sub = request.getParameter("subject");
        String topic = request.getParameter("topic");
        String due_date = request.getParameter("duedate");
        
        SubjectAssign subject = new SubjectAssign();
        subject.setSchool_id(school_id);
        subject.setStandard(std);
        subject.setMedium(medium);
        subject.setSubject(sub);
        subject.setFaculty_id(Integer.parseInt(session.getAttribute("id").toString()));
        subject = assigndao.checkAssignSubject(subject);
        if(subject == null)
        {
            session.setAttribute("error", "Subject is not Assigned to Logged In Faculty");
            return "Faculty/assignment";
        }
        
        ast.setSchool_id(school_id);
        ast.setFaculty(session.getAttribute("faculty").toString());
        ast.setFaculty_id(Integer.parseInt(session.getAttribute("id").toString()));
        ast.setStandard(std);
        ast.setMedium(medium);
        ast.setSubject(sub);
        ast.setSubject_id(subject.getSubject_id());
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
        session.setAttribute("message", "Subject Assignment Details is Saved");
        return "redirect:/Faculty/view_assignment";
    }
    
    /********
     * View Assignment
     * @param m
     * @param session
     * @return
     *********/
    @RequestMapping(value="view_assignment")
    public String view_assignment(Model m,HttpSession session){
        List<Assignment> list=astdao.getAssignement(session.getAttribute("id").toString());
        m.addAttribute("list",list);
        return "Faculty/view_assignment";
    }
    
    /********
     * View Student Assignment
     * @return
     *********/
    @RequestMapping(value="review",method = RequestMethod.GET)
    public String review(){
        return "Faculty/review";
    }
    
    /********
     * Check Student Assignment
     * @param m
     * @param request
     * @param session
     * @return
     *********/
    @RequestMapping(value="check_assignment",method = RequestMethod.POST)
    public String checkAssignment(Model m,HttpServletRequest request,HttpSession session){
        
        int std = Integer.parseInt(request.getParameter("standard"));
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        String medium = request.getParameter("medium");
        String sub = request.getParameter("subject");
        String topic = request.getParameter("topic");
        
        Assignment ast=astdao.getAssignmentByTopic(std,school_id,medium, sub,topic);
        if(ast==null)
        {
            session.setAttribute("error", "Please Select Valid Subject and Assignment");
            return "Faculty/review";
        }
        int id = ast.getId();
        List<UploadAssignment> list=uploadassigndao.getAssignementAssignId(Integer.toString(id));
        m.addAttribute("list",list);
        return "Faculty/check_assignment";
    }
    
    /********
     * Add Remarks in Student Assignment
     * @param request
     * @param session
     * @return
     *********/
    @RequestMapping(value="addremarks", method = RequestMethod.POST)
    public String addRemarks(HttpServletRequest request, HttpSession session)
    {
        int id = Integer.parseInt(request.getParameter("id"));
        String remarks = request.getParameter("remarks");
        uploadassigndao.updateAssignmentStatus(id,remarks);
        session.setAttribute("message", "Assignment marked as Checked");
        return "Faculty/check_assignment";
    }
    
    /********
     * Download Student Assignment
     * @param response
     * @param request
     * @param session
     * @return
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     *********/
    @RequestMapping(value="downloadassign",method = RequestMethod.GET)
    public String download(HttpServletResponse response,HttpServletRequest request,HttpSession session) throws FileNotFoundException, IOException
    {
        String fname = request.getParameter("filename");
        ServletContext context = session.getServletContext();
        String path = context.getRealPath("resources/upload-assignments");
        PrintWriter out = response.getWriter();
        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition","attachment; filename=\"" + fname + "\"");
        FileInputStream fileInputStream = new FileInputStream(path +"/"+fname);
        int i;
        while ((i=fileInputStream.read()) != -1)
        {
            out.write(i);
        }
        fileInputStream.close();
        out.close();
        return "check_assignment";
    }
    
    /********
     * Delete Assignment
     * @return
     *********/
    @RequestMapping(value="deleteassign",method = RequestMethod.GET)
    public String deleteAssignent(Model m, HttpSession session,HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        int r=astdao.deleteAssignment(id);
        if(r>0)
            session.setAttribute("message","Assignment Details is Deleted!");
        else
            session.setAttribute("error","Assignment Details is not Deleted!");
        return "redirect:/Faculty/view_assignment";
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
            if(!standard.contains(Integer.toString(std.getStandard())))
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
    
    /********
     * Subjects
     * @param session
     * @return
     *********/
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
    
    /********
     * Assignment Topic
     * @param session
     * @return
     *********/
    @ModelAttribute("topic")
    public List<String> getAssignmentTopic(HttpSession session)
    {
        List<Assignment> list=astdao.getAssignement(session.getAttribute("id").toString());
        List<String> topic=new ArrayList<String>();
        for(Assignment sub:list)
        {
            if(!topic.contains(sub.getTopic()))
                topic.add(sub.getTopic());
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
