package com.himanshu.finance.corebankingservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.finance.corebankingservice.model.entity.BankAccountEntity;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {

	Optional<BankAccountEntity> findByNumber(String accountNumber);
	
}
