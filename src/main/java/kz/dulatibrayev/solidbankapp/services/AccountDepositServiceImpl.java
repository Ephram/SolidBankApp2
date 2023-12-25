package kz.dulatibrayev.solidbankapp.services;

import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountDepositService;

public class AccountDepositServiceImpl implements AccountDepositService {
	private AccountDAO accountDAO;

	public AccountDepositServiceImpl(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void deposit(double amount, AccountWithdraw account) {

	}

}
