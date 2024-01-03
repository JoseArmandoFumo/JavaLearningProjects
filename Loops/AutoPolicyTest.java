import javax.swing.JOptionPane;

public class AutoPolicyTest
{
	public static void main ( String [] args ) 
	{
		AutoPolicy ap = new AutoPolicy (123, "Toyota Run-X", "MA");

		//int account;
		int account = Integer.parseInt (JOptionPane.showInputDialog ("Enter Account Number: "));
		ap.setAccountNumber(account);
		String model = JOptionPane.showInputDialog ("Make and Model: ");
		ap.setMakeAndModel (model);
		String state = JOptionPane.showInputDialog ("Enter the state: ");
		ap.setState (state);

	}
}

