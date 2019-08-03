package yourworkhere;

public class CheckingAccountManager implements IAccountManager {
	public CheckingAccount ca;
	
	CheckingAccountManager(CheckingAccount ca) {
		this.ca = ca;
	}

	@Override
	public boolean deposit(double num) {
		if (num > 0) {
			this.ca.setBalance(this.ca.getBalance() + num);
			return true;
		}
		return false;
	}

	@Override
	public boolean withdraw(double num) {
		if (num > 0 & num > this.ca.getBalance()) {
			this.ca.setBalance(this.ca.getBalance() - (num + this.ca.getOverdraftFee()));
			return true;
		} else if (num > 0 & num <= this.ca.getBalance()) {
			this.ca.setBalance(this.ca.getBalance() - num);
			return true;
		}
		return false;
	}
}
