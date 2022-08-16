package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Class;
import com.bean.Student;
import com.service.ClassService;
import com.service.StudentService;


/**
 * Servlet implementation class ClassController
 */
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ClassService cs = new  ClassService();
		List<Class> listofclass = cs.findallclass();
		HttpSession hs = request.getSession();
		response.setContentType("text/html");
		hs.setAttribute("listofclass", listofclass);
	    response.setContentType("text/html");
	    response.sendRedirect("viewclasses.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		PrintWriter pw = response.getWriter();
		int cid = Integer.parseInt(request.getParameter("cid"));
		response.setContentType("text/html");
		String cname = request.getParameter("cname");
	
		 Class c = new Class();
		 c.setCid(cid);
		 c.setCname(cname);
		

		 ClassService cs = new ClassService();
		 String result = cs.storeclass(c);
		 pw.print(result);
		 RequestDispatcher rd = request.getRequestDispatcher("storeclass.jsp");
		 rd.include(request, response);		
	}
	
	}
