package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.AccountModel;



@Repository
public interface AccountRepo extends JpaRepository<AccountModel,Long>{

}
