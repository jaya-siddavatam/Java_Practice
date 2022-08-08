package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employee")
public class Employee {
@Id                         // primary key
private int id;
@Column(name="name")
private String name;
private float salar;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalar() {
	return salar;
}
public void setSalar(float salar) {
	this.salar = salar;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salar) {
	super();
	this.id = id;
	this.name = name;
	this.salar = salar;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salar=" + salar + "]";
}
}