package com.domain.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Member{

	@Id	// 주키
	@GeneratedValue // 자동증가
	@Setter
	@Getter
	private int id;
	
	@Setter
	@Getter
	private String name;

	
	@Setter
	@Getter
	private String message;

	public Member() {
	}

	public Member(String name, String message) {
		this.name = name;
		this.message = message;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", message=" + message + "]";
	}

	
	
}
