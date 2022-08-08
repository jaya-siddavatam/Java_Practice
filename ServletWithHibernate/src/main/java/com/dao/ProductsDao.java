package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Products;

public class ProductsDao {

		public int storeProduct(Products product) {
			try {
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				
				Transaction tran = session.getTransaction();
				tran.begin();
						session.save(product);
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}
		
		
		public int deleteProduct(int pid) {
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				Transaction tran = session.getTransaction();
				Products pp	= session.get(Products.class, pid);
				if(pp==null) {
					return 0;
				}else {
					tran.begin();	
					
					session.delete(pp);
					
					tran.commit();
					return 1;
				}
			
		}
		
		
		public int updateProduct(Products product) {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			Products pp	= session.get(Products.class, product.getPid());
			if(pp==null) {
				return 0;
			}else {
				tran.begin();	
				
				pp.setPrice(product.getPrice());    
				//pp.setPrice(pp.getPrice()+100);
					session.update(pp); // update Product set price = newprice where pid = 100    
				tran.commit();
				return 1;
			}
		
	}		
	public Products findProduct(int pid) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Products pp	= session.get(Products.class, pid);
		return pp;
	}	
	
}

