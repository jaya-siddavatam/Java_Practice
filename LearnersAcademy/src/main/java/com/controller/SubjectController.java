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
import com.bean.Subject;
import com.service.StudentService;
import com.service.SubjectService;

/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		SubjectService ss = new  SubjectService();
		List<Subject> listofsubject = ss.findallsubject();
		HttpSession hs = request.getSession();
		response.setContentType("text/html");
		hs.setAttribute("listofsubject", listofsubject);
	    response.setContentType("text/html");
	    response.sendRedirect("viewsubjects.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
        int sid = Integer.parseInt(request.getParameter("subid"));
        String sname = request.getParameter("subname");

        Subject s = new Subject();
        s.setSubid(sid);
        s.setSubname(sname);
       
        SubjectService ss = new SubjectService();
        
        String result = ss.storesubject(s);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storesubject.jsp");
        rd.include(request, response);
	}	
	}
