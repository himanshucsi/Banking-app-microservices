package com.himanshu.finance.corebankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.finance.corebankingservice.model.entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}
