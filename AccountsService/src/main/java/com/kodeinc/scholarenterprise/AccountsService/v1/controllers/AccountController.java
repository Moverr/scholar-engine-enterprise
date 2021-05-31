/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.controllers;

import com.kodeinc.scholarenterprise.AccountsService.v1.controllers.requests.AccountRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mover
 * 5/31/2021
 */
@RestController
@RequestMapping("v1/account")
public class AccountController {
    
    //todo: Create Account
    @PostMapping
    public void createAccount(@RequestBody AccountRequest request){
        
    }
    //todo: Login
     
    
    //todo : ForgotPassword
    
    //todo: Reset Password 
    
    
    
}
