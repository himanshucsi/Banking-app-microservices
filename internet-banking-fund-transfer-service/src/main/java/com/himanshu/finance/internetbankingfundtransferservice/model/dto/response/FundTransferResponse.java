package com.himanshu.finance.internetbankingfundtransferservice.model.dto.response;

import lombok.Data;

@Data
public class FundTransferResponse {
    private String message;
    private String transactionId;
}