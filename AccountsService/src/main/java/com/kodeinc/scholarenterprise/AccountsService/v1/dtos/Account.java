/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.dtos;

import com.kodeinc.scholarenterprise.AccountsService.v1.helpers.AccountStatus;
import java.lang.annotation.Documented;
import java.sql.Timestamp;
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
    
    public long author_id;
    
    public Timestamp date_created;
    public AccountStatus status;
    public Timestamp date_updated;

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }

    public Timestamp getDate_created() {
        return date_created;
    }

    public void setDate_created(Timestamp date_created) {
        this.date_created = date_created;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Timestamp getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(Timestamp date_updated) {
        this.date_updated = date_updated;
    }
    
    
    
    
    
    

}
