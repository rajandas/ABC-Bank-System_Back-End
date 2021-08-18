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
@Table(name = "disputed_transection")
public class DisputedTransectionModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "merchant_name",length=20,nullable=false)
	private String merchantName;
	@Column(name = "card_no",nullable=false)
	private long cardNo;
	@Column(name = "date_of_transection",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dateOfTransection;
	@Column(name = "disputed_amount",nullable=false)
	private double disputedAmount;
	@Column(name = "reason_for_dispute",length=45,nullable=false)
	private String reasonForDispute;
	@Column(name = "request_date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	@Column(name = "status",length=10,nullable=false)
	private String status;
	@Column(name = "description",length=60)
	private String description;
	@Column(name = "response_date")
	@Temporal(TemporalType.DATE)
	private Date responseDate;
	
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
	//==================================================================================================
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public Date getDateOfTransection() {
		return dateOfTransection;
	}
	public void setDateOfTransection(Date dateOfTransection) {
		this.dateOfTransection = dateOfTransection;
	}
	public double getDisputedAmount() {
		return disputedAmount;
	}
	public void setDisputedAmount(double disputedAmount) {
		this.disputedAmount = disputedAmount;
	}
	public String getReasonForDispute() {
		return reasonForDispute;
	}
	public void setReasonForDispute(String reasonForDispute) {
		this.reasonForDispute = reasonForDispute;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
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
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	
	
}
