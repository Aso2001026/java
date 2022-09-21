package com.example.demo.survice;

import java.util.Optional;

import com.example.demo.entity.Music;

public interface MusicService {
	public Iterable<Music> findAll();
	public void insert(Music music);
	public void delete(Integer id);
	public void update(Music music);
	public Optional<Music> updateSelect(Integer id);
}	
