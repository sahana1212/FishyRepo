package com.mt.osr1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Actor {
	
	@Id
	private int aid;
	private String aname;
	private int age;
	private String gender;
	
	
	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getAname() {
		return aname;
	}


	public void setName(String aname) {
		this.aname = aname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Actor(int aid, String name, int age, String gender) {
		super();
		this.aid = aid;
		this.aname = name;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", name=" + aname + ", age=" + age + ", gender=" + gender + "]";
	}

	
	

}
