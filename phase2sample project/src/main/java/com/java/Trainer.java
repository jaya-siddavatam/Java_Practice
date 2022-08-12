package com.java;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.bean.Student;

@Entity
public class Trainer {
@Id	
private int tid;

private String tname;
private String tech;
@OneToMany
@JoinColumn(name="tsid")     //joining with FK in student class
private List<Student> listofstudents;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
}