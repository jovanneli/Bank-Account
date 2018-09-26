/**
 * 
 * @author Jovanne Li
 *
 */
public class BankAccountMain 
{

	public static void main(String[] args) 
	{
		BankAccount myAccount = new BankAccount("Jovanne", 450);
		myAccount.deposit(400.00);
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.toString());
		
		BankAccount myAccount2 = new BankAccount ("Jovanne2", 451, 1000.00);
		myAccount2.withdraw(400.00);
		System.out.println(myAccount2.getBalance());
		System.out.println(myAccount2);
	}

}
