package com.abcbank.serviceImpl;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.EmployeeModel;
import com.abcbank.repository.EmployeeRepo;
import com.abcbank.service.EmployeeService;




@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	@Transactional
	public Object getEmployeeWithField(EmployeeModel employeeModel) {

		EmployeeModel employee=employeeRepo.getDetails(employeeModel.getUsername(),employeeModel.getPassword());
		
		HashMap<String , Object> map=new HashMap<>();
		if(employee==null) {
			map.put("employeeId", 0);
		}
		else {
			map.put("employeeId", employee.getEmployeeId());
		}
		
		return map;
		
	}

	@Override
	@Transactional
	public List<EmployeeModel> getAllEmployees() {
		
		return employeeRepo.findAll();
	}
	
	
	
}





