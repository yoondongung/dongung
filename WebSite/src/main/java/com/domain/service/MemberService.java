package com.domain.service;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.domain.vo.Member;

import lombok.Getter;
import lombok.Setter;

@Service
public class MemberService {

	@Resource
	private SessionFactory sessionFactory;
	
	public void insert(int id, String name, String message) {
		Member member = new Member();
		member.setId(id);
		member.setName(name);
		member.setMessage(message);
		
		Session session = sessionFactory.openSession();
		session.save(member);
		
	}
}
