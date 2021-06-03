/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.dtos;

import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

/**
 *
 * @author muyin
 */
public class Account {
    
    @Id
    private String id;
    
    
      @NotBlank(message = "firstName name is mandatory")
    public String firstName;
    @NotBlank(message = "lastName   is mandatory")
    public String lastName;
    @NotBlank(message = "email    is mandatory")
    public String email;
    
    
}
