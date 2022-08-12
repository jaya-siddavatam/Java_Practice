package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Products;
import com.productservice.ProductService;

/**
 * Servlet implementation class RetriveProductDetails
 */
public class RetriveProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //we are getting information from server and we are not sending any information to the server so we are using doget.
    //we are not passing any information to retrieve products through browser so we are using doget
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		ProductService ps = new ProductService();
		
		List<Products> listOfProduct = ps.findAllProduct();
		//HttpSession hs  = request.getSession();
		
		//hs.setAttribute("obj", listOfProduct);
		
	
		pw.println("<table border=1>");
		pw.println("<CAPTION>PRODUCTS DETAILS</CAPTION>");
		pw.println("<tr> <th>PId</th>  <th>PName</th>  <th>Price</th>  </tr>");
		
		Iterator<Products> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Products p = li.next();
			pw.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getPrice()+"</td></tr>");
		}
		
		pw.println("</table>");
		pw.println("<br/>");
		pw.println("<a href='index.html'> Go to Main page </a>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
}
}
