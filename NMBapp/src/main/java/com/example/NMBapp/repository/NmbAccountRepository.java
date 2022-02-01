package com.example.NMBapp.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.NMBapp.domain.Account;

public interface NmbAccountRepository extends JpaRepository<Account,Long> {
	//sql queries to apply interest and charges
	//@Query("SELECT activebalance, activebalance+activebalance * 0.03 (SELECT SUM(activebalance) FROM account) as 'Interest' WHERE account.activebalance < 0")
	//public List<Account> listItemsWithCreditBalance(@Param("activebalance") float activebalance);
	//@Query("SELECT activebalance, activebalance+activebalance * 0.06 (SELECT SUM(activebalance) FROM account) as 'Interest' WHERE account.activebalance < 0")
	//public List<Account> listItemsWithCreditBalance1(@Param("activebalance") float activebalance);
	//@Query("SELECT debitamount, debitamount+debitamount * 0.02 (SELECT SUM(debitamount) FROM account) as 'Charge'")
	//public List<Account> listItemsWithDebitAmount(@Param("debitamount") float debitamount);
}
