package com.himanshu.finance.internetbankingutilitypaymentservice.model.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.himanshu.finance.internetbankingutilitypaymentservice.model.TransactionStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "utility_payment")
public class UtilityPaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long providerId;
	private BigDecimal amount;
	private String referenceNumber;
	private String account;
	private String transactionId;

	@Enumerated(EnumType.STRING)
	private TransactionStatus status;

}
