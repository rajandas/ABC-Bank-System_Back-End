package com.abcbank.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.BillPaymentModel;
import com.abcbank.repository.BillPaymentRepo;
import com.abcbank.service.BillPaymentService;


@Service
public class BillPaymentServiceImpl implements BillPaymentService{
	
	
	@Autowired
	private BillPaymentRepo billPaymentRepo;

	@Override
	@Transactional
	public Object getAllBillPaymentDetails() {
		
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		
		List<BillPaymentModel> billaPaymentList=billPaymentRepo.findAll();
		for(BillPaymentModel c:billaPaymentList)
		{
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("billerId", c.getBillerId());
			map.put("customerName", c.getAccount().getCustomer().getCustomerName());
			map.put("customerRequest", c.getCustomerRequest());
			map.put("accountNumber", c.getAccount().getAccountNumber());
			map.put("accountBalance", c.getAccount().getAccountBalance());
			map.put("billAmount", c.getBillAmount());
			map.put("BillStatus", c.getBillStatus());
			list.add(map);
		}
		
		return list;

		
	}


}
