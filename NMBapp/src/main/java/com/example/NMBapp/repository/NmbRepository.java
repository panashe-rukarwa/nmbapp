package com.example.NMBapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NMBapp.domain.Customer;

@Repository
public interface NmbRepository extends JpaRepository<Customer,Long> {

}
