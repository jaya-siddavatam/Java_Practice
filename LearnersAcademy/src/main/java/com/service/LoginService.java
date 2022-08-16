package com.service;

import com.bean.Login;

public class LoginService {

	
	public String checklogindetails (Login log) {
		if(log.getEmail().equals("jaya@gmail.com") && log.getPassword().equals("1234")){
			return"success";
		}
			else {
				return"Not Success";
			}
			
		}
}
