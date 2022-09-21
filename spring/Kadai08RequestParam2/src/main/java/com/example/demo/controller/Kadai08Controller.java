package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ProfileForm;

@Controller
public class Kadai08Controller {
	@GetMapping("kadai/top")
	private String topView() {
		return "kadai08-top";
	}
	@GetMapping("kadai/input")
	private String inputView() {
		return "kadai08-input";
	}
	@GetMapping("kadai/exit")
	private String exitView() {
		return "kadai08-exit";
	}
	@PostMapping("kadai/confirm")
	private String confirmView(ProfileForm profileForm) {
		
		return "kadai08-confirm";
	}
	@GetMapping("kadai/complete")
	private String completeView() {
		return "kadai08-complete";
	}
}
