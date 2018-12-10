package bankAccount;

public class SavingAccount extends Account
{
	final long minBal=500;
	public SavingAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		
	}
	@Override
	public void withdraw(double withdrawMoney) {
		if((super.getBalance()-withdrawMoney)>=minBal)
		{
			super.withdraw(withdrawMoney);
			
		}
		else
		{
			System.out.println("Can't Withdraw Money! Insufficient Funds");
		}
	}
}
