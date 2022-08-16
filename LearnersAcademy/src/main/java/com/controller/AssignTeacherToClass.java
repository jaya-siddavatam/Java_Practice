package com.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Class;

/**
 * Servlet implementation class AssignTeacherToClass
 */
public class AssignTeacherToClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTeacherToClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher rd = request.getRequestDispatcher("assignteachertoclass.jsp");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		 int tid = Integer.parseInt(request.getParameter("tid"));
	     int cid = Integer.parseInt(request.getParameter("cid"));   
	     try {
	            Configuration con = new Configuration();
	            con.configure("hibernate.cfg.xml");
	            SessionFactory sf = con.buildSessionFactory();
	            Session session = sf.openSession();
	            Transaction tran = session.getTransaction();
//	            Class c = new Class();
//	            c.setTeachertoclass_id(tid);
	            //Teacher t = session.get(Teacher.class, tid);
	            
	            Class cls = session.get(Class.class, cid); // many class
	            if(cls==null) {
	            	  
	    			pw.print("Class did  not present enter correct id <br>");
	    			rd.include(request, response);
	    			}
	    		else {
	    				tran.begin();
	    				cls.setTeachertoclass_id(tid); //by one teacher
	    				session.update(cls);
	    				tran.commit();
	    				pw.print("Taecher assigned to class successfully <br>");
	    				rd.include(request, response);
	    		}        
			} catch (Exception e) {
	            pw.print("Either Teacher or Class Does not Present <br>");
	            pw.print(e);
	            rd.include(request, response);
	        }
	}	
}