import javax.swing.JOptionPane;

public class AutoPolicyTest
{
	public static void main ( String [] args ) 
	{
		AutoPolicy ap = new AutoPolicy (123, "Toyota Run-X", "MA");
		AutoPolicy ap2 = new AutoPolicy (321, "Mazda Demio", "NY");
		
/*		int account = Integer.parseInt (JOptionPane.showInputDialog ("Enter Account Number: "));
		ap.setAccountNumber(account);
		String model = JOptionPane.showInputDialog ("Make and Model: ");
		ap.setMakeAndModel (model);
		String state = JOptionPane.showInputDialog ("Enter the state: ");
		ap.setState (state);
*/
		policyInNoFaultState(ap);
		policyInNoFaultState(ap2);

	}

	public static void policyInNoFaultState (AutoPolicy policy)
	{
		JOptionPane.showMessageDialog (null, "The auto policy: \n \n"+
				"Account #:"+ policy.getAccountNumber()+"\n Car: "+ policy.getMakeAndModel()+ "\n State "+policy.getState()+ " a no-fault state \n \n" + (policy.isNoFaultState() ?  "is" : "is not"));
	}
//Need update in Output
}

