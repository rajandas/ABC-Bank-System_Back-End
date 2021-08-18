package com.abcbank.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.AccountModel;
import com.abcbank.model.BillPaymentModel;
import com.abcbank.model.TempBillPayment;
import com.abcbank.repository.AccountRepo;
import com.abcbank.repository.BillPaymentRepo;
import com.abcbank.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService{
	
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private BillPaymentRepo billPaymentRepo;

	

	@Override
	@Transactional
	public Object updateAccountBalance(TempBillPayment tempBillPayment) {
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		
		
		 
		AccountModel accountModel= accountRepo.getById(tempBillPayment.getAccountNumber());
		if(tempBillPayment.getBillStatus().equals("Paid") || tempBillPayment.getBillStatus().equals("Force Paid")) {
			
			accountModel.setAccountBalance(accountModel.getAccountBalance()-tempBillPayment.getBillAmount());
			AccountModel obj=accountRepo.saveAndFlush(accountModel);
			if(obj==null) {
				map.put("status", "404");
				map.put("message", "Updation Failed");
			}
			else {
				
				BillPaymentModel objbill= billPaymentRepo.getById(tempBillPayment.getBillerId());
				objbill.setBillStatus(tempBillPayment.getBillStatus());
				billPaymentRepo.saveAndFlush(objbill);
				map.put("status", "200");
				map.put("message", "Bill Payment is Successfull");
			}
			
		}    
		
		else {
			
			BillPaymentModel objbill= billPaymentRepo.getById(tempBillPayment.getBillerId());
			objbill.setBillStatus(tempBillPayment.getBillStatus());
			billPaymentRepo.saveAndFlush(objbill);
			map.put("status", "200");
			map.put("message", "Bill Payment is Rejected");
		}
		
		return map;
		
	}

}
