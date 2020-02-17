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
 * Servlet implementation class LoginSrv
 */
@WebServlet("/LoginSrv")
public class LoginSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String loginAs=request.getParameter("loginAs");
		
		
		String page="invalidLogin.jsp";
		
		
		if(loginAs.equals("Admin")){
			
			if(uname.equals("admin") && pass.equals("1234"))
				page="adminHome.jsp";
			
			
		}
		
		if(loginAs.equals("Student")){
			
			
			StudentDao dao=new StudentDaoImpl();
			
			StudentBean student=dao.validateStudent(uname, pass);
			
			
			if(student != null){
				
				request.getSession().setAttribute("studentdata", student);
				page="studentHome.jsp";
				
				
			}
			
			
		}
		
		
		
			request.getRequestDispatcher(page).forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
