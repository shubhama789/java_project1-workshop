package accountTypes;

import account.Account;

public class SavingAccount extends Account{
	
	final int a=0;
	public void withdraw() {
		System.out.println("This is an withdraw method under saving accounts");
		super.withdraw();
		
	}
	
	public void savingAccount() {
		System.out.println("This is an Saving Account class");
		
	}

	public SavingAccount() {
		super();
		//a++;
		// TODO Auto-generated constructor stub
		System.out.println("this is a Constructor in savingAccount class");
	}
	
	public void display() {
		System.out.println("value of 'a' inside savingaccount class is: "+a);
		System.out.println("value of 'a' inside account class is: "+super.a);
	}
	
	public void add() {
		System.out.println("No data's to add");
	}

	public void add(int num1,int num2) {
		System.out.println("sum of two number is: "+(num1+num2));
	}
	
	public void add(int num1,int num2,int num3) {
		System.out.println("sum of three number is: "+(num1+num2+num3));
	}
}
