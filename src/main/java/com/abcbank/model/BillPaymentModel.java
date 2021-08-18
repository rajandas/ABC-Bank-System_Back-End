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
@Table(name = "bill_payment")
public class BillPaymentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "biller_id")
	private int billerId;
	@Column(name = "customer_request",length=45, nullable=false)
	private String customerRequest;
	@Column(name = "request_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	@Column(name = "bill_amount")
	private double billAmount;
	@Column(name = "response_date")
	@Temporal(TemporalType.DATE)
	private Date responseDate;
	@Column(name = "bill_status",length=12, nullable=true)
	private String billStatus;
	
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	@ManyToOne
	@JoinColumn(name="account_no.",nullable = false)
	private AccountModel account;
	
	@ManyToOne
	@JoinColumn(name="employee_id",nullable = false)
	private EmployeeModel employee;
	
	
	
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
	//=================================================================================================
	public int getBillerId() {
		return billerId;
	}
	public void setBillerId(int billerId) {
		this.billerId = billerId;
	}
	public String getCustomerRequest() {
		return customerRequest;
	}
	public void setCustomerRequest(String customerRequest) {
		this.customerRequest = customerRequest;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	
	

}
