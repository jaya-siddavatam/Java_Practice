package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDao {
	
//	public int storeEmployee(Employee emp) {     // emp is the object of Employee bean class
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Bharath@1405");
//PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//pstmt.setInt(1, emp.getId());
//pstmt.setString(2, emp.getName()); // using emp object we can fetch the methods of bean class
//pstmt.setFloat(3, emp.getSalar());
//        int res = pstmt.executeUpdate();
//        return res;
//        } catch (Exception e) {
//            System.out.println(e);
//            return 0;
//        }
//    }
	
	
	public int storeEmployee(Employee emp) {
		try {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.getTransaction();
		tran.begin();
		session.save(emp);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	
//	public List<Employee> getAllEmployee() {
//	        List<Employee> listOfEmp =new ArrayList<Employee>();
//	        try {
//	            Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Bharath@1405");
//	PreparedStatement pstmt = con.prepareStatement("select * from employee");
//	        ResultSet rs = pstmt.executeQuery();
//	        while(rs.next()) {
//	            Employee emp  = new Employee();
//	            emp.setId(rs.getInt(1));
//	            emp.setName(rs.getString(2));
//	            emp.setSalar(rs.getFloat(3));
//	            listOfEmp.add(emp);
//	        }
//	        } catch (Exception e) {
//	        
//	        }
//	        return listOfEmp;
//	    }
}
