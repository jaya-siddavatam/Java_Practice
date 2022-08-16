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

import com.bean.Subject;
import com.bean.Teacher;

/**
 * Servlet implementation class AssignTeacherToSubject
 */
public class AssignTeacherToSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTeacherToSubject() {
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
		RequestDispatcher rd = request.getRequestDispatcher("assignteachertosubject.jsp");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
        int tid = Integer.parseInt(request.getParameter("tid"));
        int subid = Integer.parseInt(request.getParameter("subid"));
        
        try {
            Configuration con = new Configuration();
            con.configure("hibernate.cfg.xml");
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tran = session.getTransaction();
            
            Subject sub = session.get(Subject.class ,subid); //many sub
            //sub.setTeachertosub_id(subid);
            
           // Teacher t = session.get(Teacher.class, tid);
            
        	if(sub==null) {
        		  
    			pw.print("Subject did  not present enter correct id <br>");
    			rd.include(request, response);
    			}
    		else {
    				tran.begin();
    				sub.setTeachertosub_id(tid);       //one tid teacher
    				session.update(sub);
    				tran.commit();
    				pw.print("Teacher assigned to Subject successfully <br>");
    				rd.include(request, response);
    		} 
        } catch (Exception e) {
            pw.print("Teacher did not  assigned to Subject");
            pw.print(e);
            rd.include(request, response);
        }
	}
}