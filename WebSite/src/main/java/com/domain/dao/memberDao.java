package com.domain.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.domain.vo.Member;

@Repository
public class memberDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Member insert(Member member) {
		
		System.out.println(sessionFactory);
		
		System.out.println(member);
		System.out.println(member.getId());
		
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();

		
		session.save(member);
	
		
		transaction.commit();
		
		return member;
	}
	
	/**
	 * UPDATE Table명 
	 * SET DEPTNO=20, 
	 * JOB='MANAGER' 
	 * WHERE ENAME='SCOTT'; 이 UPDATE문 수행불가!!!!
	 * 
	 */
	public void update(Member member){ 
		System.out.println(member);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(member);
		session.getTransaction().commit();
	}
	
	public Member find(int memberId){
		
		Session session = sessionFactory.openSession();
		Member selectedMember = (Member) session.get(Member.class, memberId);
		
		return selectedMember;
	}
	
	public List<Member> findMemberName(String memberName){
		
		Session session = sessionFactory.openSession();
		String hql = "FROM Member WHERE Name = '" + memberName + "'";
		Query query = session.createQuery(hql);
		
		List<Member> list = (List<Member>)query.list();
		
		
		return list;
	}
	
	public List<Member> findMemberAll(){
		Session session = sessionFactory.openSession();
		
		String hql = "FROM Member";
		Query query = session.createQuery(hql);
		
		List<Member> list = (List<Member>)query.list();
		
		return list;
	}
	
	public void delete(int memberId){
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		String hql = "DELETE FROM Member WHERE Id =" +memberId; 
		Query query = session.createQuery(hql);
		query.executeUpdate();
		transaction.commit();
		
	}
}
