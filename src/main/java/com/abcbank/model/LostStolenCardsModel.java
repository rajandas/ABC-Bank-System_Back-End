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
@Table(name = "lost_stolen_card")
public class LostStolenCardsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "card_id")
	private int cardId;
	@Column(name = "card_no",nullable=false)
	private long cardNo;
	@Column(name = "card_type",length=20, nullable=false)
	private String cardType;
	@Column(name = "request_date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	@Column(name = "status",length=10,nullable=false)
	private String status;
	@Column(name = "response_date")
	@Temporal(TemporalType.DATE)
	private Date responseDate;
	@Column(name = "description",length=60)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="account_no.",nullable = false)
	private AccountModel account;
	
	@ManyToOne
	@JoinColumn(name="employee_id",nullable = false)
	private EmployeeModel employee;
	
	
	
	//=======================================================================
	
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
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
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
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
