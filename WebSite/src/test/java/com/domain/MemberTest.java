package com.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.domain.util.HibernateUtil;
import com.domain.vo.Member;


public class MemberTest {

	private static final String HELLO_HIBERNATE = "hello_hibernate";
	private static final String HELLO_WORLD = "hello world";
	private static final String ARAHANSA = "arahansa";
	SessionFactory factory = HibernateUtil.getSessionFactory();
	int number = (int)(Math.random()*100) +1 ;
	String num = Integer.toString(number);

	@Test
	public void test() {
		
		System.out.println("-----");
		Member member = new Member(ARAHANSA, HELLO_WORLD);
		insert(member);
		
		Member member1 = new Member(num, "001");
		insert(member1);
		
		//select One
		System.out.println("----");
		Member selectedMember = selectById(1);
		assertEquals(HELLO_WORLD, selectedMember.getMessage());
		 
		
		//Update
		selectedMember.setMessage(HELLO_HIBERNATE);
		update(selectedMember);
		Member updateMember = selectById(1);
		assertEquals(HELLO_HIBERNATE, updateMember.getMessage());
		
		
		//delete
		delete(updateMember);
		Member deleteMember = selectById(2);
		assertNull(deleteMember);
		System.out.println("-----");
	}


	public void delete(Member updateMember) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.delete(updateMember);
		session.getTransaction().commit();
	}

	public void update(Member selectedMember) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.update(selectedMember);
		session.getTransaction().commit();
	}

	private Member selectById(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Member selectedMember = (Member) session.get(Member.class, id);
		session.getTransaction().commit();
		
		return selectedMember;
	}

	public void insert(Member member) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();
	}

}
