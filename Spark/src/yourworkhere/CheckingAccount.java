package yourworkhere;

public class CheckingAccount extends Account{
	private double overdraftFee;
	
	public static void main(String[] args) {
//		CheckingAccount ca = new CheckingAccount("123", 54, "checking", "Brian", "Fitz", 10);
//		System.out.println(ca.toString());
//		System.out.println(ca.getAccountManager());
	}
	
	public CheckingAccount() {
		this.accountID = "8675309";
		this.balance = 1;
		this.accountType = "checking";
		this.firstName = "Brian";
		this.lastName = "Fitzgerald";
		this.overdraftFee = 25;
	}
	
	public CheckingAccount(String accountID, double balance, String accountType, 
			String firstName, String lastName, double overdraftFee) {
		this.accountID = accountID;
		this.balance = balance;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName; 
		this.overdraftFee = overdraftFee;
	}
	
	public double getOverdraftFee() {
		return this.overdraftFee;
	}
	
	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
	
	@Override
	public String toString() {
		return "account owner: \t\t" + this.firstName + " " + this.lastName + "\naccount type: \t\t" + this.accountType + "\naccount ID: \t\t" + this.accountID 
				+ "\naccount balance: \t" + this.balance + "\naccount overdraft fee: \t" + this.overdraftFee;
	}

	@Override
	public CheckingAccountManager getAccountManager() {
		return new CheckingAccountManager(this); 
	}
}
