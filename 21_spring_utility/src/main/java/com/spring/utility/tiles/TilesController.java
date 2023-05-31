package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TilesController {
	
	@GetMapping("/content1")
	public String content1() {
		//return "tiles/tilesEx/content1"; //before
		//위에는 말 그대로 jsp파일만 나옴 
		return "aaa"; //(after) definition태그 name속성과 바인딩
		//위에는 tiles 설정한 값대로 나옴 
	}
	
	@GetMapping("/content2")
	public ModelAndView content2() {
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("tiles/tilesEx/content2"); //before
		mv.setViewName("bbb");
		
		return mv;
		
		
	}
	
	
	@GetMapping("/content3")
	public ModelAndView content3() {
		
		//return new ModelAndView("tiles/tilesEx/content3");//before
		
		return new ModelAndView("ccc");
	}
	
	
	
}
