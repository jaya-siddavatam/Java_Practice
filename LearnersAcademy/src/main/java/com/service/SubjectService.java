package com.service;

import java.util.List;

import com.bean.Student;
import com.bean.Subject;
import com.dao.SubjectDao;

public class SubjectService {
	
	
	 SubjectDao sd = new SubjectDao();
	    
	    public String storesubject(Subject sub) {
	        if(sd.storesubject(sub)>0) {
	            return "Subject details stored successfully";
	        }else {
	            return "Subject details didn't store";
	        }
	    }
	    public List<Subject> findallsubject() {
	        return sd.findallsubjects();
	    }
}



