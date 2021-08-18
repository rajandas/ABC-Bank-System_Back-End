package com.abcbank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "credit_limit")
public class CreditLimitModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "card_number")
	private long cardNumber;
	@Column(name = "card_type",length=20, nullable=false)
	private String cardType;
	@Column(name = "current_credit_limit",nullable=false)
	private double currentCreditLimit;
	@Column(name = "max_credit_limit",nullable=false)
	private double maxCreditLimit;
	@Column(name = "requested_credit_limit",nullable=false)
	private double requestedCreditLimit;
	@Column(name = "request_date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	@Column(name = "response_date")
	@Temporal(TemporalType.DATE)
	private Date responseDate;
	@Column(name = "status",length=10,nullable=false)
	private String status;
	@Column(name = "description",length=60)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="account_no.",nullable = false)
	private AccountModel account;
	
	@ManyToOne
	@JoinColumn(name="employee_id",nullable = false)
	private EmployeeModel employee;

	
	//=======================================================================================
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public double getCurrentCreditLimit() {
		return currentCreditLimit;
	}
	public void setCurrentCreditLimit(double currentCreditLimit) {
		this.currentCreditLimit = currentCreditLimit;
	}
	public double getMaxCreditLimit() {
		return maxCreditLimit;
	}
	public void setMaxCreditLimit(double maxCreditLimit) {
		this.maxCreditLimit = maxCreditLimit;
	}
	public double getRequestedCreditLimit() {
		return requestedCreditLimit;
	}
	public void setRequestedCreditLimit(double requestedCreditLimit) {
		this.requestedCreditLimit = requestedCreditLimit;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public AccountModel getAccount() {
		return account;
	}
	public void setAccount(AccountModel account) {
		this.account = account;
	}
	public EmployeeModel getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeModel employee) {
		this.employee = employee;
	}
	
	
}
