package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.entity.Admin;
import com.entity.Questions;
import com.entity.Quiz;
import com.entity.Standings;
import com.repository.AdminRepository;
import com.repository.ParticipantsRepository;
import com.repository.QuestionsRepository;
import com.repository.QuizRepository;

@Service
public class AdminService {
	@Autowired
	QuestionsRepository questionrepo;
	@Autowired
	QuizRepository quizrepo;
	@Autowired
	ParticipantsRepository userrepo;
	@Autowired
	Standings stat;
	@Autowired
	AdminRepository adminrepo;
	
	
	public String adminlogin(Admin admin)
	{
		Admin ad= adminrepo.findById(1).get();
		if(admin.getEmailid().equals(ad.getEmailid()) && admin.getPassword().equals(ad.getPassword()))
		{
			return "Admin Login Successful";
		}
		else
		{
			return "Invalid Admin Credentials";
		}
	}
	
	
	public String changepassword(Admin admin)
	{
		Admin ad= adminrepo.findById(1).get();
		ad.setPassword(admin.getPassword());
		adminrepo.save(ad);
			return "Password Changed Successfully";
	}
	
	public String addquestion(Questions ques)
	{
		if(ques!=null)
		{
			questionrepo.save(ques);
			return "Question added Successfully";
		}
		else
		{
			return "Question did not add id must be unique";
		}	
	}
	
	public String addQuiz(Quiz q)
	{	
		if(q!=null)
		{
			quizrepo.save(q);
			return "Quiz added Successfully";
		}
		else
		{
			return "Failed to add Quiz id must be Unique";
		}
	}
	
	public List<Quiz> viewAllQuiz()
	{
		return quizrepo.findAll();
	}
	
	public Standings quizinfo()
	{
		stat.setUsers(userrepo.findAll().size());
		stat.setQuestions(questionrepo.findAll().size());
		stat.setQuiz(quizrepo.listOfQuiz());
		return stat;

	}
}
