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
	
	public Customer get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	
	public List<Account>listAllAcc(){
		return repos.findAll();
	}
	
	public void save(Account std) {
		repos.save(std);
	}
	
	public Account get1(long id) {
		return repos.findById(id).get();
	}
	
	public void delete1(long id) {
		repos.deleteById(id);
	}
}

