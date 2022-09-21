package com.example.demo.aop;

import java.text.SimpleDateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Kadai02Aspect {
	@Before("execution(* com.example.demo.used.*Noodle.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		//わかりやすいように表示
		System.out.println("===== Before=====");
		//日付を表示する
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
		//メソッド名に表示する
		System.out.println(String.format("メソッド:%s", joinPoint.getSignature().getName()));
	}

}
