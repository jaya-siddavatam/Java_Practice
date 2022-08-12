package com.service;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
	
	StudentDao sd = new StudentDao();
	
	public String Storestudentdetails(Student Student) { //import from bean class
		
	        if(sd.storestudent(Student)>0) {
	            return "Student details stored successfully";
	        }else {
	            return "Student details didn't store";
	        }
	    }
	    
	    public List<Student> findallstudent() {
	        return sd.findallstudent();
	    }
	}
