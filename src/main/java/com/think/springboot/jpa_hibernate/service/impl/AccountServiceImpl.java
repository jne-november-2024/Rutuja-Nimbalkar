package com.think.springboot.jpa_hibernate.service.impl;

import com.think.springboot.jpa_hibernate.entity.Account;
import com.think.springboot.jpa_hibernate.repository.AccountRepository;
import com.think.springboot.jpa_hibernate.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository repository;

    @Autowired
    public AccountServiceImpl(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public Account createAccount(Account account) {
        return repository.save(account);
    }

    @Override
    public Account getAccountById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Account> getAccountBalanceGreaterThan(long balance) {
        return  repository.getAccountBalanceGreaterThan(balance);

    }

    @Override
    public Map<String, Double> getAccountBalancesGroupedByName() {
        List<Object[]> results = repository.findAccountBalanceGroupByName();
        Map<String, Double> accountBalances = new HashMap<>();

        for (Object[] result : results) {
            String name = (String) result[0];
            Double totalBalance = (Double) result[1];
            accountBalances.put(name, totalBalance);
        }

        return accountBalances;
    }


//    public Account createAccount(Account account) {
//        //Account account= AccountMapper.mapToAccount(accountDto);
//       return repository.save(account);
//        //return AccountMapper.mapToAccountDto(saved);
//    }

}
