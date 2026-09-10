package com.spring_mvc.projectData;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class bookController {

	@RequestMapping("/bookInfoView1")
	public String showBookInfo(Model model) {
		model.addAttribute("title", "스프링 프레임워크");
		model.addAttribute("price", 20000);
	
		return "bookInfoView";
	}

 
	@RequestMapping("/bookInfoView2")
	public ModelAndView showBookInfo(ModelAndView mv) {
		mv.addObject("title", "스프링 프레임워크2");
		mv.addObject("price", 20000);
		mv.setViewName("bookInfoView"); 
		return mv;
	}
}
