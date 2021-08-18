package com.abcbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.ChequebookModel;

@Repository
public interface ChequebookRepo extends JpaRepository<ChequebookModel,Integer> {
	

}
