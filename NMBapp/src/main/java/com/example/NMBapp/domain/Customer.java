package com.example.NMBapp.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String surname;
	private int nationalid;
	private String title;
	private String homeowner;
	private String email;
	private Date creationdate ;
	private String gender;
	private String username;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long id, String firstname, String surname, int nationalid, String title, String homeowner,
			String email, Date creationdate, String gender, String username) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.nationalid = nationalid;
		this.title = title;
		this.homeowner = homeowner;
		this.email = email;
		this.creationdate = creationdate;
		this.gender = gender;
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNationalid() {
		return nationalid;
	}

	public void setNationalid(int nationalid) {
		this.nationalid = nationalid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHomeowner() {
		return homeowner;
	}

	public void setHomeowner(String homeowner) {
		this.homeowner = homeowner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}


	