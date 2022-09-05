package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;




@Component
@Entity
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "uid")
	private User userid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quizid")
	private Quiz quizzid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private Questions questionid;
	private int testanswer;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	public Quiz getQuizzid() {
		return quizzid;
	}
	public void setQuizzid(Quiz quizzid) {
		this.quizzid = quizzid;
	}
	public Questions getQuestionid() {
		return questionid;
	}
	public void setQuestionid(Questions questionid) {
		this.questionid = questionid;
	}
	
	public int getTestanswer() {
		return testanswer;
	}
	public void setTestanswer(int testanswer) {
		this.testanswer = testanswer;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", userid=" + userid + ", quizzid=" + quizzid + ", questionid=" + questionid
				+ ", testanswer=" + testanswer + "]";
	}
	
	
	
}
