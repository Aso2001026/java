package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.used.Cry;

/*
 * SD3A 松石泰紀
 */

@SpringBootApplication
public class Kadai01DiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kadai01DiApplication.class, args).getBean(Kadai01DiApplication.class).call();
	}
	
	@Autowired
	private List<Cry> cry;
	
	private void call() {
		cry.forEach(s -> s.cry());
	}
	
	

}
