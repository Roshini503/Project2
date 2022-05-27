package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
	
	@GetMapping("/getMessage")
	
	public String getMessage(Model model) {
		model.addAttribute("Message", "Hello World");
		return "Hello Roshini!";
		return "Anumukonda";
	}
}
