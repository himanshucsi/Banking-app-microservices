package com.himanshu.finance.corebankingservice.model.dto;

import lombok.Data;

import java.math.BigDecimal;

import com.himanshu.finance.corebankingservice.model.entity.AccountStatus;
import com.himanshu.finance.corebankingservice.model.entity.AccountType;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
