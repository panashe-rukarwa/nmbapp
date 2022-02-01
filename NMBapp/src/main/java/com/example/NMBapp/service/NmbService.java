package com.example.NMBapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NMBapp.domain.Account;
import com.example.NMBapp.domain.Customer;
import com.example.NMBapp.repository.NmbAccountRepository;
import com.example.NMBapp.repository.NmbRepository;

@Service
public class NmbService {

	@Autowired
	private NmbRepository repo;
	@Autowired
	private NmbAccountRepository repos;
	
	public List<Customer>listAll(){
		return repo.findAll();
	}
	
	public void save(Customer std) {
		repo.save(std);
	}
	
	public Customer get(long customerid) {
		return repo.findById(customerid).get();
	}
	
	public void delete(long customerid) {
		repo.deleteById(customerid);
	}
	
	public List<Account>listAllAcc(){
		return repos.findAll();
	}
	
	public void saveAcc(Account std) {
		repos.save(std);
	}
	
	public Account getAcc(long accountid) {
		return repos.findById(accountid).get();
	}
	
	public void deleteAcc(long accountid) {
		repos.deleteById(accountid);
	}
}

