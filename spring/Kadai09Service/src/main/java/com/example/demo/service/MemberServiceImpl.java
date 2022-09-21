package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;


@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberCrudRepository repository;
	
	@Override
	public Iterable<Member> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	
	}
	
	
	@Override
	public void memberInsert(Member member) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(member);
	}
}
