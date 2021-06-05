/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.services;

import com.kodeinc.scholarenterprise.AccountsService.v1.controllers.requests.AccountRequest;
import com.kodeinc.scholarenterprise.AccountsService.v1.dtos.Account;
import com.kodeinc.scholarenterprise.AccountsService.v1.repository.AccountRepository;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author muyin
 */
@Service
public class AccountService {
    
    AccountRepository accountRepository;
    
    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    
    public void create(AccountRequest accountRequest){
 
        //todo: populate entity 
        Account account = populateEntity(accountRequest);
        
        //todo: Log Transaction : 
     
        //todo: save request to pending 
        
        //todo: Send an invitation email. and approval request url. 
        
     
    }
    
     
    public Account populateEntity(AccountRequest request){
        
        Account entity = new Account();
        entity.firstName =  request.firstName;
        entity.lastName =  request.lastName;
        entity.email =  request.email;
        entity.firstName =  request.firstName;
        
        //todo: Date created 
        entity.date_created =   Timestamp.from(Instant.now());
        
        return entity;
    }
}
