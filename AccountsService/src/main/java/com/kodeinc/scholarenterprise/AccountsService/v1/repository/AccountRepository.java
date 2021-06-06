/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholarenterprise.AccountsService.v1.repository;

import com.kodeinc.scholarenterprise.AccountsService.v1.dtos.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**s
 *
 * @author muyin
 */
@Repository
public interface AccountRepository extends MongoRepository<Account,String>{
    
}
