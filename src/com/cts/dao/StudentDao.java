package com.cts.dao;

import com.cts.beans.StudentBean;

public interface StudentDao {
	
	public String registerStudent(StudentBean student);

	public StudentBean validateStudent(String uname,String pass);
	
}
