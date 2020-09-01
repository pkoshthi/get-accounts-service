package com.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import com.accounts.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>
{

}
