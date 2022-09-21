package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloModelContoller {
	@GetMapping("model")
	public String helloView(Model model) {
		model.addAttribute("msg","タイムリーフ!!!");
		return "helloThymeleaf";
	}
}
