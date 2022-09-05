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
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quizid;
	private String title;
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private Questions qid;
	private int quizno;
	public int getQuizno() {
		return quizno;
	}

	public void setQuizno(int quizno) {
		this.quizno = quizno;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(int quizid, String title, Questions qid) {
		super();
		this.quizid = quizid;
		this.title = title;
		this.qid = qid;
	}
	public int getQuizid() {
		return quizid;
	}
	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Questions getQid() {
		return qid;
	}
	public void setQid(Questions qid) {
		this.qid = qid;
	}

	@Override
	public String toString() {
		return "Quiz [quizid=" + quizid + ", title=" + title + ", qid=" + qid + ", quizno=" + quizno + "]";
	}
}
