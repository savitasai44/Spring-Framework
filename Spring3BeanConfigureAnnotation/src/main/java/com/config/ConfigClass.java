package com.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.entities.Student;

@Configuration
public class ConfigClass {
	
	@Bean("stu")
	public Student stuobj() {
		return  new Student() ;
		
	}
	

}
