/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Video;
import Dao.SubjectDao;
import Dao.VideoDao;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    
    @RequestMapping(value="student_home",method = RequestMethod.GET)    
    public String student_home(){    
        return "Student/student_home";    
    }
    @RequestMapping(value="student_subjects",method = RequestMethod.GET)    
    public String studSubjects(){    
        return "Student/student_subjects";    
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
    public String editSchool(HttpServletRequest request, ModelMap m){  
        //int id = Integer.parseInt(request.getParameter("id"));
        Video video = vidao.getVideoById(1);
        System.out.println("Video = "+video.getLink());
        m.put("link",video.getLink());
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
        return "redirect:/login";
    }   
}
