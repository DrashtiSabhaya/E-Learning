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
import static Controller.FacultyController.UPLOAD_DIRECTORY;
import Dao.AssignmentDao;
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
@RequestMapping(value = "Student")
public class StudentController {
    @Autowired
            SubjectDao subdao;
    @Autowired
            VideoDao vidao;
    @Autowired
            AssignmentDao astdao;
    @Autowired
            ContentDao ctdao;
    @Autowired
            DiscussionDao dfdao;
    @Autowired
            SubjectAssignDao assigndao;
    @Autowired
            UploadAssignmentDao uploadassigndao;
    
    public static String UPLOAD_DIRECTORY="resources/upload-assignments";
    
    /********
     * Student Home
     * @return
     *********/
    @RequestMapping(value="student_home",method = RequestMethod.GET)
    public String student_home(){
        return "Student/student_home";
    }
    
    /********
     * View Subject
     * @param session
     * @param m
     * @return
     *********/
    @RequestMapping(value="student_subjects",method = RequestMethod.GET)
    public String studSubjects(HttpSession session,Model m){
        int id = Integer.parseInt(session.getAttribute("standard").toString());
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        String medium = session.getAttribute("medium").toString();
        List<SubjectAssign> list = assigndao.getSubjectsByStd(id,school_id,medium);
        m.addAttribute("list",list);
        return "Student/student_subjects";
    }
    
    /**
     * @param request
     * @param session
     * @return
     */
    @RequestMapping(value="view_subject_content", method = RequestMethod.GET)
    public String viewSubjectContent(HttpServletRequest request,HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        String subjectName = request.getParameter("name");
        session.setAttribute("sub_name",subjectName);
        session.setAttribute("sub_id",id);
        return "Student/view_subject_content";
    }
    
    /***********
     * Assignment topic
     * @param session
     * @return
     ************/
    @ModelAttribute("topic_list")
    public List<Video> topicList(HttpSession session){
        int id = 1;
        if (session.getAttribute("sub_id")!=null)
            id = Integer.parseInt(session.getAttribute("sub_id").toString());
        List<Video> video = vidao.getVideoBySubjectId(id);
        return video;
    }
    
    /********
     * View Videos
     * @param request
     * @param map
     * @param m
     * @param session
     * @return
     *********/
    @RequestMapping(value="view_video", method = RequestMethod.GET)
    public String view_video(HttpServletRequest request, ModelMap map, Model m,HttpSession session){
        String videoId = request.getParameter("id");
        Video video;
        if(videoId.equals("vid1"))
        {
            int id = Integer.parseInt(session.getAttribute("sub_id").toString());
            video = vidao.getVideoBySubjectId(id).get(0);
        }
        else
        {
            int id = Integer.parseInt(videoId);
            video = vidao.getVideoById(id);
        }
        List<DiscussionForum> list=dfdao.getComments(video.getId());
        if(list.size()>0)
            m.addAttribute("commentlist",list);
        else
            map.put("nocomment","No Comments Available!");
        map.put("topic", video.getTopic());
        map.put("link",video.getLink());
        map.put("videoid",video.getId());
        return "Student/view_video";
    }
    
    /********
     * Save Discussion Comment
     * @param df
     * @return
     *********/
    @RequestMapping(value="savecomment",method = RequestMethod.POST)
    public String saveComment(@ModelAttribute("df") DiscussionForum df){
        dfdao.saveComment(df);
        return "Student/view_video";
    }
    
    /********
     * View Material
     * @param m
     * @param session
     * @return
     *********/
    @RequestMapping(value="view_material")
    public String view_content(Model m, HttpSession session){
        String id = session.getAttribute("sub_id").toString();
        List<Content> list=ctdao.getContentBySubject(id);
        m.addAttribute("list",list);
        return "Student/view_material";
    }
    
    /********
     * Download Material
     * @param response
     * @param request
     * @param session
     * @return
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     *********/
    @RequestMapping(value="downloadmaterial",method = RequestMethod.GET)
    public String downloadMaterial(HttpServletResponse response,HttpServletRequest request,HttpSession session) throws FileNotFoundException, IOException
    {
        String fname = request.getParameter("filename");
        ServletContext context = session.getServletContext();
        String path = context.getRealPath("resources/upload-material");
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
        return "Student/view_material";
    }
    
    /********
     * View Assignment
     * @param m
     * @param session
     * @return
     *********/
    @RequestMapping(value="view_assignment")
    public String view_assignment(Model m,HttpSession session){
        String id = session.getAttribute("sub_id").toString();
        List<Assignment> list=astdao.getAssignementBySubject(id);
        m.addAttribute("list",list);
        return "Student/view_assignment";
    }
    
    /********
     * Uploaded Assignment
     * @return
     *********/
    @RequestMapping(value="upload_assign",method = RequestMethod.GET)
    public String studAssignments(){
        return "Student/upload_assign";
    }
    
    /********
     * Download Assignment
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
        String path = context.getRealPath("resources/upload-material");
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
        return "view_assignment";
    }
    
    /********
     * Subject
     * @param session
     * @return
     *********/
    @ModelAttribute("subject")
    public List<String> getSubjects(HttpSession session)
    {
        int id = Integer.parseInt(session.getAttribute("standard").toString());
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        String medium = session.getAttribute("medium").toString();
        List<SubjectAssign> list = assigndao.getSubjectsByStd(id,school_id,medium);
        List<String> subject=new ArrayList<String>();
        for(SubjectAssign sub:list)
        {
            if(!subject.contains(sub.getSubject()))
                subject.add(sub.getSubject());
        }
        return subject;
    }
    
    /********
     * Subject Topic
     * @return
     *********/
    @ModelAttribute("topic")
    public List<String> getAssignmentTopic(HttpSession session)
    {
        int id = Integer.parseInt(session.getAttribute("standard").toString());
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        String medium = session.getAttribute("medium").toString();
        List<Assignment> list = astdao.getAssignmentByStd(id,school_id,medium);
        List<String> topic=new ArrayList<String>();
        for(Assignment sub:list)
        {
            if(!topic.contains(sub.getTopic()))
                topic.add(sub.getTopic());
        }
        return topic;
    }
    
    /********
     * Upload Assignment
     * @param session
     * @param request
     * @param file
     * @return
     * @throws java.io.FileNotFoundException
     *********/
    @RequestMapping(value="/uploadassign",method = RequestMethod.POST)
    public String saveAssignment(HttpSession session ,HttpServletRequest request,@RequestParam CommonsMultipartFile file) throws FileNotFoundException, IOException{
        
        int stud_id = Integer.parseInt(session.getAttribute("id").toString());
        int std = Integer.parseInt(session.getAttribute("standard").toString());
        int school_id = Integer.parseInt(session.getAttribute("school_id").toString());
        String medium = session.getAttribute("medium").toString();
        String sub = request.getParameter("subject");
        String topic = request.getParameter("topic");
        
        Assignment ast=astdao.getAssignmentByTopic(std,school_id,medium, sub,topic);
        if(ast==null)
        {
            session.setAttribute("error", "Please Select Valid Subject and Assignment");
            return "Student/upload_assign";
        }
        
        UploadAssignment subject = new UploadAssignment();
        subject.setSchool_id(school_id);
        subject.setSubject(sub);
        subject.setTopic(topic);
        subject.setAssign_id(ast.getId());
        subject.setStudent_id(stud_id);
        
        ServletContext context = session.getServletContext();
        String path = context.getRealPath(UPLOAD_DIRECTORY);
        String filename = file.getOriginalFilename();
        
        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(new File(path + File.separator+"upload_"+stud_id+filename)));
        stream.write(bytes);
        stream.flush();
        stream.close();
        
        subject.setFilename("upload_"+stud_id+filename);
        
        uploadassigndao.saveUploadAssignment(subject);
        session.setAttribute("message", "Your Assignment is Submitted");
        return "redirect:/Student/upload_assign";
    }
    
    /********
     * View Uploaded Assignment
     * @param m
     * @param session
     * @return
     *********/
    @RequestMapping(value="uploaded_assignment")
    public String viewUploadedAssignment(Model m,HttpSession session){
        String id = session.getAttribute("id").toString();
        List<UploadAssignment> list=uploadassigndao.getAssignementByStudent(id);
        m.addAttribute("list",list);
        return "Student/uploaded_assignment";
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
        session.removeAttribute("standard");
        session.removeAttribute("school_id");
        session.removeAttribute("medium");
        return "redirect:/login";
    }
}
