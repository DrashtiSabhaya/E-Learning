/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Controller;

import Bean.Assignment;
import Bean.Content;
import Bean.DiscussionForum;
import Bean.Subject;
import Bean.Video;
import Dao.AssignmentDao;
import Dao.ContentDao;
import Dao.DiscussionDao;
import Dao.SubjectDao;
import Dao.VideoDao;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @RequestMapping(value="student_home",method = RequestMethod.GET)
    public String student_home(){
        return "Student/student_home";
    }
    @RequestMapping(value="student_subjects",method = RequestMethod.GET)
    public String studSubjects(HttpSession session,Model m){
        int id = Integer.parseInt(session.getAttribute("standard_id").toString());
        List<Subject> list = subdao.getSubjectsByStdId(id);
        m.addAttribute("list",list);
        return "Student/student_subjects";
    }
    
    /**
     *
     * @param request
     * @param m
     * @return
     */
    @RequestMapping(value="view_subject_content", method = RequestMethod.GET)
    public String viewSubjectContent(HttpServletRequest request,HttpSession session){
        int id = Integer.parseInt(request.getParameter("id"));
        String subjectName = request.getParameter("name");
        session.setAttribute("name",subjectName);
        session.setAttribute("id",id);
        return "Student/view_subject_content";
    }
    /***********
     * @param request
     * @name School Request Approve
     * @param session
     * @return
     ************/
    @ModelAttribute("topic_list")
    public List<String> topicList(HttpSession session){
        //int id = Integer.parseInt(session.getAttribute("subject_id").toString());
        List<String> topic_list = new ArrayList<String>();
        List<Video> video = vidao.getVideoBySubjectId(1);
        for(Video vid : video)
        {
            topic_list.add(vid.getTopic());
        }
        return topic_list;
    }
    @RequestMapping(value="view_video", method = RequestMethod.GET)
    public String view_video(HttpServletRequest request, ModelMap map, Model m){
        //int id = Integer.parseInt(request.getParameter("id"));
        Video video = vidao.getVideoById(1);
        List<DiscussionForum> list=dfdao.getComments(video.getId());
        m.addAttribute("commentlist",list);
        System.out.println("Video = "+video.getLink());
        map.put("link",video.getLink());
        map.put("videoid",video.getId());
        return "Student/view_video";
    }
    @RequestMapping(value="view_assignment")
    public String view_assignment(Model m){
        List<Assignment> list=astdao.getAssignement("1");
        m.addAttribute("list",list);
        return "Student/view_assignment";
    }
    @RequestMapping(value="view_material")
    public String view_content(Model m){
        List<Content> list=ctdao.getContent("1");
        m.addAttribute("list",list);
        return "Student/view_material";
    }
    @RequestMapping(value="upload_assign",method = RequestMethod.GET)
    public String studAssignments(){
        return "Student/upload_assign";
    }
    @RequestMapping(value="savecomment",method = RequestMethod.POST)
    public String saveComment(@ModelAttribute("df") DiscussionForum df){
        dfdao.saveComment(df);
        return "Student/view_video";
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
        session.removeAttribute("standard_id");
        return "redirect:/login";
    }
}
