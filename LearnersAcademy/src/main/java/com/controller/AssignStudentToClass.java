package com.controller;

import java.io.IOException;
import java.io.PrintWriter;



import com.bean.Student;
import com.bean.Class;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Servlet implementation class AssignStudentToClass
 */
public class AssignStudentToClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignStudentToClass() {
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
		RequestDispatcher rd = request.getRequestDispatcher("assignstudenttoclass.jsp");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
        int sid = Integer.parseInt(request.getParameter("sid"));
        int clsid = Integer.parseInt(request.getParameter("cid"));
       
		try {
            Configuration con = new Configuration();
            con.configure("hibernate.cfg.xml");
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tran = session.getTransaction();
            
            Student std = new Student();
            std.setSid(sid);

            Class c = session.get(Class.class, clsid);
            
           
    		
    		if(c==null) {
  
    			pw.print("Class did  not present enter correct id <br>");
    			rd.include(request, response);
    			}
    		else {
    				tran.begin();
    				c.getListofstudent().add(std);
    				session.save(c);
    				//session.save();
    				tran.commit();
    				pw.print("Student assigned to class successfully <br>");
    				rd.include(request, response);
    		}        
		} catch (Exception e) {
            pw.print("Student is already assigned to class");
            rd.include(request, response);
        }
	}
}