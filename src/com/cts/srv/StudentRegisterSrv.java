package com.cts.srv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.beans.StudentBean;
import com.cts.dao.StudentDao;
import com.cts.dao.StudentDaoImpl;

/**
 * Servlet implementation class StudentRegisterSrv
 */
@WebServlet("/StudentRegisterSrv")
public class StudentRegisterSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegisterSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sname=request.getParameter("sname");
		String saddress=request.getParameter("saddress");
		String semail=request.getParameter("semail");
		String spass=request.getParameter("spass");
		
		StudentBean student=new StudentBean(sname, saddress, semail, spass);
		
		
		StudentDao sdao=new StudentDaoImpl();
		
		String result=sdao.registerStudent(student);
		
		request.setAttribute("result", result);
		
		request.getRequestDispatcher("studentsucess.jsp").forward(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
