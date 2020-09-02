package com.accounts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.accounts.model.Account;

//creating a repository interface
public interface AccountRepository extends CrudRepository<Account, Integer>
{

	@Query(value = "SELECT * FROM Account WHERE CUSTOMER_ID = ?1 ", nativeQuery = true)
	List<Account> findAllProjectedNativeQuery(int customerid);

}
