package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");  // to load we need obj of configuration
		SessionFactory sf = con.buildSessionFactory(); // SessionFactory is used for connection to DB
		Session session = sf.openSession(); //we use session object to do DMl operations
		Transaction tran = session.getTransaction(); // we use transaction to commit changes made by us
		
		Question q1 = new Question();
		q1.setQid(3);
		q1.setQuestion("What is 4 * 5");
		String ans[]= {"22","20","19","25"};
		
		q1.setAnswers(ans);
		q1.setCorrectanswer("20");
		
		tran.begin();
			session.save(q1); // we are inserting so we use save method
		tran.commit();
		System.out.println(" Question is Stored in DB");
	}

}
