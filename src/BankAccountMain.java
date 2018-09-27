/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class BankAccountMain 
{

	public static void main(String[] args) 
	{
		BankAccount account1 = new BankAccount(50);
		BankAccount account2 = new BankAccount(1000);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		account1.deposit(500);
		account1.withdraw(300);
		account2.deposit(60);
		System.out.println(account1.getBalance());
		System.out.println(account1.getBalance());
		System.out.println(account2.toString());
		String str = "" + account2;
		System.out.println(str);

	}

}
