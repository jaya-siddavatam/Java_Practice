package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) //generate and auto increment the ID
private int cid;
private String cname;
private float fess;
@OneToMany
@JoinColumn(name="csid")
private List<Students> listofstudents;
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
public float getFess() {
	return fess;
}
public void setFess(float fess) {
	this.fess = fess;
}
public List<Students> getListofstudents() {
	return listofstudents;
}

public void setListofstudents(List<Students> listofstudents) {
	this.listofstudents = listofstudents;

}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", fess=" + fess + ", listofstudents=" + listofstudents + "]";
}
}