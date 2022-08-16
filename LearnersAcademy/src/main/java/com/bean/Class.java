package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Class {
@Id	
private int cid; //pk
private String cname;
private Integer teachertoclass_id;   //fk

@OneToMany              //one class(pk) to many teachers (fk)in subjects table
@JoinColumn(name ="classtosub_id")
private List<Subject> listofsubject = new ArrayList<>();
@OneToMany              //one class(pk) to many teachers (fk)in students table
@JoinColumn(name ="classtostd_id")
private List<Student> listofstudent = new ArrayList<>();


public List<Student> getListofstudent() {
	return listofstudent;
}
public void setListofstudent(List<Student> listofstudent) {
	this.listofstudent = listofstudent;
}
public List<Subject> getListofsubject() {
	return listofsubject;
}
public void setListofsubject(List<Subject> listofsubject) {
	this.listofsubject = listofsubject;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Integer getTeachertoclass_id() {
	return teachertoclass_id;
}
public void setTeachertoclass_id(Integer teachertoclass_id) {
	this.teachertoclass_id = teachertoclass_id;
}
@Override
public String toString() {
	return "Class [cid=" + cid + ", cname=" + cname + ", teachertoclass_id=" + teachertoclass_id + ", listofsubject="
			+ listofsubject + ", listofstudent=" + listofstudent + "]";
}
}