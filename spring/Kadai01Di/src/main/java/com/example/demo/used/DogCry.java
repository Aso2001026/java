package com.example.demo.used;

import org.springframework.stereotype.Component;

@Component("dog")

public class DogCry implements Cry {

	@Override
	public void cry() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("わんわん");
	}

}
