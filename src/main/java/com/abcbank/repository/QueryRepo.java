package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.QueryModel;

@Repository
public interface QueryRepo extends JpaRepository<QueryModel, Integer>{

}
 