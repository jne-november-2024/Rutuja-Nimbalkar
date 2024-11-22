package com.think.springboot.jpa_hibernate.service;


import com.think.springboot.jpa_hibernate.entity.Account;

import java.util.List;
import java.util.Map;


public interface AccountService {

    Account createAccount(Account account);

    Account getAccountById(long id);

    List<Account> getAccountBalanceGreaterThan(long balance);
    public Map<String, Double> getAccountBalancesGroupedByName();


}
