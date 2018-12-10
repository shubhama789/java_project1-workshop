package bankAccount;

public class AccountMain 
{
	public static void main(String[] args)
	{
		Person person = new Person("Smith", 21);
		SavingAccount account = new SavingAccount(2450, person);
		System.out.println(account.getBalance());
		account.withdraw(2000);
		System.out.println(account);
		
		System.out.println("----------------------------------------------------------\n");
		Person person1 = new Person("kathy", 21);
		CurrentAccount account1 = new CurrentAccount(500000, person1);
		System.out.println(account1.getBalance());
		account1.withdraw(50001);
		System.out.println(account1);
		
	}
}
