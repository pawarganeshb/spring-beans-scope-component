package com.institude.details;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
 
	@Bean("java")
	@Scope("prototype")
	public CourseDetail setCourseDetail1() {
	CourseDetail details = new CourseDetail();
	details.setCourseName("Full Stack Java");
	details.setNoOfDays(145);
	return details;
	}
	
}
