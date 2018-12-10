package bankAccount;


public class Account
{
	private static long accNum=0;
	private double balance;
	private Person accHolder;
	
	public long getAccNum() 
	{
		return accNum;
	}
	public void setAccNum(long accNum)
	{
		Account.accNum = accNum;
	}
	public Person getAccHolder()
	{
		return accHolder;
	}
	public void setAccHolder(Person accHolder) 
	{
		this.accHolder = accHolder;
	}
	
	public void setBalance(double balance) 
	{
		//this.balance = balance;
		if(balance>=500)
			this.balance=balance;
		else
		System.out.println("Minimum balance must be 500");
	}
	public void deposit(double depositMoney)
	{
		balance += depositMoney;
		System.out.println(depositMoney+" INR has been successfully Deposited to "+accHolder.getName()+" Account");
		System.out.println("Updated Balance of "+accHolder.getName()+" account is "+balance);
	}
	public void withdraw(double withdrawMoney)
	{
		if(balance-withdrawMoney>=500) {
		balance -= withdrawMoney;
		System.out.println(withdrawMoney+" INR has been successfully Withdrawn from "+accHolder.getName()+" Account");
		System.out.println("Updated Balance of "+accHolder.getName()+" account is "+balance);
		}
		else {
			System.out.println("Money can't be withdrawn");
			System.out.println("Insufficient Fund");
		}
	}
	public double getBalance()
	{
		System.out.println("Available Balance in the account of "+accHolder.getName()+" account is :");
		return balance;
	}
	public Account(double balance,Person accHolder)
	{
		super();
		Account.accNum++;
		setBalance(balance);
		this.accHolder=accHolder;
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder.getName() + "]";
	}
	
}
