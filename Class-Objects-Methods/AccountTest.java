import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest
{
	public static void main (String [] args)
	{
		Account account1 = new Account("Benk: ", 50.0); 
		Account account2 = new Account ("Jose :",70.0);

			double amount = 0.0;
		
		//Scanner input = new Scanner (System.in);

		JOptionPane.showMessageDialog(null, " Current Balance in account1: "+account1.getName()+account1.getBalance()+ "\n"
						+ "Current Balance in Account2: "+ account2.getName() + account2.getBalance());


		//System.out.printf("%s Current balance account1: %.2f%n",account1.getName(), account1.getBalance());
		//System.out.printf("%s Current balance account2: %.2f%n", account2.getName(), account2.getBalance());


		JOptionPane.showMessageDialog (null, "**********************MENU ************************************** \n");
		int op = Integer.parseInt(JOptionPane.showInputDialog ("1 . Withdram : \n 2. Deposit:  \n 3.Balance:  \n Select the Option: "));

		if (op == 1)
		{
		amount = Double.parseDouble(JOptionPane.showInputDialog( "Enter withdrawal amount for account1: "));
		//double amount = input.nextDouble;
		account1.withdraw(amount);
		amount = Double.parseDouble (JOptionPane.showInputDialog("Enter withdrawal amount for account2: "));
		account2.withdraw(amount);
		}
		else
		   {
			if(op == 2)
			{
				amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the deposit amount: "));
				account1.deposit(amount);
				amount = Double.parseDouble (JOptionPane.showInputDialog("Enter the deposit amount: "));
				account2.deposit(amount);
			}
			else
			   {
				if (op == 3)
				{
					JOptionPane.showMessageDialog(null, "The Balance in Account1: " + account1.getName()+account1.getBalance()+ "\n"
							+"Balance in account2: " + account2.getName()+ account2.getBalance() +"\n");
				}
			   }
		        
		    }   
		
		
		// amount = Double.ParseDouble ( JOptionPane.showInputDialog("Enter the Deposit amount: "));
		//System.out.printf  ("%nadding %.2f to account1 balance%n", depositAmount);
		//account1.deposit(depositAmount);

		System.out.printf ("%s The new balance is : $%.2f %n",account1.getName(), account1.getBalance());
		System.out.printf("%s The new Balance is: $%.2f %n", account2.getName(), account2.getBalance());
	/*
		System.out.print( "Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%n dding %.2f to account2 balance %n%n", depositAmount);
		account2.deposit(depositAmount);

		System.out.printf( "*********************************RESULT***************************************%n");
		System.out.printf ("%s The new balance for account1 is: $%.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s The new Balance for account2 is: $%.2f", account2.getName(), account2.getBalance());
		*/




	}
}

