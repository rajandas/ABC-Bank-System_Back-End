package com.abcbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.DisputedTransectionModel;

@Repository
public interface DisputedTransactionRepo extends JpaRepository<DisputedTransectionModel,Integer> {

	
 
}
