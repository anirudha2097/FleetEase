package com.fleetease.backend.model;

import java.util.List;

import com.fleetease.backend.enums.TransactionType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bankId;
	
	private String accountNo;

	private String ifscCode;

//	private Double accountClosingBalance;
//
//	private List<TransactionType> Transactions;
//
//	private List<String> transactionDetails;
//	
//	private List<Long> transactionAmount;
	
}
