package com.himanshu.finance.internetbankingutilitypaymentservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.himanshu.finance.internetbankingutilitypaymentservice.model.TransactionStatus;
import com.himanshu.finance.internetbankingutilitypaymentservice.model.dto.UtilityPayment;
import com.himanshu.finance.internetbankingutilitypaymentservice.model.entity.UtilityPaymentEntity;
import com.himanshu.finance.internetbankingutilitypaymentservice.model.mapper.UtilityPaymentMapper;
import com.himanshu.finance.internetbankingutilitypaymentservice.repository.UtilityPaymentRepository;
import com.himanshu.finance.internetbankingutilitypaymentservice.rest.request.UtilityPaymentRequest;
import com.himanshu.finance.internetbankingutilitypaymentservice.rest.response.UtilityPaymentResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UtilityPaymentService {
	private final UtilityPaymentRepository utilityPaymentRepository;

	private UtilityPaymentMapper utilityPaymentMapper;

	public UtilityPaymentResponse utilPayment(UtilityPaymentRequest paymentRequest) {
		log.info("Utility payment processing {}", paymentRequest.toString());

		UtilityPaymentEntity entity = new UtilityPaymentEntity();
		BeanUtils.copyProperties(paymentRequest, entity);
		entity.setStatus(TransactionStatus.PROCESSING);
		UtilityPaymentEntity optUtilPayment = utilityPaymentRepository.save(entity);

		String transactionId = UUID.randomUUID().toString();
		optUtilPayment.setStatus(TransactionStatus.SUCCESS);
		optUtilPayment.setTransactionId(transactionId);

		utilityPaymentRepository.save(optUtilPayment);

		return UtilityPaymentResponse.builder().message("Utility Payment Successfully Processed")
				.transactionId(transactionId).build();
	}

	public List<UtilityPayment> readPayments(Pageable pageable) {
		Page<UtilityPaymentEntity> allUtilPayments = utilityPaymentRepository.findAll(pageable);
		return utilityPaymentMapper.convertToDtoList(allUtilPayments.getContent());
	}
}