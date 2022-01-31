package com.example.NMBapp.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountStatement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Date dateofmonth;
	private float totalcredit;
	private float totaldebit;
	private float closingbalance;
	public AccountStatement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountStatement(Long id, Date dateofmonth, float totalcredit, float totaldebit, float closingbalance) {
		super();
		this.id = id;
		this.dateofmonth = dateofmonth;
		this.totalcredit = totalcredit;
		this.totaldebit = totaldebit;
		this.closingbalance = closingbalance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateofmonth() {
		return dateofmonth;
	}
	public void setDateofmonth(Date dateofmonth) {
		this.dateofmonth = dateofmonth;
	}
	public float getTotalcredit() {
		return totalcredit;
	}
	public void setTotalcredit(float totalcredit) {
		this.totalcredit = totalcredit;
	}
	public float getTotaldebit() {
		return totaldebit;
	}
	public void setTotaldebit(float totaldebit) {
		this.totaldebit = totaldebit;
	}
	public float getClosingbalance() {
		return closingbalance;
	}
	public void setClosingbalance(float closingbalance) {
		this.closingbalance = closingbalance;
	}
	
	
}
