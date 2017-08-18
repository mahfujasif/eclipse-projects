package com.mlbd.accountCheck.BankAccount;

public class BankAccount {
	
	@CheckAccount()
	private String accountNumber;
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getter() {
		return accountNumber;
	}
}
