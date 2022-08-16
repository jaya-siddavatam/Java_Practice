package com.service;

import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {
	
	StudentDao sd = new StudentDao();
	
	public String storetudentdetails(Student Student) { //import from bean class
		
	        if(sd.storetudent(Student)>0) {
	            return "Student details stored successfully";
	        }else {
	            return "Student details didn't store";
	        }

	}
	
	public List<Student> findallstudent() {
        return sd.findallstudents();
    }
}
