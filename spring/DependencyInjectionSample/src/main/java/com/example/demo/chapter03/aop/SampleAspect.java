

package com.example.demo.chapter03.aop;

import java.text.SimpleDateFormat;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class SampleAspect {
	
//	@After("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
//	public void beforeAdvice(JoinPoint joinPoint) {
//		//わかりやすいように表示
//		System.out.println("===== Before Advice =====");
//		//日付を表示する
//		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
//		//メソッド名に表示する
//		System.out.println(String.format("メソッド:%s", joinPoint.getSignature().getName()));
//	}
	
	
	@Around("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
	public Object arounfAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		//わかりやすいように表示
		System.out.println("===== Around Advice =====");
		System.out.println("▼▼▼▼処理前▼▼▼▼");
		// 指定したクラスの指定したメソッドを実行
		Object result = joinPoint.proceed();
		System.out.println("▼▼▼▼処理後▼▼▼▼");
		return result;
	}
	
	

}
