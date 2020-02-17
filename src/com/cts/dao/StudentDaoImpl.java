package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.beans.StudentBean;
import com.cts.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String registerStudent(StudentBean student) {
			String result="Not registered";
	
			
			Connection conn=DBUtil.createConnection();
			
			try {
				PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");
				
				ps.setString(1, student.getName());
				ps.setString(2, student.getAddress());
				ps.setString(3, student.getEmail());
				ps.setString(4, student.getPassword());
				
				
				int x=ps.executeUpdate();
				
				if(x>0)
					result="Student Registerd Sucessfully";
				
				
				
			} catch (SQLException e) {
				result=e.getMessage();
				e.printStackTrace();
			}
			
			
			
			
			
			
	
			return result;
	}

	@Override
	public StudentBean validateStudent(String uname, String pass) {
		
		StudentBean student=null;
		
		Connection conn=DBUtil.createConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from student where email=? AND password=?");
			
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				
				String n=rs.getString("name");
				String a=rs.getString("address");
				String e=rs.getString("email");
				String p=rs.getString("password");
				
				
				student=new StudentBean(n, a, e, p);
				
			}
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return student;
	}

}
