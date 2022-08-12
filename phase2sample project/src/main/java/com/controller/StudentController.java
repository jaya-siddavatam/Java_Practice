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

import com.bean.Student;
import com.java.Trainer;
import com.service.StudentService;
import com.service.TrainerService;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentService ss = new  StudentService();
		List<Student> listofstudent = ss.findallstudent();
		HttpSession hs = request.getSession();
		response.setContentType("text/html");
		hs.setAttribute("listofstudent", listofstudent);
	    response.setContentType("text/html");
	    response.sendRedirect("ViewStudent.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
        int sid = Integer.parseInt(request.getParameter("sid"));
        String sname = request.getParameter("sname");
        int age = Integer.parseInt(request.getParameter("age"));
        Student s = new Student();
        s.setSid(sid);
        s.setSname(sname);
        s.setAge(age);
        StudentService ss = new StudentService();
        String result = ss.Storestudentdetails(s);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storeStudent.jsp");
        rd.include(request, response);
	}
}
