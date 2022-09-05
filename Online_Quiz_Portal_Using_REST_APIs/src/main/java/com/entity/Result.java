package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Result implements Comparable<Result> { // we are comparing with the result object
	private String email;
	private Integer marks;
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Result(String emailid, Integer result) {
		super();
		this.email = emailid;
		this.marks = result;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Result [email=" + email + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Result result) {
		// TODO Auto-generated method stub
		int comparemarks= result.getMarks();
		return comparemarks-this.marks;
	}
}
