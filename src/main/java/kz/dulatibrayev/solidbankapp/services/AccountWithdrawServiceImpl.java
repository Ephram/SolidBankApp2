package kz.dulatibrayev.solidbankapp.services;

import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountWithdrawService;

public class AccountWithdrawServiceImpl implements AccountWithdrawService {

	private AccountDAO accountDAO;

	public AccountWithdrawServiceImpl(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void deposit(double amount, AccountWithdraw account) {
		// TODO Auto-generated method stub

	}
}
