package com.abcbank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.AddOnCardModel;
import com.abcbank.model.ChequebookModel;
import com.abcbank.model.CreditLimitModel;
import com.abcbank.model.DisputedTransectionModel;
import com.abcbank.model.LostStolenCardsModel;
import com.abcbank.model.QueryModel;
import com.abcbank.service.RequestListService;


@RestController
@CrossOrigin
public class RequestListController {
	
	
	@Autowired
	private RequestListService requestService;
	
	
	@RequestMapping(value = "/getRequestList",method = RequestMethod.GET)
	public Object getRequests(){
		return (requestService.getAllRequests());
	}
	
	@RequestMapping(value = "/getChequebookDataById/{id}",method = RequestMethod.GET)
	public Object getChequebookDataById(@PathVariable int id)
	{
		return (requestService.getChequebookData(id));
	}

	@RequestMapping(value = "/getAddOnCardDataById/{id}",method = RequestMethod.GET)
	public Object getAddOnCardDataById(@PathVariable int id)
	{
		return (requestService.getAddOnCardData(id));
	}

	@RequestMapping(value = "/getDisputedTransactionDataById/{id}",method = RequestMethod.GET)
	public Object getDisputedTransactionDataById(@PathVariable int id)
	{
		return (requestService.getDisputedTransactionData(id));
	}
	
	@RequestMapping(value = "/getLostStolenCardDataById/{id}",method = RequestMethod.GET)
	public Object getLostStolenCardDataById(@PathVariable int id)
	{
		return (requestService.getLostStolenCardData(id));
	}
	
	@RequestMapping(value = "/getCreditLimitDataById/{id}",method = RequestMethod.GET)
	public Object getCreditLimitDataById(@PathVariable int id)
	{
		return (requestService.getCreditLimitData(id));
	}
	
	
	@RequestMapping(value = "/getQueryList",method = RequestMethod.GET)
	public Object getQueries(){
		return (requestService.getAllQueries());
	}
	
	@RequestMapping(value = "/getQueryDataById/{id}",method = RequestMethod.GET)
	public Object getQueryDataById(@PathVariable int id)
	{
		return (requestService.getQueryData(id));
	}
	
	@RequestMapping(value = "/updateQueryData",method = RequestMethod.PUT)
	public Object updateQueryData(@RequestBody QueryModel queryModel) {
		return (requestService.updateQueryData(queryModel));
	}

	
	@RequestMapping(value = "/updateChequebook",method = RequestMethod.PUT)
	public Object updateChequebookData(@RequestBody ChequebookModel chequebookModel) {
		return (requestService.updateChequebook(chequebookModel));
	}
	
	@RequestMapping(value = "/updateAddOnCard",method = RequestMethod.PUT)
	public Object updateAddOnCardData(@RequestBody AddOnCardModel addOnCardModel) {
		return (requestService.updateAddOnCard(addOnCardModel));
	}
	
	@RequestMapping(value = "/updateDisputedTransaction",method = RequestMethod.PUT)
	public Object updateDisputedTransactionData(@RequestBody DisputedTransectionModel disputedTransactionModel) {
		return (requestService.updateDisputedTransactionModel(disputedTransactionModel));
	}
	
	@RequestMapping(value = "/updateCreditLimit",method = RequestMethod.PUT)
	public Object updateCreditLimitData(@RequestBody CreditLimitModel creditLimitModel) {
		return (requestService.updateCreditLimit(creditLimitModel));
	}
	
	@RequestMapping(value = "/updateLostStolenCard",method = RequestMethod.PUT)
	public Object updateLostStolenCardData(@RequestBody LostStolenCardsModel lostStolenCardModel) {
		return (requestService.updateLostStolenCard(lostStolenCardModel));
	}
	
	

}
