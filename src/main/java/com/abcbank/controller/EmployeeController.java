package com.abcbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.EmployeeModel;
import com.abcbank.service.EmployeeService;


@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;


	@RequestMapping(value = "/getEmployeeField",method = RequestMethod.POST)
	public Object getEmployeeByField(@RequestBody EmployeeModel employeeModel) {
		
		return(employeeService.getEmployeeWithField(employeeModel));
	}
	
	
	@RequestMapping(value = "/getEmployee",method = RequestMethod.GET)
	public List<EmployeeModel> getEmployees(){
		return (employeeService.getAllEmployees());
	}
	

}
