/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class BankAccount
{
	
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(double initialBalance) 
	{ 
		balance = initialBalance; 
		initialBalance = 0;
	}
	
	public BankAccount(int accountNumber) 
	{ 
		accNum = accountNumber; 
	} 
	
	public BankAccount(String accountHolder) 
	{ 
		name = accountHolder;
	}
	public void deposit(double depositAmount)
	{
		balance += depositAmount;
	}
	public void withdraw(double withdrawAmount)
	{
		balance -= withdrawAmount;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "name: " + name;
		return "balance: " + balance;
		return "account number: " + accNum;
	}
}
