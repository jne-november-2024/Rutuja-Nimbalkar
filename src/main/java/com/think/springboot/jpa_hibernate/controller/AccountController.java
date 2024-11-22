package com.think.springboot.jpa_hibernate.controller;

import com.think.springboot.jpa_hibernate.entity.Account;
import com.think.springboot.jpa_hibernate.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AccountController {

    private AccountService accountService;
    //one const so auto inject the dependency @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/api/accounts")
    public ResponseEntity<Account> addAccount(@RequestBody Account account){
        return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.CREATED);
    }


    @GetMapping("get/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable long id){
       Account acc=accountService.getAccountById(id);
       if(acc!=null){
           return new ResponseEntity<>(acc,HttpStatus.OK);
       }else{
           return  ResponseEntity.notFound().build();
       }
    }

    @GetMapping("/api/accounts/balance")
    public ResponseEntity<List<Account>> getAccountsByBalance(@RequestParam long balance) {
        List<Account> accounts = accountService.getAccountBalanceGreaterThan(balance);
        return ResponseEntity.ok(accounts);
    }


    @GetMapping("/balances")
    public ResponseEntity<Map<String, Double>> getAccountBalancesGroupedByName() {
        return ResponseEntity.ok(accountService.getAccountBalancesGroupedByName());
    }



}
