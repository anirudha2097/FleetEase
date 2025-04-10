package com.fleetease.backend.service;

import java.util.List;

import com.fleetease.backend.dto.BankDto;
import com.fleetease.backend.enums.TransactionType;
import com.fleetease.backend.exceptions.BankException;
import com.fleetease.backend.model.Bank;

public interface BankService {

	public Bank addBank(BankDto bankDto) throws BankException;
	
	public Bank getBank(Integer bankId) throws BankException;
	
	public String deleteBank(Integer bankId) throws BankException;
	
	public Bank updateBank(Bank bank) throws BankException;
	
	public List<Bank> getAllBanks() throws BankException;
	
	public Bank updateBankTransactions(Integer bankId, Long amount, TransactionType transactionType, String transactionDetails);
	
	public Bank getBankByAccountNo(String accountNo) throws BankException;
}
