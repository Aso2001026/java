package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.used.GreetingService;

@SpringBootApplication
public class GreetingServiceApplication {
	private final GreetingService service;
	
	@Autowired
	public GreetingServiceApplication(GreetingService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(GreetingServiceApplication.class, args).getBean(GreetingServiceApplication.class).excute();
	}
	
	public void excute() {
		for(String g:service.getGreetings()) {
			System.out.println(g);
		}
	}

}
