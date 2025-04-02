package com.fleetease.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetease.backend.dto.BankDto;
import com.fleetease.backend.enums.TransactionType;
import com.fleetease.backend.exceptions.BankException;
import com.fleetease.backend.model.Bank;
import com.fleetease.backend.repository.BanksRepo;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BanksRepo bankRepo;
	
	@Override
	public Bank addBank(BankDto bankDto) throws BankException {

		Bank bank = new Bank();
		bank.setAccountNo(bankDto.getAccountNo());
		bank.setIfscCode(bankDto.getIfscCode());
		Bank saveBank = bankRepo.save(bank);
		
		if(saveBank!=null) {
			return saveBank;			
		} else {
			throw new BankException("Bank not added!");
		}
	}

	@Override
	public Bank getBank(Integer bankId) throws BankException {

		Optional<Bank> optBank = bankRepo.findById(bankId);
		
		if(optBank.isPresent()) {
			return optBank.get();
		} else {
			throw new BankException("Bank not found!");
		}
		
	}

	@Override
	public String deleteBank(Integer bankId) throws BankException {

		Optional<Bank> optBank = bankRepo.findById(bankId);
		
		if(optBank.isPresent()) {
			bankRepo.delete(optBank.get());
			
			return "Bank deleted successfully.";
		} else {
			throw new BankException("Bank not found!");
		}
		
	}

	@Override
	public Bank updateBank(Integer bankId, Bank bank) throws BankException {

		Optional<Bank> optBank = bankRepo.findById(bankId);
		
		if(optBank.isPresent()) {
			Bank updatedBank = bankRepo.save(bank);
			return updatedBank;
		} else {
			throw new BankException("Bank not found!");
		}
		
	}

	@Override
	public List<Bank> getAllBanks() throws BankException {
		
		List<Bank> banks = bankRepo.findAll();
		
		if(banks.isEmpty()) {
			throw new BankException("Banks not found!");
		} else {			
			return banks;
		}
	}

	@Override
	public Bank updateBankTransactions(Integer bankId, Long amount, TransactionType transactionType, String transactionDetails) {

//		Optional<Bank> optBank = bankRepo.findById(bankId);
//		
//		if(optBank.isPresent()) {
//			Bank bank = optBank.get();
//			if(transactionType == TransactionType.CREDIT){
//				bank.setAccountClosingBalance(bank.getAccountClosingBalance()+amount);
//				bank.getTransactionAmount().add(amount);
//				bank.getTransactionDetails().add(transactionDetails);
//				bank.getTransactions().add(transactionType);
//			} else if(transactionType == TransactionType.DEBIT) {
//				bank.setAccountClosingBalance(bank.getAccountClosingBalance()-amount);
//				bank.getTransactionAmount().add(amount);
//				bank.getTransactionDetails().add(transactionDetails);
//				bank.getTransactions().add(transactionType);
//			} else {
//				throw new BankException("Unidentified transaction!");
//			} 
//			
//			return bankRepo.save(bank);
//		} else {
//			throw new BankException("Bank not found!");
//		}
		
		return null;
	}

}
