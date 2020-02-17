package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.beans.CourseBean;
import com.cts.utility.DBUtil;

public class CourseDaoImpl implements CourseDao{

	@Override
	public String addCourse(CourseBean course) {
		
		String result="course not added ";
		
		Connection conn=DBUtil.createConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("insert into course values(?,?,?,?)");
			
			ps.setString(1, course.getCourseName());
			ps.setString(2, course.getCourseDuration());
			ps.setInt(3, course.getCourseFee());
			ps.setString(4, course.getCourseDate());
			
			int x=ps.executeUpdate();
			
			if(x>0)
				result="Course Added Sucessfully";
			
			
			
		} catch (SQLException e) {
			result=e.getMessage();
			e.printStackTrace();
		}
		
		
		
		
		return result;
	}

	@Override
	public CourseBean findCourseByName(String courseName) {
	
		CourseBean course=null;
		
		Connection conn=DBUtil.createConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from course where cname=?");
			
			ps.setString(1, courseName);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				String cname=rs.getString("cname");
				String cduration=rs.getString("cduration");
				int fee=rs.getInt("cfee");
				
				String cstartdate=rs.getString("cstartdate");
				
				course=new CourseBean(cname, cduration, fee, cstartdate);
				
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return course;
	}

	@Override
	public List<CourseBean> getAllCourses() {
		
		List<CourseBean> courses=new ArrayList<CourseBean>();
		
		
		
		Connection conn=DBUtil.createConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from course");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				
				String cname=rs.getString("cname");
				String cduration=rs.getString("cduration");
				int fee=rs.getInt("cfee");
				
				String cstartdate=rs.getString("cstartdate");
				
			CourseBean course=new CourseBean(cname, cduration, fee, cstartdate);	
				
				courses.add(course);
				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return courses;
	}

}
