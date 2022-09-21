package com.example.demo.service;

import com.example.demo.entity.Foods;

public interface FoodsService {
	Iterable<Foods> findAll();
	
	void insertFood(Foods food);
}
