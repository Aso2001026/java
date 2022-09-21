package com.example.demo.form;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data

public class MemberForm {
	@Id
	private Integer id;
	private String name;
}
