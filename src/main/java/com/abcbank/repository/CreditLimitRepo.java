package com.abcbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.abcbank.model.CreditLimitModel;

@Repository
public interface CreditLimitRepo extends JpaRepository<CreditLimitModel,Long> {

	

} 
