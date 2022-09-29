package com.himanshu.finance.internetbankingutilitypaymentservice.model.dto;

import java.math.BigDecimal;

import com.himanshu.finance.internetbankingutilitypaymentservice.model.TransactionStatus;

import lombok.Data;

@Data
public class UtilityPayment {
    private Long providerId;
    private BigDecimal amount;
    private String referenceNumber;
    private String account;
    private TransactionStatus status;
}
