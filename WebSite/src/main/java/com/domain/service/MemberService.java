package com.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.dao.memberDao;
import com.domain.vo.Member;

@Service
public class MemberService {

	@Autowired
	private memberDao dao;
	
	public Member insertMember(Member _member){
		return dao.insert(_member);
	}
	
	
	public void updateMember(Member member){
		System.out.println("i'm updateService"+member);
		dao.update(member);
	}
	
	public Member findMember(int memberId){
		return dao.find(memberId);
	}
	
	public List<Member> findMemberName(String memberName){
		
		List<Member> member = dao.findMemberName(memberName);
		return member;
	}
	
	public List<Member> findMemberAll(){
		List<Member> member = dao.findMemberAll();
		return member;
	}
	
	
	public void deleteMember(int memberId){
		dao.delete(memberId);
	}
}


