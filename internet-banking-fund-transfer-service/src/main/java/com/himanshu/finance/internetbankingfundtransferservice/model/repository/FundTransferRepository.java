package com.himanshu.finance.internetbankingfundtransferservice.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.finance.internetbankingfundtransferservice.model.entity.FundTransferEntity;

public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
}
