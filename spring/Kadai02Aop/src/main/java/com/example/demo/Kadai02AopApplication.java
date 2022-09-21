package com.example.demo;

import java.util.List;

//
//      SD3A　松石泰紀
//

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.used.Noodle;

@SpringBootApplication
public class Kadai02AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kadai02AopApplication.class, args).getBean(Kadai02AopApplication.class).call();;
	}
	
	@Autowired
	private List<Noodle> noodles;
	
	private void call() {
		noodles.forEach(s -> s.like());
	}
}
