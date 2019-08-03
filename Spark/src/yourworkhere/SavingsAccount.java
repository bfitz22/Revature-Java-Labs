package yourworkhere;

public class SavingsAccount extends Account {
	private double minBalance;
	private int currentMonthlyWithdrawals;
	private int maxMonthlyWithdrawals;
	private SavingsAccountManager sam;
	
//	public static void main(String[] args) {
//		SavingsAccount sa = new SavingsAccount();
//		System.out.println(sa.toString());
//	}
	
	public SavingsAccount() {
		this.accountID = "8675309";
		this.balance = 1;
		this.accountType = "checking";
		this.firstName = "Brian";
		this.lastName = "Fitzgerald";
		this.minBalance = 1;
		this.currentMonthlyWithdrawals = 0;
		this.maxMonthlyWithdrawals = 200;
	}
	
	public SavingsAccount(String accountID, double balance, String accountType, 
			String firstName, String lastName, double minBalance, 
			int currentMonthlyWithdrawals, int maxMonthlyWithdrawals) {
		this.accountID = accountID;
		this.balance = balance;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName; 
		this.minBalance = minBalance;
		this.currentMonthlyWithdrawals = currentMonthlyWithdrawals;
		this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
	}
	
	public double getMinBalance() {
		return this.minBalance;
	}
	
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	public int getCurrentMonthlyWithdrawals() {
		return this.currentMonthlyWithdrawals;
	}
	
	public void setcurrentMonthlyWithdrawals(int number) {
		this.currentMonthlyWithdrawals = number;
	}
	
	public int getMaxMonthlyWithdrawals() {
		return this.maxMonthlyWithdrawals;
	}
	
	public void setMaxMonthlyWithdrawals(int num) {
		this.maxMonthlyWithdrawals = num;
	}
	
	@Override
	public String toString() {
		return "account owner: \t\t\t" + this.firstName + " " + this.lastName + "\naccount type: \t\t\t" + this.accountType + "\naccount ID: \t\t\t" + this.accountID 
				+ "\naccount balance: \t\t" + this.balance + "\naccount minimum balance: \t" + this.minBalance + "\ncurrent monthly withdrawals: \t" 
				+ this.currentMonthlyWithdrawals + "\nmaximum monthly withdrawals: \t" + this.maxMonthlyWithdrawals;
	}

	@Override
	public SavingsAccountManager getAccountManager() {
		return this.sam;
	}
}
