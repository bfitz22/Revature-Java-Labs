package com.yourname;

public class Bank {
	private Client[] clients = new Client[0];
	private BankAccount[] accounts = new BankAccount[0];
	
	/**
	 * Convenience method to add a Client to Bank's array
	 * @param client
	 */
	private void addClient(Client client) {
		Client[] temp = new Client[this.clients.length + 1];
		
		//copy over data into new array
		for(int i = 0; i < this.clients.length; i++) {
			temp[0] = this.clients[i];
		}
		
		//add new account
		temp[temp.length - 1] = client;
		
		this.clients = temp;
	}
	
	private void addAccount(BankAccount account) {
		BankAccount[] temp = new BankAccount[this.accounts.length + 1];
		
		//copy over data into new array
		for(int i = 0; i < this.accounts.length; i++) {
			temp[0] = this.accounts[i];
		}
		
		//add new account
		temp[temp.length - 1] = account;
		
		this.accounts = temp;
	}
	
	public void deposit(long accountNo, double amount) {
		//TODO: implement deposit functionality
		System.out.println("Simulating deposit for account: " + accountNo);
		
		for (BankAccount account : this.accounts) {
			if (account.getAccountNo() == accountNo) {
				if (account instanceof CheckingAccount) {
					account.deposit(amount);
				} else if (account instanceof SavingsAccount) {
					amount *= 1.05;
					account.deposit(amount);
				}
			}
		}
	}
	
	
	public double withdrawal(long accountNo, double amount) {
		//TODO: implement withdrawal
		System.out.println("Simulating withdrawal for account: " + accountNo);
		
		for (BankAccount account : this.accounts) {
			if (account.getAccountNo() == accountNo) {
				if (account instanceof CheckingAccount) {
					return account.withdrawal(amount);
				} else if (account instanceof SavingsAccount) {
					account.withdrawal(amount + 2);
					return amount;
				}
			}
		}
		return 0;
	}
	
	public BankAccount openAccount(Client client, double amount, String accountType) {		
		addClient(client);
		BankAccount account;
		
		if ("savings".equals(accountType)) {
			account = new SavingsAccount(amount);
		}else {
			account = new CheckingAccount(amount);
		}
		
		//have bank store account
		addAccount(account);
		
		return account;
	}
}
