package com.domain.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@javax.persistence.Entity
@Table(name = "MEMBER")
public class Member implements Serializable{

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ", initialValue = 1, allocationSize =1)	//name - seq이름 , sequenceName - 매핑할 데이터베이스 이름
	@Setter
	@Getter
	@Column(name ="id")
	private int id;
	
	@Setter
	@Getter
	@Column(name ="name")
	private String name;

	
	@Setter
	@Getter
	@Column(name ="message")
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

	public Member(int id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
	}

	
	
}
