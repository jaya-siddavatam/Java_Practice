package com.main;

import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
        emp1.setId(8);
        emp1.setName("sagar");
        emp1.setSalar(12000);
        
        EmployeeService es = new EmployeeService();
        String result = es.storeEmployee(emp1);
        System.out.println(result);
	}
	
//	EmployeeService es = new EmployeeService();
//	List <Employee> listofEmp = es.getAllEmployee();{
//		
//	for(Employee emp:listofEmp) {
//		System.out.println(listofEmp);
//	}
//	}
}
