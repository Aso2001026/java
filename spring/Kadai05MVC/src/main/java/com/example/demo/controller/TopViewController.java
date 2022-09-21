package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hi")
public class TopViewController {
	@GetMapping("first")
	public String top() {
		return "topfile";
	}
	@GetMapping("second")
	public String sub() {
		return "sub/subfile";
	}
}
