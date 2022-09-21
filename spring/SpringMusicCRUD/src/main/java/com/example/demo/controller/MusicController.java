package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.entity.Music;
import com.example.demo.form.MusicForm;
import com.example.demo.form.MusicIdForm;
import com.example.demo.survice.MusicService;

@Controller

public class MusicController {
	@Autowired
	MusicService service;
	
	@GetMapping("index")
	public String indexView() {
	  	return "index";
	}
	
	@PostMapping(value = "menu",params = "select")
	  public String selectView(Model model) {
		  Iterable<Music> list = service.findAll();
		  model.addAttribute("list",list);
		  return "select";
	}
	
	@PostMapping(value="menu",params = "insert")
	  public String inputView() {
		  return "input";
	}
	
	@PostMapping(value = "insert" ,params = "insert")
	  public String insertView(MusicForm f){
		  Music music = new Music(f.getSong_id(),f.getSong_name() , f.getSinnger());
		  service.insert(music);
		  return "complete";
	}
	
	@PostMapping(value = "menu",params = "delete")
	  public String deleteInputView(Model model) {
		  Iterable<Music> list = service.findAll();
		  model.addAttribute("list",list);
		  return "deleteInput";
	}
	
	@PostMapping("delete")
	  public String deleteView(MusicIdForm f) {
		  service.delete(f.getSong_id());
		  return "delete";
	}
	
	@PostMapping(value = "menu",params = "update")
	  public String updateInputView(Model model) {
		  Iterable<Music> list = service.findAll();
		  model.addAttribute("list",list);
		  return "updateInput";
	}
	
	@PostMapping("update")
	  public String updateView(MusicIdForm f,Model model) {
		  Music music = service.updateSelect(f.getSong_id()).get();
		  model.addAttribute("music",music);
		  model.addAttribute("id",f.getSong_id());
		  return "update";
	}
	
	@PostMapping("updateComplete")
	  public String updateCompleteView(MusicForm f){
		  Music music = new Music(f.getSong_id(),f.getSong_name() , f.getSinnger());
		  service.insert(music);
		  return "updateComplete";
	}
}
