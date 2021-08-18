package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abcbank.model.EmployeeModel;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer>{

	@Query("select u from EmployeeModel u where u.username=:username and u.password=:password")
	EmployeeModel getDetails(@Param("username") String username,@Param("password") String password);
 
	
	
	
}
