package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginApp
 */
public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws NullPointerException, ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		String user = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		//pw.println("Welcome user  "+user);
		if(user.equals("Bharath") && pass.equals("12345"))
		{
			pw.println("Successfully login with get method");
		}
		else{		
			pw.println("Enter correct username and password in get method");
		}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws NullPointerException, ServletException,IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		String user = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		//pw.println("Welcome user  "+user);
		if(user.equals("Bharath") && pass.equals("12345")) {
			pw.println("Successfully login with post method");
		}
		else{		
			pw.println("Enter correct username and password in post method");
		}
		
	}
}
