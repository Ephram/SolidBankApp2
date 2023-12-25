package kz.dulatibrayev.solidbankapp.services.interfaces;

import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;

public interface AccountDepositService {
	void deposit(double amount, AccountWithdraw account);

}
