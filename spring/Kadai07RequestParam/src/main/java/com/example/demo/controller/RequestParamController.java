package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class RequestParamController {
	@GetMapping("music")
	public String musicInView() {
		return "music-in";
	}
	
	@PostMapping("musicout")
	public String musicOutView(Model model,@RequestParam String name,@RequestParam String singer) {
		model.addAttribute("singer", singer);
		model.addAttribute("name", name);
		return "music-out";
	}
	
	

}
