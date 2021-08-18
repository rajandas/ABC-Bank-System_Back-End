package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.service.BillPaymentService;


@RestController
@CrossOrigin
public class BillPaymentController {
	
	@Autowired
	private BillPaymentService billPaymentService;
	
	
	@RequestMapping(value = "/getBillPaymentDetails",method = RequestMethod.GET)
	public Object getAllBillPaymentDetails(){
		return (billPaymentService.getAllBillPaymentDetails());
	}

	

}
