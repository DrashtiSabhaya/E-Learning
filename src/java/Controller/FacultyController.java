/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Assignment;
import Bean.Content;
import Bean.StClass;
import Bean.Video;
import Dao.AssignmentDao;
import Dao.ClassDao;
import Dao.ContentDao;
import Dao.VideoDao;
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
@RequestMapping(value = "Faculty")
public class FacultyController {
    private static final String UPLOAD_DIRECTORY ="resources/cover-photos";  

    @Autowired    
    AssignmentDao astdao;
    @Autowired    
    ClassDao clsdao;
    @Autowired    
    VideoDao vidao;
    @Autowired    
    ContentDao ctdao;    
    
    @RequestMapping(value="/add_assignment",method = RequestMethod.POST)    
    public String saveAssignment(@ModelAttribute("ast") Assignment ast){    
        astdao.saveAssignment(ast);    
        return "redirect:/Faculty/view_assignment";    
    }
    @RequestMapping(value="view_assignment")    
    public String view_assignment(Model m){    
        List<Assignment> list=astdao.getAssignement();    
        m.addAttribute("list",list);  
        return "Faculty/view_assignment";    
    }
    
    @RequestMapping(value="/addcontent",method = RequestMethod.POST)    
    public String saveContent(@ModelAttribute("ct") Content ct){    
        ctdao.saveContent(ct);    
        return "redirect:/Faculty/view_material";    
    }
    @RequestMapping(value="view_material")    
    public String view_content(Model m){    
        List<Content> list=ctdao.getContent();    
        m.addAttribute("list",list);  
        return "Faculty/view_material";    
    }
    
    @RequestMapping(value="/addvideo",method = RequestMethod.POST)    
    public String saveVideo(@ModelAttribute("vid") Video vid){    
        vidao.saveVideo(vid);    
        return "redirect:/Faculty/view_video";    
    }
    @RequestMapping(value="view_video")    
    public String view_video(Model m){    
        List<Video> list=vidao.getVideo();    
        m.addAttribute("list",list);  
        return "Faculty/view_video";    
    }
    
    @RequestMapping(value="/createclass",method = RequestMethod.POST)    
    public String saveClass(@ModelAttribute("cls") StClass cls) throws Exception{  
        
//        ServletContext context = session.getServletContext();  
//        String path = context.getRealPath(UPLOAD_DIRECTORY);  
//        String filename = file.getOriginalFilename();  
//
//        System.out.println(path+" "+filename);        
//
//        byte[] bytes = file.getBytes();  
//        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
//             new File(path + File.separator + filename)));  
//        stream.write(bytes);  
//        stream.flush();  
//        stream.close();  

        clsdao.saveClass(cls);    
        
        return "redirect:/Faculty/faculty_home";    
    }
    
    @RequestMapping(value="faculty_home")    
    public String view_class(Model m){    
        List<StClass> list=clsdao.getClasses();    
        m.addAttribute("list",list);  
        return "Faculty/faculty_home";    
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
