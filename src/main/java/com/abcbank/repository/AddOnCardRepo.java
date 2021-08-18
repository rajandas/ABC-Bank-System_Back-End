package com.abcbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.AddOnCardModel;

@Repository
public interface AddOnCardRepo extends JpaRepository<AddOnCardModel,Integer> {

	
 
}
