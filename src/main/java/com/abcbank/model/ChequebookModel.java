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
@Table(name = "chequebook")
public class ChequebookModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "chequebook_id")
	private int chequebookNo;
	@Column(name = "no_of_leaves",nullable=false)
	private int noOfLeaves;
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
	@JoinColumn(name="account_no",nullable = false)
	private AccountModel account;
	
	@ManyToOne
	@JoinColumn(name="employee_id",nullable = false)
	private EmployeeModel employee;

	public int getChequebookNo() {
		return chequebookNo;
	}

	public void setChequebookNo(int chequebookNo) {
		this.chequebookNo = chequebookNo;
	}

	public int getNoOfLeaves() {
		return noOfLeaves;
	}

	public void setNoOfLeaves(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
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
