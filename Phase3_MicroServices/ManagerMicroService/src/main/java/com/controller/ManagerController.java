package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("manager")
public class ManagerController {
	
	
	@Autowired
	RestTemplate resttemplate;
	
	//http://localhost:9090/manager/jaya
	@GetMapping(value="jaya")
	public String jaya() {
		return "Welcome to spring manager micro service";
	}
	
	@GetMapping(value="findemployeethroughmanager/{empid}")
	public String getemployeedetails(@PathVariable("empid") int id) {	
	return resttemplate.getForObject("http://employee-micro-service-client:8383/employees/findemployee/"+id, String.class);
}

}
