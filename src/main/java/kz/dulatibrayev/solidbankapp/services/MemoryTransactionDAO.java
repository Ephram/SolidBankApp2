package kz.dulatibrayev.solidbankapp.services;

import java.util.List;

import kz.dulatibrayev.solidbankapp.services.interfaces.Transaction;
import kz.dulatibrayev.solidbankapp.services.interfaces.TransactionDAO;

public class MemoryTransactionDAO implements TransactionDAO{
	private List<Transaction> transactions;

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
	
}
