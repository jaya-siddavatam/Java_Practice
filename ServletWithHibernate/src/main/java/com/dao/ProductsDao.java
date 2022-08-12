package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Products;

public class ProductsDao {       //	Database logics should write in this dao class
         // to store or insert the data in database
		public int storeProduct(Products product) {     // like int a, string name and float ft we are passing Products class and product object 
		                                                // here a , name , ft are objects of class Integer string and Float
		//when we insert the duplicate value as PK it will trow error so we are using this try catch block
			try {
				Configuration con = new Configuration();// we are creating obj of configuration method hibernate class to load and configure  with DB
				con.configure("hibernate.cfg.xml"); // we are loading xml file
				SessionFactory sf = con.buildSessionFactory();//like connection in JDBC
				
				Session session = sf.openSession();//like statements and prepared statements in JDBC 
				
				Transaction tran = session.getTransaction(); //transaction is used to commit changes for DML statements
				tran.begin();
						session.save(product); // .save method used to insert
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
		}
		
	//hybernate does not throw checked exception
		
		public int deleteProduct(int pid) {           // we are deleting the product using PK so we are using pid as parameter
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				Transaction tran = session.getTransaction();
				
				Products pp	= session.get(Products.class, pid); // it takes two parameters in 1st parameter we have to use entity class and 2nd is PK
				// and return type of session is products
				if(pp==null) {
					return 0;
				}else {
					tran.begin();	
					session.delete(pp); //.delete method used to delete from db and a record is directly convert into objects
					tran.commit();
					return 1;
				}	
		}
		
// we can update product table using any one of attribute using PK so here we are using product object
		public int updateProduct(Products product) {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			
			Products pp	= session.get(Products.class, product.getPid()); // we are passing complete product obj so we are using product.getid()
			
			if(pp==null) {
				return 0;
			}else {
				tran.begin();	
				
				pp.setPrice(product.getPrice());    //replacing the price  
			  //pp.setPrice(pp.getPrice()+100);     //just adding 100 for existing price
					session.update(pp); // same like update Product set price = newprice where pid = 100    
				tran.commit();
				return 1;
			}
		
	}
	//it will search the product	
	// it will return a obj(row) of product of the input pid	
	public Products findProduct(int pid) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Products pp	= session.get(Products.class, pid);
		
		return pp;
	}
	public List<Products> findallproducts() {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		TypedQuery qry	= session.createQuery("select p from Products p");
		List<Products> listOfProducts = qry.getResultList();
		return listOfProducts;
	}
	
	public List<Products> findAllProductUsingPrice(float price) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		//TypedQuery qry	= session.createQuery("select p from Product p where p.price > 5000");// this is Static where clause  
		TypedQuery qry	= session.createQuery("select p from Product p where p.price > :myPrice"); // dynamic where clause value using label query
		//here myprice is variable
		qry.setParameter("myPrice", price);
		List<Products> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	public List<String> retrieveOnlyProductName() {   //here we are retrieving only productname soo return type is string
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		TypedQuery qry	= session.createQuery("select p.pname from Product p");
		List<String> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	public List<Float> retrieveOnlyProductPrice() {  //here we are retrieving only product price so return type is float.
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
 
		TypedQuery qry	= session.createQuery("select p.price from Product p"); //p.price
		
		List<Float> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	// method to retrieve partial object (object array type casting)  
			public List<Object[]> retrieveproductnameandprice() {  // we are retrieving two different data types so we are using object array type casting
				
				Configuration con = new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf = con.buildSessionFactory();
				Session session = sf.openSession();
				
				TypedQuery qry	= session.createQuery("select p.pname,p.price from Products p");
				List<Object[]> listOfProduct = qry.getResultList();
				return listOfProduct;
			}
}