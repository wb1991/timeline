package com.wb.timeline.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wb.timeline.domain.Idea;
import com.wb.timeline.domain.User;
import com.wb.timeline.service.IIdeaService;
import com.wb.timeline.service.IUserService;

@Controller  
@RequestMapping("/idea")  
public class IdeaController {  
	
	/**用户管理类. */
    @Resource  
    private IUserService userService;  
    
    /**idea管理类. */
    @Resource
    private IIdeaService ideaService;
      
    @RequestMapping("/showIdea")  
    public String toIndex(HttpServletRequest request,Model model){  
        int ideaId = Integer.parseInt(request.getParameter("id"));  
        Idea idea = ideaService.getIdeaById(ideaId);
        model.addAttribute("idea", idea);  
        return "idea/showIdea";  
    }  
    
    @RequestMapping("/publish")  
    public String publish(HttpServletRequest request, Model model){  
        return "idea/publish";  
    }  
}  
