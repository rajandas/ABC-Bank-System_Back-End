package com.abcbank.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "account")
public class AccountModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_no")
	private long accountNumber;
	@Column(name = "account_type",length=10,nullable=false)
	private String accountType;
	@Column(name = "account_balance",nullable=false)
	private double accountBalance;
	@Column(name = "branch_name",length=20,nullable=false)
	private String barnchName;
	@Column(name = "ifsc_code",length=20,nullable=false)
	private String ifscCode;
	@Column(name = "bank_code",length=20,nullable=false)
	private String bankCode;
	@Column(name = "open_date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date openDate;
	@Column(name = "close_date")
	@Temporal(TemporalType.DATE)
	private Date closeDate;
	
	@ManyToOne
	@JoinColumn(name="customer_id",nullable = false)
	private CustomerModel customer;
	
	@OneToMany(mappedBy = "account")
	private List<ChequebookModel> chequebook;
	
	@OneToMany(mappedBy = "account")
	private List<AddOnCardModel> add_on_card;
	
	@OneToMany(mappedBy = "account")
	private List<DisputedTransectionModel> disputed_transection;
	
	@OneToMany(mappedBy = "account")
	private List<LostStolenCardsModel> lost_stolen_card;
	
	@OneToMany(mappedBy = "account")
	private List<CreditLimitModel> credit_limit;
	
	@OneToMany(mappedBy = "account")
	private List<BillPaymentModel> bill_payment;
	
	@OneToMany(mappedBy = "account")
	private List<QueryModel> query;
	
	
	//====================================Getter and Setter ============================================
	
	public List<QueryModel> getQuery() {
		return query;
	}
	public void setQuery(List<QueryModel> query) {
		this.query = query;
	}
	public List<BillPaymentModel> getBill_payment() {
		return bill_payment;
	}
	public void setBill_payment(List<BillPaymentModel> bill_payment) {
		this.bill_payment = bill_payment;
	}
	public List<CreditLimitModel> getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(List<CreditLimitModel> credit_limit) {
		this.credit_limit = credit_limit;
	}
	public List<LostStolenCardsModel> getLost_stolen_card() {
		return lost_stolen_card;
	}
	public void setLost_stolen_card(List<LostStolenCardsModel> lost_stolen_card) {
		this.lost_stolen_card = lost_stolen_card;
	}
	public List<DisputedTransectionModel> getDisputed_transection() {
		return disputed_transection;
	}
	public void setDisputed_transection(List<DisputedTransectionModel> disputed_transection) {
		this.disputed_transection = disputed_transection;
	}
	public List<AddOnCardModel> getAdd_on_card() {
		return add_on_card;
	}
	public void setAdd_on_card(List<AddOnCardModel> add_on_card) {
		this.add_on_card = add_on_card;
	}
	public List<ChequebookModel> getChequebook() {
		return chequebook;
	}
	public void setChequebook(List<ChequebookModel> chequebook) {
		this.chequebook = chequebook;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getBarnchName() {
		return barnchName;
	}
	public void setBarnchName(String barnchName) {
		this.barnchName = barnchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	
	
}

