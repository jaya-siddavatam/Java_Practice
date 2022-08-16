package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
	
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.getTransaction();
		
		System.out.println("Table was created for you");

//		Trainer tr = new Trainer();
//		tr.setTid(105);
//		tr.setTname("Navin Reddy");
//		tran.begin();
//		session.save(tr);
//		tran.commit();
//		System.out.println("Trainer record saved");
//		
//		
//		Students s1 = new Students();
//		
//		s1.setSid(5);
//		s1.setSname("swapna");
//		s1.setAge(24);
//		tran.begin();
//		session.save(s1);
//		tran.commit();
//		System.out.println("Student record saved");
		
	
//		Course c1 = new Course();
//		c1.setCname("C#");
//		c1.setFess(25000);
//		tran.begin();
//		session.save(c1);
//		tran.commit();
//		System.out.println("Course saved successfully");
//	
		// Assign Student with Trainer;
		Students s1 = session.get(Students.class, 5); // one student 5th
		
		if(s1==null) {
			System.out.println("Student not present");
		}else {
				tran.begin();
				s1.setTsid(102);  //is assigned to trainer 102
				session.update(s1);
				tran.commit();
				System.out.println("Student assigned to trainer successfully");
		}	
	}
}