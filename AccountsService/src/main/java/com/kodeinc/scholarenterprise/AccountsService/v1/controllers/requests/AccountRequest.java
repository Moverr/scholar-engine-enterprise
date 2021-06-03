/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.controllers.requests;

import javax.validation.constraints.NotBlank;
import org.w3c.dom.Entity;

/**
 *
 * @author muyin
 */
public class AccountRequest {

    @NotBlank(message = "firstName name is mandatory")
    public String firstName;
    @NotBlank(message = "lastName   is mandatory")
    public String lastName;
    @NotBlank(message = "email name is mandatory")
    public String email;

    public AccountRequest() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AccountRequest{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }

}
