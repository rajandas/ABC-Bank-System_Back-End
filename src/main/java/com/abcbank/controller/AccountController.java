package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.TempBillPayment;
import com.abcbank.service.AccountService;

@RestController
@CrossOrigin
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "/updateAccountBalance",method = RequestMethod.PUT)
	public Object updateAccountBalance(@RequestBody TempBillPayment tempBillPayment) {
		return (accountService.updateAccountBalance(tempBillPayment));
	}


}
