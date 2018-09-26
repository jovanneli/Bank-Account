
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(String accountName, int number)
	{
		name=accountName;
		accNum=number;
		balance=0;
	}
	
	public BankAccount (String accountName, int number, double initialBalance)
	{
		name=accountName;
		accNum=number;
		balance=initialBalance;
	}
	
	public void deposit(double amountDeposited)
	{
		balance = balance + amountDeposited;
	}
	public void withdraw(double amountWithdrawn)
	{
		balance = balance - amountWithdrawn;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "name: " + name + " accNum: " + accNum + " balance: " + balance; 
	}
	
}
