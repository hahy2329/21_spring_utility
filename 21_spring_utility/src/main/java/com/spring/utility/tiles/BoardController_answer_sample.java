package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles/board")
public class BoardController_answer_sample {

	@RequestMapping(value = "/boardList" , method = RequestMethod.GET)		
	public String boardList() {
		return "List";	
	}
	
	@RequestMapping(value = "/boardWrite" , method = RequestMethod.GET)		
	public String boardWrite() {
		return "write";
	}
	
	@RequestMapping(value = "/boardUpdate" , method = RequestMethod.GET)		
	public ModelAndView boardUpdate() {
		return new ModelAndView("update");
	}
	
	@RequestMapping(value = "/boardDelete" , method = RequestMethod.GET)		
	public ModelAndView boardDelete() {
		return new ModelAndView("delete");
	}
	
}
