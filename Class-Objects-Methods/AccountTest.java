import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest
{
	public static void main (String [] args)
	{
		Account account1 = new Account("Benk: ", 50.0); 
		Account account2 = new Account ("Jose :",70.0);

			double amount = 0.0;
			int i ;
			int op=1;
		
		
		while (op != 0)
		{

		
		op = Integer.parseInt(JOptionPane.showInputDialog ("******** MENU****************\n 1 . Withdram : \n 2. Deposit:  \n 3.Balance:  \n 0. Exit \n Select the Option: "));

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
		
		}
		
	}
}

