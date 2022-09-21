package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Foods;
import com.example.demo.form.FoodForm;
import com.example.demo.service.FoodsService;

@Controller
public class FoodController {
	@Autowired
	FoodsService service;
	
	@GetMapping("index")
	public String indexView() {
		return "index";
	}
	
//	@PostMapping("dbselect")
	@PostMapping(value = "menu",params = "select")
	public String listView(Model model) {
		Iterable<Foods> list = service.findAll();
		model.addAttribute("list",list);
		return "list";
	}
	
	@PostMapping(value = "menu",params = "insert")
	public String foodInputView() {
		return "food-input";
	}
	
	@PostMapping("insert")
	public String foodConfirmView(FoodForm f) {
		Foods food = new Foods(f.getFood_id(),f.getFood_name(),f.getCategory());
		service.insertFood(food);
		return "food-complete";
	}
	

}
