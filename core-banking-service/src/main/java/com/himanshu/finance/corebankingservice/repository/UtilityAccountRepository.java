package com.himanshu.finance.corebankingservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.finance.corebankingservice.model.entity.UtilityAccountEntity;

public interface UtilityAccountRepository extends JpaRepository<UtilityAccountEntity, Long> {
	Optional<UtilityAccountEntity> findByProviderName(String provider);
}
