package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String root() {
		
		return "NewFileHD";
	}
}
