package com;

import java.sql.*;
import java.util.Scanner;
public class jdbconnection{

public static void main (String[] args) throws Exception {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Bharath@1405");
		System.out.println("Connected Successfully");
		//Statement stmt = con.createStatement();
		//System.out.println("Statement Ready");
		
		Scanner obj = new Scanner(System.in);
		
		//insert Query
//		int res = stmt.executeUpdate("insert into employee values(6,'Reddy',80000)");
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
		// insert using preparedStatement
		
//		PreparedStatement psmt = con.prepareStatement("insert into employee values (?,?,?)");
//		System.out.println("Enter the id");
//		int id = obj.nextInt();
//		psmt.setInt(1,id);		System.out.println("Enter the name");
//		String name = obj.next();
//		psmt.setString(2,name);
//		System.out.println("Enter Salary");
//		float Salar = obj.nextFloat();
//		psmt.setFloat(3, Salar);
//		int res = psmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record Inserted Successfully");
//		}
//		
		//delete query
//		int res = stmt.executeUpdate("delete from employee where id =6");
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}
//		else {
//			System.out.println("Record not found");
//		}
		//update query
//		int res = stmt.executeUpdate("update employee set salar=27000 where id =1");//res returns the no of rows affected.
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}
//		else {
//			System.out.println("Record not found");
//		}
		
		//retrive query we have to use execute Query
		
//		ResultSet rs = stmt.executeQuery("Select * from Employee");
		
//		while(rs.next()) {
//		System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salar"));
//		}
		
		PreparedStatement pstmt = con.prepareStatement("select * from employee where salar > ?");
		System.out.println("Enter the salary");
		
		float salary = obj.nextFloat();
		
		pstmt.setFloat(1, salary);
		
		ResultSet rs = pstmt.executeQuery(); // we are getting the rs as tabular format so we are using resultset while using retriving.
		// rs.next() scans the 1st row if we run onces and get 2nd row for 2nd time execution.
		while(rs.next()) {
			//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
			System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salar"));
			System.out.println("name is "+rs.getString(2));
		}
		obj.close();
		//stmt.close();
		//psmt.close();
		con.close();
		//rs.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
}