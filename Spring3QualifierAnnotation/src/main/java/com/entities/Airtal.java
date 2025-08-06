package com.entities;

import org.springframework.stereotype.Component;


@Component("airtel")
public class Airtal implements Sim {

	@Override
	public String Calling() {	
		return "UR Calling Airtel";
	}

}