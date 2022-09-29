package com.himanshu.finance.internetbankingfundtransferservice.model.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.himanshu.finance.internetbankingfundtransferservice.model.TransactionStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fund_transfer")
public class FundTransferEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String transactionReference;
	private String fromAccount;
	private String toAccount;
	private BigDecimal amount;

	@Enumerated(EnumType.STRING)
	private TransactionStatus status;

}
