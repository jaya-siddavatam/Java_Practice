package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Result;
import com.entity.Test;
import com.entity.User;
import com.repository.ParticipantsRepository;
import com.repository.QuizRepository;
import com.repository.TestRepository;



@Service
public class ParticipantsService {
	
	List<Result> list=new ArrayList<>();
	
	@Autowired
	ParticipantsRepository user;
	@Autowired
	QuizRepository quizrepo;
	@Autowired
	TestRepository testrepo;	
	@Autowired
	User u;
	@Autowired
	Test t;
	
	
	public String userlogin(String email,String password)
	{
		u=user.findByEmailid(email);
		if(u!=null)
		{	
			if(u.getEmailid().equals(email)&&u.getPassword().equals(password))
		{
			return " User login sucessfull";
		}
			else
		{
			return "Invalid credentials";
		}			
	}
		else
	{
			return "User not found please register";
	}	
  }
	
	
	public String userRegister(User u)
	{
		if(user.findByEmailid(u.getEmailid())==null)
		{
			user.save(u);
			return "User registered Successfully";
		}
		else
		{
			return "User already exists";
		}
	}
	
	public List<Object> viewAllQuiz()
	{
		return quizrepo.listOfQuiz();
	}
	
	public String takeTest(Test t)
	{
		if(t!=null)
		{
			testrepo.save(t);
			return "Test submitted Successfully";
		}	
		else
		{
			return "Test did not submited";
		}		
	}
	
	public List<Test> getTestList()
	{
		return testrepo.findAll();
	}
	
	public List<Result> result()
	{	
		String email="";
		int marks=0;
		List<Test> obj=testrepo.findAll();
		List<User> u = user.findAll();
		for (User user : u) {
			marks=0;
			email=user.getEmailid();
			for(Test ob :obj)
			{
				if(user.getUid()==ob.getUserid().getUid())
				{
					
					if(ob.getTestanswer()== ob.getQuestionid().getCorrectanswer())
					{
						marks++;
					}
				}
			}
			list.add(new Result(email,marks));			
		}
		Collections.sort(list);
		
		return list;
		
	}	
}