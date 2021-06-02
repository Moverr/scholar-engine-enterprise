/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.controllers;

import com.kodeinc.scholarenterprise.AccountsService.v1.controllers.requests.AccountRequest;
import com.kodeinc.scholarenterprise.AccountsService.v1.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mover 5/31/2021
 */
@RestController
@RequestMapping("v1/account")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //todo: Create Account
    @PostMapping("/register")
    public String createAccount(@RequestBody AccountRequest request) {
        accountService.create();
        return "Reached";
    }

    //todo: Login
    //todo : ForgotPassword
    //todo: Reset Password 
}
