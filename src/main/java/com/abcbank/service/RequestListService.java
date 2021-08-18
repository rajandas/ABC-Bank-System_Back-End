package com.abcbank.service;

import com.abcbank.model.AddOnCardModel;
import com.abcbank.model.ChequebookModel;
import com.abcbank.model.CreditLimitModel;
import com.abcbank.model.DisputedTransectionModel;
import com.abcbank.model.LostStolenCardsModel;
import com.abcbank.model.QueryModel;

public interface RequestListService {

	Object getAllRequests();

	Object getChequebookData(int id);

	Object getAddOnCardData(int id);

	Object getDisputedTransactionData(int id);

	Object getLostStolenCardData(int id);

	Object getCreditLimitData(int id);

	Object getAllQueries();

	Object getQueryData(int id);

	Object updateQueryData(QueryModel queryModel);

	Object updateChequebook(ChequebookModel chequebookModel);

	Object updateAddOnCard(AddOnCardModel addOnCardModel);

	Object updateDisputedTransactionModel(DisputedTransectionModel disputedTransactionModel);

	Object updateCreditLimit(CreditLimitModel creditLimitModel);

	Object updateLostStolenCard(LostStolenCardsModel lostStolenCardModel);
 
	  
	  
        
}  
