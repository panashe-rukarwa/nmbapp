package com.example.NMBapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NMBapp.domain.Account;
import com.example.NMBapp.domain.Customer;

@Repository
public interface NmbRepository extends JpaRepository<Customer,Long> {

	
}
