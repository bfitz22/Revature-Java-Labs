package yourworkhere;

public class SavingsAccountManager implements IAccountManager {
	public SavingsAccount sa;

	SavingsAccountManager(SavingsAccount sa) {
		this.sa = sa;
	}

	@Override
	public boolean deposit(double num) {
		if (num > 0) {
			this.sa.setBalance(this.sa.getBalance() + num);
			return true;
		}
		return false;
	}

	@Override
	public boolean withdraw(double num) {
		if (num > 0 & (this.sa.getBalance() - num) > this.sa.getMinBalance() & 
				this.sa.getCurrentMonthlyWithdrawals() < this.sa.getMaxMonthlyWithdrawals()) {
			this.sa.setBalance(this.sa.getBalance() - num);
			this.sa.setcurrentMonthlyWithdrawals(this.sa.getCurrentMonthlyWithdrawals() + 1);
			return true;
		} 
		return false;
	}
	
//	is it necessary to use the getter methods every time here or could I just say sa.balance to get the balance?
//	for example, use: "if (num > 0 & (this.sa.balance - num) > this.sa.minBalance" instead of what I have on line 21 currently
}
