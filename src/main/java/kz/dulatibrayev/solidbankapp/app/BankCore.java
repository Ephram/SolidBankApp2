package kz.dulatibrayev.solidbankapp.app;

import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountCreationService;

public class BankCore {
	private static long id = 1;
	private long lastAccountNumber = 1;
	private AccountCreationService accountCreation;

	public BankCore(AccountCreationService accountCreation) {
		this.accountCreation = accountCreation;

	}

	public void createNewAccount(AccountType accountType, String clientID) {
		accountCreation.create(accountType, Long.toString(id), clientID, lastAccountNumber);
		incrementLastAccountNumber();
	}

	public void incrementLastAccountNumber() {
		this.lastAccountNumber++;

	}

	public static long getId() {
		return id;
	}

	public static void setId(long id) {
		BankCore.id = id;
	}

	public long getLastAccountNumber() {
		return lastAccountNumber;
	}

	public void setLastAccountNumber(long lastAccountNumber) {
		this.lastAccountNumber = lastAccountNumber;
	}

	public AccountCreationService getAccountCreation() {
		return accountCreation;
	}

	public void setAccountCreation(AccountCreationService accountCreation) {
		this.accountCreation = accountCreation;
	}

}
