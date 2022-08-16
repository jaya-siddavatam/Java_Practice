package com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Teacher {

@Id	
private int tid;
private String tname;

@OneToMany               //one teacher can handle more than one class
@JoinColumn(name ="teachertoclass_id") // we are connecting to ttcid FK in class table
private List<Class> listofclass = new ArrayList<>();
@OneToMany                  //pk to fk //one teacher can handle more than one subject
@JoinColumn(name ="teachertosub_id") // we are connecting to tsubid FK in subject table
private List<Subject> listofsubject = new ArrayList<>();

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
public List<Class> getListofclass() {
	return listofclass;
}
public void setListofclass(List<Class> listofclass) {
	this.listofclass = listofclass;
}
public List<Subject> getListofsubject() {
	return listofsubject;
}
public void setListofsubject(List<Subject> listofsubject) {
	this.listofsubject = listofsubject;
}
@Override
public String toString() {
	return "Teacher [tid=" + tid + ", tname=" + tname + ", listofclass=" + listofclass + ", listofsubject="
			+ listofsubject + "]";
}
}