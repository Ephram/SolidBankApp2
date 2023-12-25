package kz.dulatibrayev.solidbankapp.transaction;

import kz.dulatibrayev.solidbankapp.cli.interfaces.WithdrawDepositOperationCLIUI;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

public class TransactionDepositCLI {
	private TransactionDeposit transactionDeposit;
	private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
	private AccountListingService accountListingService;

	public TransactionDepositCLI(TransactionDeposit transactionDeposit,
			WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListingService) {
		this.transactionDeposit = transactionDeposit;
		this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
		this.accountListingService=accountListingService;
	}
	
	public void depositMoney(String clientID) {
		
	}

}
