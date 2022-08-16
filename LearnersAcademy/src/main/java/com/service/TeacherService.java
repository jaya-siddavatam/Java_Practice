package com.service;

import java.util.List;

import com.bean.Student;
import com.bean.Teacher;
import com.dao.TeacherDao;

public class TeacherService {
	
	   TeacherDao td = new TeacherDao();
	   public String storeteacher(Teacher teacher) {
	        if(td.storeteacher(teacher)>0) {
	            return "Teacher details stored successfully";
	        }else {
	            return "Teacher details didn't store";
	        }
	    }

	   
	   public List<Teacher> findallteacher() {
	        return td.findallteachers();
	    }
}
