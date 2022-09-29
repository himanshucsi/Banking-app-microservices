package com.himanshu.finance.internetbankingutilitypaymentservice.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.finance.internetbankingutilitypaymentservice.rest.request.UtilityPaymentRequest;
import com.himanshu.finance.internetbankingutilitypaymentservice.service.UtilityPaymentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/utility-payment")
public class UtilityPaymentController {

	private final UtilityPaymentService utilityPaymentService;

	@GetMapping
	public ResponseEntity readPayments(Pageable pageable) {
		return ResponseEntity.ok(utilityPaymentService.readPayments(pageable));
	}

	@PostMapping
	public ResponseEntity processPayment(@RequestBody UtilityPaymentRequest paymentRequest) {
		return ResponseEntity.ok(utilityPaymentService.utilPayment(paymentRequest));
	}

}
