package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Foods;
import com.example.demo.repositry.FoodsCrudRepository;

//SD3A 松石泰紀

@SpringBootApplication
public class Kadai04AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kadai04AopApplication.class, args)
		.getBean(Kadai04AopApplication.class).execute();
	}
	
	@Autowired
	FoodsCrudRepository repository;

	private void execute() {
		executeInsert("焼き鳥", "和食");
		executeSelect();
		executeFindById();
		
	}
	
	private void executeInsert(String food,String category) {
		Foods foods = new Foods(null,food,category);
		foods = repository.save(foods);
		System.out.println("登録したデータ:"+foods);
	}
	
	private void executeSelect() {
		Iterable<Foods> foods = repository.findAll();
		for (Foods food : foods) {
			System.out.println(food);
		}
	}
	
	private void executeFindById() {
		Integer id = 1;
		Optional<Foods> food = repository.findById(id);
		System.out.println(food);
		
	}
}
