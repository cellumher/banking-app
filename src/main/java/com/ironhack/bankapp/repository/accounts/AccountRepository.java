package com.ironhack.bankapp.repository.accounts;

import com.ironhack.bankapp.model.accounts.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("SELECT id, balance FROM Account")
    List<Object[]> checkBalanceAll();
}
