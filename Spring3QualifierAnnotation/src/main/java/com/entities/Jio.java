package com.entities;

import org.springframework.stereotype.Component;



@Component("jio")
public class Jio implements Sim {

	@Override
	public String Calling() {
		return "UR Calling Jio";
	}

}