package com.cts.dao;

import java.util.List;

import com.cts.beans.CourseBean;

public interface CourseDao {
	
	public String addCourse(CourseBean course);
	
	public CourseBean findCourseByName(String courseName);

	public List<CourseBean> getAllCourses();
	
}
