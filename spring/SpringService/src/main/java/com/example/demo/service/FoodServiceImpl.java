package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Foods;
import com.example.demo.repository.FoodsCrudRepository;

@Service
public class FoodServiceImpl implements FoodsService{
	@Autowired
	FoodsCrudRepository repository;
	
	@Override
	public Iterable<Foods> findAll(){
		return repository.findAll();
	}
	
	@Override
	public void insertFood(Foods food) {
		repository.save(food);
	}
}
