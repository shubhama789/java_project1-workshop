package accountTypes;

import account.Account;

public class CurrentAccount extends Account{
	
	public void withdraw() {
		System.out.println("This is an withdraw method under current accounts");
		
	}
	
	public void currentAccount() {
		System.out.println("This is na Current Account Class");
	}

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("this is a Constructor in currentAccount class");
	}

	
	
	
}
