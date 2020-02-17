package com.cts.srv;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.beans.CourseBean;
import com.cts.dao.CourseDao;
import com.cts.dao.CourseDaoImpl;

/**
 * Servlet implementation class FindAllCourseSrv
 */
@WebServlet("/FindAllCourseSrv")
public class FindAllCourseSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllCourseSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CourseDao cdao=new CourseDaoImpl();
		
		List<CourseBean> courses=cdao.getAllCourses();
		
		request.setAttribute("coursesdata", courses);
		
		request.getRequestDispatcher("allcourses.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
