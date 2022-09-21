package com.example.demo.used;

import org.springframework.stereotype.Component;

@Component("ramen")

public class Ramen implements Noodle {

	@Override
	public void like() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("とんこつラーメン!!");

	}

}
