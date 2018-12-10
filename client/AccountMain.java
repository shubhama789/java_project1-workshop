package client;


import accountTypes.CurrentAccount;
import accountTypes.SavingAccount;

public class AccountMain {
	public static void main(String[] args) {
		
		SavingAccount objct = new SavingAccount();
		objct.savingAccount();
		objct.account();
		objct.withdraw();
		objct.display();
		objct.add();
		objct.add(2,5);
		objct.add(2,5,3);
		//objct.add(2,5,2.4f);   //it will not work 
		CurrentAccount objct1 = new CurrentAccount();
		objct1.currentAccount();
		objct1.account();
		objct1.withdraw();
		
		
				
	}

}
