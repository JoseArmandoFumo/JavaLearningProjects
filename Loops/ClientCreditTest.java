import javax.swing.JOptionPane;

public class ClientCreditTest 
{
	public static void main (String [] args ) {
		ClientCredit client = new ClientCredit ("Fumo", 0,0,0,0,0);

		String name = JOptionPane.showInputDialog ("Name: ");
		client.setName (name); 

		int accountNr = 1000;
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
		
		JOptionPane.showMessageDialog (null, "The new Balance is: " + newBal);
	}
}

