import java.util.Scanner;

public class AccountTest
{
	public static void main (String [] args)
	{
		Account account1 = new Account("Benk: ", 50.0); 
		Account account2 = new Account ("Jose :",50.0);


		
		Scanner input = new Scanner (System.in);

		System.out.printf("%s Current balance account1: %.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s Current balance account2: %.2f%n", account2.getName(), account2.getBalance());


		System.out.print( "Enter withdrawal amount for account1: ");
		double amount = input.nextDouble;
		account1.withdrawal(amount);
		
		//double depositAmount = input.nextDouble();
		//System.out.printf  ("%nadding %.2f to account1 balance%n", depositAmount);
		//account1.deposit(depositAmount);

		System.out.printf ("%s The new balance is : $%.2f %n",account1.getName(), account1.getBalance());
		//System.out.printf("%s The new Balance is: $%.2f %n", account2.getName(), account2.getBalance());
	
		System.out.print( "Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%n dding %.2f to account2 balance %n%n", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf( "*********************************RESULT***************************************%n");
		System.out.printf ("%s The new balance for account1 is: $%.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s The new Balance for account2 is: $%.2f", account2.getName(), account2.getBalance());





	}
}

