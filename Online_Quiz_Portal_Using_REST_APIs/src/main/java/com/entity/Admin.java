package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component  // to enable the entity 
@Entity
public class Admin {
@Id
private int id;
private String emailid;
private String password;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Admin [id=" + id + ", emailid=" + emailid + ", password=" + password + "]";
}
}