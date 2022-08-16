package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Student;
import com.bean.Teacher;



public class TeacherDao {
	public int storeteacher(Teacher teacher) {
        try {
            Configuration con = new Configuration();
            con.configure("hibernate.cfg.xml");
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tran = session.getTransaction();
            tran.begin();
                    session.save(teacher);
            tran.commit();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
	public List<Teacher> findallteachers() {
		   
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        TypedQuery qry = session.createQuery("Select t from Teacher t");
        
        List<Teacher> listofteacher = qry.getResultList();
        return listofteacher;	
}
}