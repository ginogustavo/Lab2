package com.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerLab2 {

	
	@RequestMapping("/")
	public String getMessage(){
		return "hello";
	}
}
