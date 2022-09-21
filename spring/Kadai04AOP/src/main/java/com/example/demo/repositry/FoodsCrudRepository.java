package com.example.demo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Foods;

public interface FoodsCrudRepository extends CrudRepository<Foods, Integer>{

}
