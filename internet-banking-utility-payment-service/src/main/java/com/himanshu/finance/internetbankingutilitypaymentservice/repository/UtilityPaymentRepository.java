package com.himanshu.finance.internetbankingutilitypaymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.finance.internetbankingutilitypaymentservice.model.dto.UtilityPayment;
import com.himanshu.finance.internetbankingutilitypaymentservice.model.entity.UtilityPaymentEntity;

public interface UtilityPaymentRepository extends JpaRepository<UtilityPaymentEntity, UtilityPayment> {
}
