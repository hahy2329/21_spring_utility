package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tiles/bootstrap")
public class BootstrapController {
	
	@GetMapping("/index")
	public String index() {
		
		return "/bootstrap/index";
		
		
	}
	
	@GetMapping("/checkout")
	public String checkout() {
		return "/bootstrap/checkout";
	}
	
	@GetMapping("/shopCart")
	public String shopCart() {
		
		return "/bootstrap/shopCart";
		
		
	}
	
	
}
