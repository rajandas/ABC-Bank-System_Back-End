package com.abcbank.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "customer")
public class CustomerModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id",nullable=false)
	private int customerId;
	@Column(name = "customer_name", length = 45, nullable=false)
	private String customerName;
	@Column(name = "mobile_number", length = 15, nullable=false)
	private String mobileNumber;
	@Column(name = "email", length = 45, nullable = false )
	private String email;
	@Column(name = "address", length = 50, nullable=false)
	private String address;
	@Column(name = "city", length = 10, nullable=false)
	private String city;
	@Column(name = "pincode", nullable=false)
	private int pinCode;
	@Column(name = "dob",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name = "aadhar_no", nullable=false)
	private long aadharNo;
	@Column(name = "pan_no", length =10, nullable=false)
	private String panNo;
	@Column(name = "nationality", length = 10, nullable=false)
	private String nationality;
	@Column(name = "profession", length =10, nullable=false)
	private String profession;
	@Column(name = "gender", length =6, nullable=false)
	private String gender;
	
	@OneToMany(mappedBy = "customer")
	private List<AccountModel> account;
	
	
	
	//===========================================================================================================================
	
	public List<AccountModel> getAccount() {
		return account;
	}
	public void setAccount(List<AccountModel> account) {
		this.account = account;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	

}
