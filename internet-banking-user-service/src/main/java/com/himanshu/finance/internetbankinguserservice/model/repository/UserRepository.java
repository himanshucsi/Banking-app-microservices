package com.himanshu.finance.internetbankinguserservice.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.finance.internetbankinguserservice.model.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
