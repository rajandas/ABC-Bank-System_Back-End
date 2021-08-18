package com.abcbank.service;

import java.util.List;

import com.abcbank.model.EmployeeModel;

public interface EmployeeService {

	 
	public Object getEmployeeWithField(EmployeeModel employeeModel);

	public List<EmployeeModel> getAllEmployees();
	
}
