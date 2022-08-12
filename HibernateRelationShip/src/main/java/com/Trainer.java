package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Trainer {
@Id	
private int tid;
private String tname;
@OneToOne     // one trainer handle one course so one to one relation
private Course course;
@OneToMany      //one trainer handle more than one students
@JoinColumn(name ="tsid") // we are connecting to tsid FK in student table
private List<Students> listofstd; // we are storing students data in list

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
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public List<Students> getListofstd() {
	return listofstd;
}
public void setListofstd(List<Students> listofstd) {
	this.listofstd = listofstd;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", course=" + course + ", listofstd=" + listofstd + "]";
}
}