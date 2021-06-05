/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.services;

import com.kodeinc.scholarenterprise.AccountsService.v1.controllers.requests.AccountRequest;
import com.kodeinc.scholarenterprise.AccountsService.v1.dtos.Account;
import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.stereotype.Service;

/**
 *
 * @author muyin
 */
@Service
public class AccountService {
    
    public void create(AccountRequest accountRequest){
 
        //todo: populate entity 
        
        //todo: Log Request 
        //todo: save request to pending 
        
        //todo: Send an invitation email. and approval request url. 
        
     
    }
    
    public Account populateEntity(AccountRequest request){
        
        Account entity = new Account();
        entity.firstName =  request.firstName;
        entity.lastName =  request.lastName;
        entity.email =  request.email;
        entity.firstName =  request.firstName;
        
        entity.date_created = new Timestamp();
        
        return null;
    }
}
