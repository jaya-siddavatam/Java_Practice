package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.*;
import com.dao.*;


public class EmployeeService {

	EmployeeDao ed = new EmployeeDao(); 
    
    public String storeEmployee(Employee emp) {    // emp is the object of Employee bean class
        if(emp.getSalar()<10000) {
            return "Employee salary must be > 10000";
        }else if(ed.storeEmployee(emp)>0) {
            return "Record inserted successfully";
        }else {
            return "Record didn't insert";
        }
    }
}

//    public List<Employee> getAllEmployee() {     // return type is belongs to Employee class

//        List<Employee> listOfEmp = ed.getAllEmployee();

//        Iterator <Employee> li = listOfEmp.iterator();

//        while(li.hasNext()) {
//            Employee emp = li.next();
//            emp.setSalar(emp.getSalar()+5000);
//        }
//        
//        return listOfEmp;
//    }
//}