package com.himanshu.finance.internetbankingfundtransferservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.himanshu.finance.internetbankingfundtransferservice.model.TransactionStatus;
import com.himanshu.finance.internetbankingfundtransferservice.model.dto.FundTransfer;
import com.himanshu.finance.internetbankingfundtransferservice.model.dto.request.FundTransferRequest;
import com.himanshu.finance.internetbankingfundtransferservice.model.dto.response.FundTransferResponse;
import com.himanshu.finance.internetbankingfundtransferservice.model.entity.FundTransferEntity;
import com.himanshu.finance.internetbankingfundtransferservice.model.mapper.FundTransferMapper;
import com.himanshu.finance.internetbankingfundtransferservice.model.repository.FundTransferRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class FundTransferService {

	private final FundTransferRepository fundTransferRepository;

	private FundTransferMapper mapper;

	public FundTransferResponse fundTransfer(FundTransferRequest request) {
		log.info("Sending fund transfer request {}" + request.toString());

		FundTransferEntity entity = new FundTransferEntity();
		BeanUtils.copyProperties(request, entity);
		entity.setStatus(TransactionStatus.PENDING);
		FundTransferEntity optFundTransfer = fundTransferRepository.save(entity);

		FundTransferResponse fundTransferResponse = new FundTransferResponse();
		fundTransferResponse.setTransactionId(UUID.randomUUID().toString());
		fundTransferResponse.setMessage("Success");

		return fundTransferResponse;

	}

	public List<FundTransfer> readAllTransfers(Pageable pageable) {
		return mapper.convertToDtoList(fundTransferRepository.findAll(pageable).getContent());
	}
}
