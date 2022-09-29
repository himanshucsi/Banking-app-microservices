package com.himanshu.finance.corebankingservice.service;

import org.springframework.stereotype.Service;

import com.himanshu.finance.corebankingservice.model.dto.BankAccount;
import com.himanshu.finance.corebankingservice.model.dto.UtilityAccount;
import com.himanshu.finance.corebankingservice.model.entity.BankAccountEntity;
import com.himanshu.finance.corebankingservice.model.entity.UtilityAccountEntity;
import com.himanshu.finance.corebankingservice.model.mapper.BankAccountMapper;
import com.himanshu.finance.corebankingservice.model.mapper.UtilityAccountMapper;
import com.himanshu.finance.corebankingservice.repository.BankAccountRepository;
import com.himanshu.finance.corebankingservice.repository.UtilityAccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

	private BankAccountMapper bankAccountMapper = new BankAccountMapper();
	private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

	private final BankAccountRepository bankAccountRepository;
	private final UtilityAccountRepository utilityAccountRepository;

	public BankAccount readBankAccount(String accountNumber) {
		BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
		return bankAccountMapper.convertToDto(entity);
	}

	public UtilityAccount readUtilityAccount(String provider) {
		UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
		return utilityAccountMapper.convertToDto(utilityAccountEntity);
	}

	public UtilityAccount readUtilityAccount(Long id) {
		return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
	}

}