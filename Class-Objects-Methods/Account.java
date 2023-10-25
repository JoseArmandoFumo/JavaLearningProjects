import javax.swing.JOptionPane;
import java.util.Scanner;

public class Account 
{
	private String name;
	private double balance;

	public Account (String name, double balance)
	{
		this.name = name;

		if (balance > 0.0)
			this.balance = balance;
	}
	public void deposit (double depositAmount)
	{
		if (depositAmount > 0.0)
			balance += depositAmount;
	}

	public void withdraw (double amount)
	{
		if (amount > balance)
			//JOptionPane.showMessageDialog( "Withdrawal amount exceded account balance!");
			System.out.print("Amount exceded!");
		balance = balance - amount;
	}

	public double getBalance()
	{
		return balance;
	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	
	}
}
