package com.example.demo.form;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data

public class MusicIdForm {
	@Id
	private Integer song_id;
}
