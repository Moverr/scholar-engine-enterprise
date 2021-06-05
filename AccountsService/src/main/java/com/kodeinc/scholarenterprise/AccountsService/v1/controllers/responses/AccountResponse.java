/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.controllers.responses;

import com.kodeinc.scholarenterprise.AccountsService.v1.helpers.AccountStatus;
import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

/**
 *
 * @author muyin
 */
public class AccountResponse { 
    private String id; 
    public String firstName; 
    public String lastName; 
    public String email; 
    public String author; 
    public Long date_created;
    public AccountStatus status;
    
}
