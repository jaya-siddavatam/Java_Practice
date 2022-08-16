package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
@Id	
private int sid;
private String sname;

private Integer classtostd_id; //fk

public Integer getClasstostd_id() {
	return classtostd_id;
}
public void setClasstostd_id(Integer classtostd_id) {
	this.classtostd_id = classtostd_id;
}
public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", classtostd_id=" + classtostd_id + "]";
}
}