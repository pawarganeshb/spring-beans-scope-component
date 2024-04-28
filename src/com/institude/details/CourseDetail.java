package com.institude.details;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sql")
@Scope("singleton")
public class CourseDetail {
	
	private int noOfDays;
	private String courseName;

	public CourseDetail() {
		System.out.println("Course Object Created..!");
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "CourseDetail [noOfDays=" + noOfDays + ", courseName=" + courseName + "]";
	}
	
	

}
