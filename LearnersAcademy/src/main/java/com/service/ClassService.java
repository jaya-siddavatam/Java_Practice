package com.service;

import com.dao.ClassDao;

import java.util.List;

import com.bean.Class;
import com.bean.Student;
public class ClassService {
	

	   ClassDao cd = new ClassDao();
	    
	    public String storeclass(Class cls) {
	        if(cd.storeclass(cls)>0) {
	            return "Class details stored successfully";
	        }else {
	            return "Class details didn't store";
	        }
	    }  
	    public List<Class> findallclass() {
	        return cd.findallclasses();
	    }
	    
}
