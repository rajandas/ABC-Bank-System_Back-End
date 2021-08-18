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
@Table(name = "query")
public class QueryModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "query_no")
	private int queryNo;
	@Column(name = "request_date", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	@Column(name = "status",length=10, nullable=false)
	private String status;
	@Column(name = "query_request",length=45, nullable=false)
	private String queryRequest;
	@Column(name = "query_response",length=60)
	private String queryResponse;
	@Column(name = "response_date")
	@Temporal(TemporalType.DATE)
	private Date responseDate;
	
	@ManyToOne
	@JoinColumn(name="account_no.",nullable = false)
	private AccountModel account;
	
	@ManyToOne
	@JoinColumn(name="employee_id",nullable = false)
	private EmployeeModel employee;

	public int getQueryNo() {
		return queryNo;
	}

	public void setQueryNo(int queryNo) {
		this.queryNo = queryNo;
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

	public String getQueryRequest() {
		return queryRequest;
	}

	public void setQueryRequest(String queryRequest) {
		this.queryRequest = queryRequest;
	}

	public String getQueryResponse() {
		return queryResponse;
	}

	public void setQueryResponse(String queryResponse) {
		this.queryResponse = queryResponse;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
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
