package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.entity.Member;
import com.example.demo.form.MemberForm;
import com.example.demo.service.MemberService;

@Controller
@SessionAttributes(types = MemberForm.class)

public class MemberController {
  @Autowired
  MemberService service;
  
  @ModelAttribute("MemberForm")
  public MemberForm createMemberForm() {
	  MemberForm memberForm = new MemberForm();
	  return memberForm;
  }

  @GetMapping("index")
  public String indexView() {
  	return "index";
	
  }
  
  @PostMapping(value = "menu",params = "select")
  public String selectView(Model model) {
	  Iterable<Member> list = service.findAll();
	  model.addAttribute("list",list);
	  return "select";
  }
  
  @PostMapping(value="menu",params = "insert")
  public String inputView() {
	  return "input";
  }
  
  @PostMapping(value = "insert" ,params = "insert")
  public String insertView(MemberForm f){
	  Member member = new Member(f.getId() , f.getName());
	  service.memberInsert(member);
	  return "complete";
  }
  
  @PostMapping(value = "insert",params = "back")
  public String backView() {
	  return "index";
  }
  
  @PostMapping(value = "check" , params = "insert")
  public String checkView(MemberForm memberForm){
	  return "check";
  }
  

}
