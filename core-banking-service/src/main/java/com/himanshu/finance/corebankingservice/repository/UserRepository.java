package com.himanshu.finance.corebankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.finance.corebankingservice.model.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByIdentificationNumber(String identificationNumber);
}