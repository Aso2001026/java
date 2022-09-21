package com.example.demo.used;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {
	private List<Greet> greetings;
	// コンストラクタでDI,@Autowiredは省略可
	@Autowired
	public GreetingService(List<Greet> greetings) {
		this.greetings = greetings;
	}
	public List<String> getGreetings() {
	return greetings.stream().map(it -> it.hello()).collect(Collectors.toList());	
	}

}
