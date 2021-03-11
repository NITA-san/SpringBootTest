package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {

	@RequestMapping("/hello")
	public String greeting() {
//		public @ResponseBody String greeting() {
			//		return "Hello, World";
		return "/index.html";
	}

}