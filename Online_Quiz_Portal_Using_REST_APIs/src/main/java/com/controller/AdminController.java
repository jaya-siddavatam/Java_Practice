package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Admin;
import com.entity.Questions;
import com.entity.Quiz;
import com.entity.Result;
import com.entity.Standings;
import com.service.AdminService;
import com.service.ParticipantsService;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	@Autowired
	AdminService as;
	@Autowired
	ParticipantsService ps;
	
	//http://localhost:8080/admin/login
	@PostMapping(value="login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String adminLogin(@RequestBody Admin admin){
		return as.adminlogin(admin);
		}
	
	//http://localhost:8080/admin/changepassword
	@PatchMapping(value="changepassword", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String adminUpdate(@RequestBody Admin admin){
		return as.changepassword(admin);
		}
	
	//http://localhost:8080/admin/addquestions
	@PostMapping(value="addquestions", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuestion(@RequestBody Questions ques){
		return as.addquestion(ques);
		}
	
	//http://localhost:8080/admin/addquiz
	@PostMapping(value="addquiz", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuiz(@RequestBody Quiz quiz){
		return as.addQuiz(quiz);
		}
	
	//http://localhost:8080/admin/viewallquiz
	@GetMapping(value="viewallquiz", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> viewAllQuiz(){
			return as.viewAllQuiz();
	}
	
	//http://localhost:8080/admin/quizinfo
	@GetMapping(value="quizinfo", produces= MediaType.APPLICATION_JSON_VALUE)
	public Standings quizinfo(){
		return as.quizinfo();
		}
	
	//http://localhost:8080/admin/results
	@GetMapping(value="results", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Result> getadminresults(){
		return ps.result();
		}	
}