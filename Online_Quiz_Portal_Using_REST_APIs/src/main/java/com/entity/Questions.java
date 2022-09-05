package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Questions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  qid;
	 private String question;
	 private String op1;
	 private String op2;
	 private String op3;
	 private int correctanswer;
	 
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Questions(int qid, String question, String op1, String op2, String op3, int correctanswer) {
		super();
		this.qid = qid;
		this.question = question;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.correctanswer = correctanswer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOp1() {
		return op1;
	}
	public void setOp1(String op1) {
		this.op1 = op1;
	}
	public String getOp2() {
		return op2;
	}
	public void setOp2(String op2) {
		this.op2 = op2;
	}
	public String getOp3() {
		return op3;
	}
	public void setOp3(String op3) {
		this.op3 = op3;
	}
	public int getCorrectanswer() {
		return correctanswer;
	}
	public void setCorrectanswer(int correctanswer) {
		this.correctanswer = correctanswer;
	}
}