package com.main;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigClass;
import com.entities.Student;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext c=new AnnotationConfigApplicationContext(ConfigClass.class);
		Student s=c.getBean("stu",Student.class);
		System.out.println(s);
		
	}

}
