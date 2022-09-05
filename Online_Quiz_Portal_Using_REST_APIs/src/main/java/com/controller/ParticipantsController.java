package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Result;
import com.entity.Test;
import com.entity.User;
import com.service.ParticipantsService;

@RestController
@RequestMapping("user")
public class ParticipantsController {
	
	@Autowired
	ParticipantsService ps;
	
	//http://localhost:8080/user/login
	@PostMapping(value="login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userLogin(@RequestBody User u)
	{
			return ps.userlogin(u.getEmailid(), u.getPassword());
	}
	
	//http://localhost:8080/user/register
	@PostMapping(value="register", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userRegiter(@RequestBody User u)
	{
		return ps.userRegister(u);
	}
	
	//http://localhost:8080/user/viewquiz
	@GetMapping(value="viewquiz", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Object> viewQuiz(){
			return ps.viewAllQuiz();
	}
	
	//http://localhost:8080/user/taketest
	@PostMapping(value="taketest", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String takeTest(@RequestBody Test t){
			return ps.takeTest(t);
	}
	
	//http://localhost:8080/user/getalltests
	@GetMapping(value="getalltests", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Test> getAllTests(){
			return ps.getTestList();
	}
	
	//http://localhost:8080/user/getresult
	@GetMapping(value="getresult", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Result> getresult(){
			return ps.result();
	}
}