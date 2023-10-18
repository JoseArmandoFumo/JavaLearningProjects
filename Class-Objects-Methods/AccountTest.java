import java.util.Scanner;

public class AccountTest
{
	public static void main (String [] args)
	{
		Account account1 = new Account("Benk: ", 120.0); 
		Account account2 = new Account ("Jose :",10.0);


		
		Scanner input = new Scanner (System.in);

		System.out.printf("%s Current balance account1: %.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s Current balance account2: %.2f%n", account2.getName(), account2.getBalance());


		System.out.print( "Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf  ("%nadding %.2f to account1 balance", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf( "%n Adding %.2f to Account1 balance%n%n", depositAmount);

		account2.deposit(depositAmount);

		System.out.printf ("%s The new balance is : $%.2f %n",account1.getName(), account1.getBalance());
		System.out.printf("%s The new Balance is: $%.2f %n", account2.getName(), account2.getBalance());
	
		System.out.print( "%s Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%n Adding %.2f to account2 balance", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf( "*********************************RESULT***************************************%n%n%n");
		System.out.printf ("%s The new balance for account1 is: $%.2f",account1.getName(), account1.getBalance());
		System.out.printf("%s The new Balance for account2 is: $%.2f", account2.getName(), account2.getBalance());





	}
}

