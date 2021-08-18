package com.abcbank.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;
	@Column(name = "employee_name",length=45, nullable=false)
	private String employeeName;
	@Column(name = "username",length=25, nullable=false)
	private String username;
	@Column(name = "password",length=25, nullable=false)
	private String password;
	@Column(name = "bank_branch",length=20, nullable=false)
	private String bankBranch;
	@Column(name = "designation",length=20, nullable=false)
	private String designation;
	
	@OneToMany(mappedBy = "employee")
	private List<ChequebookModel> chequebook;
	
	@OneToMany(mappedBy = "employee")
	private List<AddOnCardModel> add_on_card;
	
	@OneToMany(mappedBy = "employee")
	private List<DisputedTransectionModel> disputed_transection;
	
	@OneToMany(mappedBy = "employee")
	private List<LostStolenCardsModel> lost_stolen_card;
	
	@OneToMany(mappedBy = "employee")
	private List<CreditLimitModel> credit_limit;
	
	@OneToMany(mappedBy = "employee")
	private List<BillPaymentModel> bill_payment;
	
	@OneToMany(mappedBy = "employee")
	private List<QueryModel> query;
	
	
	//======================================================================================================
	
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
	public List<AddOnCardModel> getAdd_on_card() {
		return add_on_card;
	}
	public void setAdd_on_card(List<AddOnCardModel> add_on_card) {
		this.add_on_card = add_on_card;
	}
	public List<DisputedTransectionModel> getDisputed_transection() {
		return disputed_transection;
	}
	public void setDisputed_transection(List<DisputedTransectionModel> disputed_transection) {
		this.disputed_transection = disputed_transection;
	}
	public List<ChequebookModel> getChequebook() {
		return chequebook;
	}
	public void setChequebook(List<ChequebookModel> chequebook) {
		this.chequebook = chequebook;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
