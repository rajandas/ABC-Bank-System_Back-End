package com.abcbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.LostStolenCardsModel;

@Repository
public interface LostStolenCardRepo extends JpaRepository<LostStolenCardsModel,Integer> {

	

} 
