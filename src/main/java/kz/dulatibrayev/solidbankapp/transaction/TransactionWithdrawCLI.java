package kz.dulatibrayev.solidbankapp.transaction;

import kz.dulatibrayev.solidbankapp.cli.interfaces.WithdrawDepositOperationCLIUI;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

public class TransactionWithdrawCLI {
	private TransactionWithdraw transactionWithdraw;
	private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
	private AccountListingService accountListingService;

	public TransactionWithdrawCLI(TransactionWithdraw transactionWithdraw,
			WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI, AccountListingService accountListingService) {
		this.transactionWithdraw = transactionWithdraw;
		this.withdrawDepositOperationCLIUI = withdrawDepositOperationCLIUI;
		this.accountListingService = accountListingService;
	}

	public void withdrawMoney(String clientID) {

	}

}
