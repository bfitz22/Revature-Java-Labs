package yourworkhere;

public abstract class Account {
	protected String accountID;
	protected double balance;
	protected String accountType;
	protected String firstName;
	protected String lastName;
	
	public static void main(String[] args) {
		
	}
	
	public String getAccountID() {
		return this.accountID;
	}
	
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountType() {
		return this.accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public abstract IAccountManager getAccountManager();
}
