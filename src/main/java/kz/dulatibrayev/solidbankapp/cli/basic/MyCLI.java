package kz.dulatibrayev.solidbankapp.cli.basic;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy.Fixed;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.cli.interfaces.CLIUI;
import kz.dulatibrayev.solidbankapp.enums.AccountType;

public class MyCLI implements CLIUI {
	private Scanner scanner;

	public MyCLI(Scanner scanner) {
		this.scanner = scanner;

	}

	public MyCLI() {
		this.scanner = new Scanner(System.in);
	}

	double requestClientAmount() {
		return 0;
	}

	String requestClientAccountNumber() {
		return null;
	}

	public AccountType requestAccountType() {

		String accountType = scanner.nextLine();

		if (accountType.equalsIgnoreCase(AccountType.FIXED.toString())) {
			return AccountType.FIXED;
		} else if (accountType.equalsIgnoreCase(AccountType.SAVING.toString())) {
			return AccountType.SAVING;
		} else if (accountType.equalsIgnoreCase(AccountType.CHECKING.toString())) {
			return AccountType.CHECKING;
		} else {
			System.out.println("wrong type of account, try again");
			return null;
		}

	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

}
