package com.abcbank.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.AddOnCardModel;
import com.abcbank.model.ChequebookModel;
import com.abcbank.model.CreditLimitModel;
import com.abcbank.model.DisputedTransectionModel;
import com.abcbank.model.LostStolenCardsModel;
import com.abcbank.model.QueryModel;
import com.abcbank.repository.AddOnCardRepo;
import com.abcbank.repository.ChequebookRepo;
import com.abcbank.repository.CreditLimitRepo;
import com.abcbank.repository.DisputedTransactionRepo;
import com.abcbank.repository.LostStolenCardRepo;
import com.abcbank.repository.QueryRepo;
import com.abcbank.service.RequestListService;


@Service
public class RequestListServiceImpl implements RequestListService {

	@Autowired
	private ChequebookRepo chequebookRepo;
	
	@Autowired
	private AddOnCardRepo addOnCardRepo;
	
	@Autowired
	private DisputedTransactionRepo disputedTransactionRepo;
	
	@Autowired
	private LostStolenCardRepo lostStolenCardRepo;
	
	@Autowired
	private CreditLimitRepo creditLimitRepo;
	
	@Autowired
	private QueryRepo queryRepo;


	@Override
	@Transactional
	public Object getAllRequests() {
		
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		
		List<ChequebookModel> chequelist=chequebookRepo.findAll();
		for(ChequebookModel c:chequelist)
		{
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("requestId", c.getChequebookNo());
			map.put("requestType", "Chequebook");
			map.put("accoutnNumber", c.getAccount().getAccountNumber());
			map.put("accountType",c.getAccount().getAccountType());
			map.put("customerName", c.getAccount().getCustomer().getCustomerName());
			map.put("requestDate",c.getRequestDate());
			map.put("noOfLeaves",c.getNoOfLeaves());
			map.put("status",c.getStatus());
			list.add(map);
		}
		
		
		List<AddOnCardModel> addOnCardList=addOnCardRepo.findAll();
		
		for(AddOnCardModel c:addOnCardList)
		{
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("requestId", c.getId());
			map.put("requestType", "Add-On_Card");
			map.put("accoutnNumber", c.getAccount().getAccountNumber());
			map.put("accountType",c.getAccount().getAccountType());
			map.put("customerName", c.getAccount().getCustomer().getCustomerName());
			map.put("requestDate",c.getRequestDate());
			map.put("status",c.getStatus());
			list.add(map);
		}
		
		List<DisputedTransectionModel> disputedTransactionList=disputedTransactionRepo.findAll();
		
		for(DisputedTransectionModel c:disputedTransactionList)
		{
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("requestId", c.getId());
			map.put("requestType", "Disputed_Transection");
			map.put("accoutnNumber", c.getAccount().getAccountNumber());
			map.put("accountType",c.getAccount().getAccountType());
			map.put("customerName", c.getAccount().getCustomer().getCustomerName());
			map.put("requestDate",c.getRequestDate());
			map.put("status",c.getStatus());
			map.put("merchantName",c.getMerchantName());
			map.put("cardNo",c.getCardNo());
			map.put("dateOfTransection",c.getDateOfTransection());
			map.put("reasonForDispute",c.getReasonForDispute());
			list.add(map);
		}
		
		List<LostStolenCardsModel> lostStolenCardsList=lostStolenCardRepo.findAll();
		
		for(LostStolenCardsModel c:lostStolenCardsList)
		{
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("requestId", c.getCardId());
			map.put("requestType", "Lost_Stolen_Card");
			map.put("accoutnNumber", c.getAccount().getAccountNumber());
			map.put("accountType",c.getAccount().getAccountType());
			map.put("customerName", c.getAccount().getCustomer().getCustomerName());
			map.put("requestDate",c.getRequestDate());
			map.put("status",c.getStatus());
			map.put("cardNo",c.getCardNo());
			map.put("cardType",c.getCardType());
			list.add(map);
		}
		
		List<CreditLimitModel> creditLimitModelList=creditLimitRepo.findAll();
		
		for(CreditLimitModel c:creditLimitModelList)
		{
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("requestId", c.getCardNumber());
			map.put("requestType", "Increase_Credit_Limit");
			map.put("accoutnNumber", c.getAccount().getAccountNumber());
			map.put("accountType",c.getAccount().getAccountType());
			map.put("customerName", c.getAccount().getCustomer().getCustomerName());
			map.put("requestDate",c.getRequestDate());
			map.put("status",c.getStatus());
			map.put("cardType",c.getCardType());
			map.put("currentCreditLimit",c.getCurrentCreditLimit());
			map.put("maxCreditLimit",c.getMaxCreditLimit());
			map.put("requestedCreditLimit",c.getRequestedCreditLimit());
			list.add(map);
		}
		
		return list;	
		
	}


	@Override
	@Transactional
	public Object getChequebookData(int id) {
		
		ChequebookModel c= chequebookRepo.findById(id).orElse(null);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("requestId", c.getChequebookNo());
		map.put("requestType", "Chequebook");
		map.put("accountNumber", c.getAccount().getAccountNumber());
		map.put("accountType",c.getAccount().getAccountType());
		map.put("customerName", c.getAccount().getCustomer().getCustomerName());
		map.put("requestDate",c.getRequestDate());
		map.put("status",c.getStatus());
		map.put("noOfLeaves",c.getNoOfLeaves());
		map.put("description",c.getDescription());
		
		return map;
	}


	@Override
	@Transactional
	public Object getAddOnCardData(int id) {
		
		AddOnCardModel c= addOnCardRepo.findById(id).orElse(null);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("requestId", c.getId());
		map.put("requestType", "AddOnCard");
		map.put("accountNumber", c.getAccount().getAccountNumber());
		map.put("accountType",c.getAccount().getAccountType());
		map.put("customerName", c.getAccount().getCustomer().getCustomerName());
		map.put("requestDate",c.getRequestDate());
		map.put("status",c.getStatus());
		map.put("description",c.getDescription());
		
		return map;
		
	}


	@Override
	public Object getDisputedTransactionData(int id) {
		
		DisputedTransectionModel c= disputedTransactionRepo.findById(id).orElse(null);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("requestId", c.getId());
		map.put("requestType", "Disputed_Transection");
		map.put("accountNumber", c.getAccount().getAccountNumber());
		map.put("accountType",c.getAccount().getAccountType());
		map.put("customerName", c.getAccount().getCustomer().getCustomerName());
		map.put("requestDate",c.getRequestDate());
		map.put("disputedAmount",c.getDisputedAmount());
		map.put("status",c.getStatus());
		map.put("merchantName",c.getMerchantName());
		map.put("cardNo",c.getCardNo());
		map.put("dateOfTransection",c.getDateOfTransection());
		map.put("reasonForDispute",c.getReasonForDispute());
		
		return map;
		
	}


	@Override
	@Transactional
	public Object getLostStolenCardData(int id) {
		
		LostStolenCardsModel c= lostStolenCardRepo.findById(id).orElse(null);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("requestId", c.getCardId());
		map.put("requestType", "Lost_Stolen_Card");
		map.put("accountNumber", c.getAccount().getAccountNumber());
		map.put("accountType",c.getAccount().getAccountType());
		map.put("customerName", c.getAccount().getCustomer().getCustomerName());
		map.put("requestDate",c.getRequestDate());
		map.put("status",c.getStatus());
		map.put("cardNo",c.getCardNo());
		map.put("cardType",c.getCardType());
		
		return map;
		
	}


	@Override
	@Transactional
	public Object getCreditLimitData(int id) {
		
		CreditLimitModel c= creditLimitRepo.findById((long) id).orElse(null);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("requestId", c.getCardNumber());
		map.put("requestType", "Increase_Credit_Limit");
		map.put("accoutnNumber", c.getAccount().getAccountNumber());
		map.put("accountType",c.getAccount().getAccountType());
		map.put("customerName", c.getAccount().getCustomer().getCustomerName());
		map.put("requestDate",c.getRequestDate());
		map.put("status",c.getStatus());
		map.put("cardType",c.getCardType());
		map.put("cardType",c.getCardType());
		map.put("currentCreditLimit",c.getCurrentCreditLimit());
		map.put("maxCreditLimit",c.getMaxCreditLimit());
		map.put("requestedCreditLimit",c.getRequestedCreditLimit());
		
		return map;
		
	}


	@Override
	@Transactional
	public Object getAllQueries() {
		
		List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
		
		List<QueryModel> querylist=queryRepo.findAll();
		for(QueryModel c:querylist)
		{
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("queryId", c.getQueryNo());
			map.put("customerName", c.getAccount().getCustomer().getCustomerName());
			map.put("customerQuery", c.getQueryRequest());
			map.put("queryResponse", c.getQueryResponse());
			map.put("status",c.getStatus());
			map.put("accoutnNumber", c.getAccount().getAccountNumber());
			map.put("accountType",c.getAccount().getAccountType());
			map.put("requestDate",c.getRequestDate());
			map.put("responseDate",c.getResponseDate());
			
			list.add(map);
		}
		
		return list;
		
	}


	@Override
	@Transactional
	public Object getQueryData(int id) {
		
		QueryModel c= queryRepo.findById(id).orElse(null);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("queryId", c.getQueryNo());
		map.put("customerName", c.getAccount().getCustomer().getCustomerName());
		map.put("customerQuery", c.getQueryRequest());
		map.put("queryResponse", c.getQueryResponse());
		map.put("status",c.getStatus());
		map.put("accoutnNumber", c.getAccount().getAccountNumber());
		map.put("accountType",c.getAccount().getAccountType());
		map.put("DateOfQuery",c.getRequestDate());
		map.put("DateOfResponse",c.getResponseDate());

		return map;
		
	}


	@Override
	@Transactional
	public Object updateQueryData(QueryModel queryModel) {
		
		HashMap<String, String> map=new HashMap<>();
		if(queryModel.getStatus().isEmpty())
		{
			map.put("status", "error");
			map.put("message", "Select the status please");
		}
		
		else {
			queryRepo.saveAndFlush(queryModel);
			map.put("status", "200");
			map.put("message", "Query Details Updated Successfully");
		}
		return map;

		
		
	}


	@Override
	@Transactional
	public Object updateChequebook(ChequebookModel chequebookModel) {
		
		HashMap<String, String> map=new HashMap<>();
		if(chequebookModel.getStatus().isEmpty())
		{
			map.put("status", "error");
			map.put("message", "Select chequebook status please");
		}
		
		else {
			chequebookRepo.saveAndFlush(chequebookModel);
			map.put("status", "200");
			map.put("message", "Chequebook Details Updated Successfully");
		}
		return map;

		
	}


	@Override
	@Transactional
	public Object updateAddOnCard(AddOnCardModel addOnCardModel) {
		
		
		HashMap<String, String> map=new HashMap<>();
		if(addOnCardModel.getStatus().isEmpty())
		{
			map.put("status", "error");
			map.put("message", "Select AddOnCard status please");
		}
		
		else {
			addOnCardRepo.saveAndFlush(addOnCardModel);
			map.put("status", "200");
			map.put("message", "AddOnCard Details Updated Successfully");
		}
		return map;
		
		
	}


	@Override
	@Transactional
	public Object updateDisputedTransactionModel(DisputedTransectionModel disputedTransactionModel) {
		
		
		HashMap<String, String> map=new HashMap<>();
		if(disputedTransactionModel.getStatus().isEmpty())
		{
			map.put("status", "error");
			map.put("message", "Select DisputedTransaction status please");
		}
		
		else {
			disputedTransactionRepo.saveAndFlush(disputedTransactionModel);
			map.put("status", "200");
			map.put("message", "DisputedTransaction Details Updated Successfully");
		}
		return map;
		
		
	}


	@Override
	public Object updateCreditLimit(CreditLimitModel creditLimitModel) {
		
	
		HashMap<String, String> map=new HashMap<>();
		if(creditLimitModel.getStatus().isEmpty())
		{
			map.put("status", "error");
			map.put("message", "Select creditLimit status please");
		}
		
		else {
			creditLimitRepo.saveAndFlush(creditLimitModel);
			map.put("status", "200");
			map.put("message", "CreditLimit Details Updated Successfully");
		}
		return map;
		
		
	}


	@Override
	public Object updateLostStolenCard(LostStolenCardsModel lostStolenCardModel) {
		
		
		HashMap<String, String> map=new HashMap<>();
		if(lostStolenCardModel.getStatus().isEmpty())
		{
			map.put("status", "error");
			map.put("message", "Select LostStolenCard status please");
		}
		
		else {
			lostStolenCardRepo.saveAndFlush(lostStolenCardModel);
			map.put("status", "200");
			map.put("message", "LostStolenCard Details Updated Successfully");
		}
		return map;
		
		
	}
 
	
	
}
