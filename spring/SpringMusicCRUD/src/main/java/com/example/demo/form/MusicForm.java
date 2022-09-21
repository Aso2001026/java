package com.example.demo.form;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data

public class MusicForm {
	@Id
	Integer song_id;
	String song_name;
	String sinnger;
}
