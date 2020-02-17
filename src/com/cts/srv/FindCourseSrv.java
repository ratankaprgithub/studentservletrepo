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
 * Servlet implementation class FindCourseSrv
 */
@WebServlet("/FindCourseSrv")
public class FindCourseSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCourseSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cname=request.getParameter("cname");
		
		
		CourseDao cdao=new CourseDaoImpl();
		
		CourseBean bean=cdao.findCourseByName(cname);
		
		request.setAttribute("cdata", bean);
		
		request.getRequestDispatcher("cdetails.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
