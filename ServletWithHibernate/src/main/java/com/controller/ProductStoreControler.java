package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Products;
import com.productservice.*;

/**
 * Servlet implementation class ProductStoreController
 */
public class ProductStoreControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductStoreControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		int pid = Integer.parseInt(request.getParameter("pid")); //changes string to integer
		
		String pname = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));
		
		Products p = new Products();
		
		p.setPid(pid);
		p.setPname(pname);
		p.setPrice(price);
		
		ProductService ps = new ProductService();
		
		String result = ps.storeProduct(p);
		
		pw.print(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("store.html");
		rd.include(request, response);
		
	}

}