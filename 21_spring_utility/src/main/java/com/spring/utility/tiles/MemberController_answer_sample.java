package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles/member")
public class MemberController_answer_sample {
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String login() {
		return "loginForm";
	}
	
	@RequestMapping(value="/detail" , method=RequestMethod.GET)
	public String memberDetail() {
		return "memberDetail";
	}
	
	@RequestMapping(value="/cart" , method=RequestMethod.GET)
	public ModelAndView cart() {
		return new ModelAndView("cart");
	}
	
	@RequestMapping(value="/myPage" , method=RequestMethod.GET)
	public ModelAndView myPage() {
		return new ModelAndView("myPage");
	}
	
}
