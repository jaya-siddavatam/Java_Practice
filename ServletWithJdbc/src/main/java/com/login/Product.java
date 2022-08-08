package com.login;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		int productid = Integer.parseInt(request.getParameter("id"));
		
		RequestDispatcher rd = request.getRequestDispatcher("index1.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Bharath@1405");
			
			Statement st = con.createStatement();
			
		
			ResultSet rs  = st.executeQuery("select * from product where id="+productid);
			
			
			if(rs.next()) {
				pw.println("successfully fetched and you are product name is");
				pw.print( rs.getString("name"));
			}else {
				pw.println("Enter the available product id in DB <br>");
				rd.include(request, response);    
				}
		}
			catch (Exception e) {
	
				System.out.println(e);
			}
		
		
		
}	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //	doGet(request, response);
	//}

}
