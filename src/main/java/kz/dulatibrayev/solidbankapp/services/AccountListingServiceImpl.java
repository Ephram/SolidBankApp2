package kz.dulatibrayev.solidbankapp.services;

import java.util.List;

import kz.dulatibrayev.solidbankapp.account.Account;
import kz.dulatibrayev.solidbankapp.account.AccountWithdraw;
import kz.dulatibrayev.solidbankapp.dao.AccountDAO;
import kz.dulatibrayev.solidbankapp.enums.AccountType;
import kz.dulatibrayev.solidbankapp.services.interfaces.AccountListingService;

public class AccountListingServiceImpl implements AccountListingService {
	private AccountDAO accountDAO;
	
	public AccountListingServiceImpl(AccountDAO accountDAO) {
		this.accountDAO=accountDAO;
	}
	
	@Override
	public Account getClientAccount(String clientID, String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getClientAccounts(String clientID) {
		return this.accountDAO.getClientAccounts(clientID);

	}

	@Override
	public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	

}
