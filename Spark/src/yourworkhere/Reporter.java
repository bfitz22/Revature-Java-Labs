package yourworkhere;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
	private Ledger ledger;
	
	public Reporter(Ledger ledger) {
		this.ledger = ledger; 
	}
	
	public int getNumAccounts() {
		return this.ledger.getAllAccounts().size();
	}
	
	public List<Account> getAccountsWithMinimum(double min) {
		List<Account> newList = new ArrayList<Account>();
		List<Account> list = this.ledger.getAllAccounts();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBalance() >= min) {
				newList.add(list.get(i));
			}
		}
		return newList;
	}
	
	public void printAllAccounts() {
		List<Account> list = this.ledger.getAllAccounts();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public int getNumAccountsByType(String type) {
		int count = 0;
		List<Account> list = this.ledger.getAllAccounts();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountType().equals(type)) {
				count++;
			} 
		}
		return count; 
	}
}
