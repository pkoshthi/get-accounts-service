package com.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import com.accounts.model.Account;

//creating a repository interface
public interface AccountRepository extends CrudRepository<Account, Integer>
{

}
