package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	
	@Value("121")
	private int sid;
	
	@Value("vaishu")
	private String name;
	
	@Value("value")
	private String city;
	
	public Student() {
		
	}
	public Student(int sid,String name, String city) {
		super();
		this.sid=sid;
		this.name=name;
		this.city=city;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	
	@Override
	public String toString() {
		return "Student[sid="+sid+"name="+name+"city="+city+"]";
	}

}
