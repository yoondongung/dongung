package com.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domain.service.MemberService;
import com.domain.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/insertMember")
	public ModelAndView addMember(Member _member){
		System.out.println("i'm controller");
		Member member = memberService.insertMember(_member);
		
		return new ModelAndView("/insert.do", "member", member);
		
	}
	
	@RequestMapping("/updateMember")
	public ModelAndView updateMember(Member member){
		System.out.println(member);
		memberService.updateMember(member);
		
		return new ModelAndView("/findMemberAll.do");
	}
	
	@RequestMapping("/findMember")
	public ModelAndView findMember(int memberId){
		System.out.println("i'm findMember controller");
		Member member = memberService.findMember(memberId);
		return new ModelAndView("/insert.do", "member", member);
	}
	
	@RequestMapping("/findMemberName")
	public ModelAndView findMember(String memberName){
		List<Member> member = memberService.findMemberName(memberName);
		
		return new ModelAndView("/insert.do","memberList", member);
	}
	
	@RequestMapping("/findMemberAll")
	public ModelAndView findMemberAll(){
		List<Member> member = memberService.findMemberAll();
		
		return new ModelAndView("find.do", "memberList", member);
	}
	
	@RequestMapping("/deleteMember")
	public ModelAndView deleteMember(int memberId){

		memberService.deleteMember(memberId);
		
		return new ModelAndView("/findMemberAll.do");
		
	}
	
}
