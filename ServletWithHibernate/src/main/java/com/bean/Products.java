package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//@Table(name= "Products")
@Entity                // this class is a entity class to connect
public class Products {
@Id                     // for primary key
private int pid;
//@column(name = "pname")
private String pname;
private float price;

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
public float getPrice() {
	return price;
	}
public void setPrice(float price) {
	this.price = price;
	}
@Override
public String toString() { // when object was called to print this tostring will override it and print blow values instead of hashcode
	return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}