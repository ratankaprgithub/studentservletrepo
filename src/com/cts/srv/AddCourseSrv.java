package com.cts.srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.beans.CourseBean;
import com.cts.dao.CourseDao;
import com.cts.dao.CourseDaoImpl;

/**
 * Servlet implementation class AddCourseSrv
 */
@WebServlet("/AddCourseSrv")
public class AddCourseSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String courseName=request.getParameter("courseName");
	String courseDuration=request.getParameter("courseDuration");
	String courseFee=request.getParameter("courseFee");
	String courseDate=request.getParameter("courseDate");
		
	int fee=Integer.parseInt(courseFee.trim());
	
	CourseBean course=new CourseBean(courseName, courseDuration, fee, courseDate);
	
	
	CourseDao cdao=new CourseDaoImpl();
	
	String result=cdao.addCourse(course);
	
	request.setAttribute("result", result);
	
	request.getRequestDispatcher("courseSucess.jsp").forward(request, response);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
