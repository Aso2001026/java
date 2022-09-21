package com.example.demo.aop;

import java.text.SimpleDateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Kadai04Aspect {
	@Before("execution(* com.example.demo.repositry.FoodsCrudRepository.*(..))")
	private void beforeAdvice(JoinPoint joinpoint) {
		System.out.println("====DB接続====");
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
		System.out.println(String.format("メソッド:%s", joinpoint.getSignature().getName()));
	}
}
