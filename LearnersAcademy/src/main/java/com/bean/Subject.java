package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Subject {
@Id	
private int subid;
private String subname;

private Integer teachertosub_id; //fk
private Integer classtosub_id; //fk

public int getSubid() {
	return subid;
}
public void setSubid(int subid) {
	this.subid = subid;
}
public String getSubname() {
	return subname;
}
public void setSubname(String subname) {
	this.subname = subname;
}
public Integer getTeachertosub_id() {
	return teachertosub_id;
}
public void setTeachertosub_id(Integer teachertosub_id) {
	this.teachertosub_id = teachertosub_id;
}
public Integer getClasstosub_id() {
	return classtosub_id;
}
public void setClasstosub_id(Integer classtosub_id) {
	this.classtosub_id = classtosub_id;
}
@Override
public String toString() {
	return "Subject [subid=" + subid + ", subname=" + subname + ", teachertosub_id=" + teachertosub_id
			+ ", classtosub_id=" + classtosub_id + "]";
}
}