package com.fleetease.backend.dto;

import java.util.List;

import com.fleetease.backend.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDto {


	private String accountNo;

	private String ifscCode;

//	private Double accountClosingBalance;

//	private List<TransactionType> Transactions;
//
//	private List<String> transactionDetails;
//	
//	private List<Long> transactionAmount;
}
