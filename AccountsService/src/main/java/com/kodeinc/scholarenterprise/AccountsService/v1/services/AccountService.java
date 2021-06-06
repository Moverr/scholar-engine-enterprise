/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.services;

import com.kodeinc.scholarenterprise.AccountsService.v1.controllers.requests.AccountRequest;
import com.kodeinc.scholarenterprise.AccountsService.v1.controllers.responses.AccountResponse;
import com.kodeinc.scholarenterprise.AccountsService.v1.dtos.Account;
import com.kodeinc.scholarenterprise.AccountsService.v1.helpers.AccountStatus;
import com.kodeinc.scholarenterprise.AccountsService.v1.repository.AccountRepository;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;
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

    public AccountResponse create(AccountRequest accountRequest) {

        //todo: populate entity 
        Account account = populateEntity(accountRequest);
        account.setId(UUID.randomUUID().toString()); 
        //Default to pending until approval status
        account.status = AccountStatus.PENDING;
        
        accountRepository.save(account); 
        return populateRespose(account);
 
    }
    
    //todo: Response
    public AccountResponse populateRespose(Account account){
         AccountResponse response = new AccountResponse();
         
         response.setId(account.getId());
         response.setEmail(account.getEmail());
         response.setFirstName(account.getFirstName());
         response.setLastName(account.getLastName());
         response.setDate_created(account.getDate_created().getTime());
         
         return response;
         
    }

    //todo: Request
    public Account populateEntity(AccountRequest request) {

        Account entity = new Account();
        entity.firstName = request.firstName;
        entity.lastName = request.lastName;
        entity.email = request.email;
        entity.firstName = request.firstName;

        //todo: Date created 
        entity.date_created = Timestamp.from(Instant.now());

        return entity;
    }
}
