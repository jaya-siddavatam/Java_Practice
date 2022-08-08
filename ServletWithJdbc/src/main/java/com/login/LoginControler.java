package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
public class LoginControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		String emailid = request.getParameter("emailid"); //getting parameter from the client request html page
		String pass = request.getParameter("password");
		//RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		HttpSession hs = request.getSession(); // we have to use this when we are using response redirect
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Bharath@1405");
			
			PreparedStatement pstmt = con.prepareStatement("select * from login where email=? and password = ?");
			pstmt.setString(1, emailid);
			pstmt.setString(2, pass);
			
			ResultSet rs  = pstmt.executeQuery(); // we are using select statement i.e., retriving data so we have to use result set to retrive values.
			
			if(rs.next()) {                                //here we are checking with the primary key so we are using if else statement
				pw.println("successfully login");
				hs.setAttribute("obj",emailid);
				//request.setAttribute("obj",emailid);   // key value pairs
               // using request scope we are storing emailid in obj we use this scope
				//rd1.forward(request, response);          // we can see only output of target page we can not see the "successfully login" output.
				//hs.invalidate(); // to session get desroyed here uncomment to see the change
				response.sendRedirect("Home");      // response of the server is redirected to home servlet page (check url changing by using forward)
				 
				                                     //sends request as new in home
			                                          // no need to use request dispatcher to use this send redirect
			}else {
				pw.println("Failure try once again");
				rd2.include(request, response);    
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");			// we are executing this because our response output consider as html not a text to the browser      
		String emailid = request.getParameter("emailid");
		String pass = request.getParameter("password");	
		
		RequestDispatcher rd1 = request.getRequestDispatcher("login.html"); //our request is dispached to login to login.html page
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Bharath@1405");

			PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
			
			pstmt.setString(1, emailid);
			pstmt.setString(2, pass);
			
			int res	= pstmt.executeUpdate(); // res returns no of rows affected.
			
			if(res>0) {
				pw.println("Account Created successfully");
			}
		} 
		catch (Exception e) {
			System.out.println(e);
			pw.println("Account didn't create, Email Id must be unique");
		}
		rd1.include(request, response); // the object of request dispatcher includes the target page in the same page 
	}
}