package com.bean;

public class Product{

private int pid;
private String pname;
private float pcost;

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, float pcost) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pcost = pcost;
}
public float getPcost() {
	return pcost;
}
public void setPcost(float pcost) {
	this.pcost = pcost;
}
@Override
public String toString() {  // this method present in object class so we have to over ride it
	return "ProductDetails [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
}
}