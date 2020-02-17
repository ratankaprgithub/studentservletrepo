package com.cts.beans;

import java.io.Serializable;

public class CourseBean implements Serializable{

	private String courseName;
	private String courseDuration;
	private int courseFee;
	private String courseDate; 
	
	
	public CourseBean() {
		// TODO Auto-generated constructor stub
	}


	public CourseBean(String courseName, String courseDuration, int courseFee, String courseDate) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFee = courseFee;
		this.courseDate = courseDate;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}


	public int getCourseFee() {
		return courseFee;
	}


	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}


	public String getCourseDate() {
		return courseDate;
	}


	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}
	
	
	
	
	
	
}
