package com.think.springboot.jpa_hibernate.repository;

import com.think.springboot.jpa_hibernate.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {


    @Query(value = "select * from accounts where balance> :balance",nativeQuery = true)
    List<Account> getAccountBalanceGreaterThan(@Param("balance") long balance);

    @Query(value = "SELECT a.account_holder_name, SUM(a.balance) FROM accounts a GROUP BY a.account_holder_name", nativeQuery = true)
    List<Object[]> findAccountBalanceGroupByName();

}
