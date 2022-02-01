package com.example.NMBapp.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountid;
	
	private int accountnumber;
	private Date dateofcreation;
	private String currency;
	private int mobilenumber;
	private String branch;
	private float initialbalance;
	private float activebalance;
	private float debitamount;
	private float creditamount;
	private String debitnarration;
	private String creditnarration;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Long accountid, int accountnumber, Date dateofcreation, String currency, int mobilenumber,
			String branch, float initialbalance, float activebalance, float debitamount, float creditamount,
			String debitnarration, String creditnarration) {
		super();
		this.accountid = accountid;
		this.accountnumber = accountnumber;
		this.dateofcreation = dateofcreation;
		this.currency = currency;
		this.mobilenumber = mobilenumber;
		this.branch = branch;
		this.initialbalance = initialbalance;
		this.activebalance = activebalance;
		this.debitamount = debitamount;
		this.creditamount = creditamount;
		this.debitnarration = debitnarration;
		this.creditnarration = creditnarration;
	}
	public Long getAccountid() {
		return accountid;
	}
	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Date getDateofcreation() {
		return dateofcreation;
	}
	public void setDateofcreation(Date dateofcreation) {
		this.dateofcreation = dateofcreation;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getInitialbalance() {
		return initialbalance;
	}
	public void setInitialbalance(float initialbalance) {
		this.initialbalance = initialbalance;
	}
	public float getActivebalance() {
		return activebalance;
	}
	public void setActivebalance(float activebalance) {
		this.activebalance = activebalance;
	}
	public float getDebitamount() {
		return debitamount;
	}
	public void setDebitamount(float debitamount) {
		this.debitamount = debitamount;
	}
	public float getCreditamount() {
		return creditamount;
	}
	public void setCreditamount(float creditamount) {
		this.creditamount = creditamount;
	}
	public String getDebitnarration() {
		return debitnarration;
	}
	public void setDebitnarration(String debitnarration) {
		this.debitnarration = debitnarration;
	}
	public String getCreditnarration() {
		return creditnarration;
	}
	public void setCreditnarration(String creditnarration) {
		this.creditnarration = creditnarration;
	}
		
}
