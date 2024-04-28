package com.configuration.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.institude.details.CourseDetail;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext();
		config.scan("com.institude.*");
		config.refresh();

		CourseDetail detail1 = (CourseDetail) config.getBean("sql");
        CourseDetail detail2 = (CourseDetail) config.getBean("java");  
		
        
        System.out.println(detail1);
		System.out.println(detail2);
		
		System.out.println(detail1.hashCode());
		System.out.println(detail2.hashCode());


	}

}
