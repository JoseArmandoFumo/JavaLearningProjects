import javax.swing.JOptionPane;

public class ClientCreditTest 
{
	public static void main (String [] args ) {
		ClientCredit client = new ClientCredit ("Fumo", 0,0,0,0,0);
		int accountNr = 1000;
		String op = "y";
		while (op != "n" )
		{
		String name = JOptionPane.showInputDialog ("Name: ");
		client.setName (name); 

		accountNr += 1;
		client.setAccountNr (accountNr);

		int initialBalance = Integer.parseInt (JOptionPane.showInputDialog ("Enter Initial Batalabce: "));
		client.setInitialBalance (initialBalance);
		
		int total_monthly = Integer.parseInt (JOptionPane.showInputDialog ("Enter Monthly Itens: "));
		client.setTotal_monthly (total_monthly);

		int totalCredit = Integer.parseInt (JOptionPane.showInputDialog ("Enter Total Credit: "));
		client.setTotalCredit (totalCredit);
		
		int limit = Integer.parseInt (JOptionPane.showInputDialog ("ENter Limit Authorized: "));
		client.setLimit (limit);

		int newBal = 0;

		newBal = client.newBalance (initialBalance, total_monthly, totalCredit);
		if (newBal < limit)
			{
				String status = " Okay!";
				JOptionPane.showMessageDialog (null, "ID: "+ accountNr + "\nName: "+ name + "\n The new Balance is: " + newBal + "\n Limit Credit Authorized: "+ status);
			}
		else
			JOptionPane.showMessageDialog (null,"ID: "+accountNr + "\nname: " + name +"\n The new Balance is: " + newBal + "\n Error! Limit Credit Authorized Exceeded!");
	
		op = JOptionPane.showInputDialog ("Do you want to Continue (Y=yes/N=No)? :");
		}
	}
}

