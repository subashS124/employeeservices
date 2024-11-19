package com.org.employeeservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.employeeservices.services.EmployeeDetailsServices;

@RestController
public class EmployeeServicesController {

	@Autowired
	EmployeeDetailsServices employeeService;
	
	@GetMapping("getEmployees")
	public String getEmployees() {		
		return employeeService.getEmployeeDetails();
	}

}
