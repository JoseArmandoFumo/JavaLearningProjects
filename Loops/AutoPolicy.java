import javax.swing.JOptionPane;

public class AutoPolicy 
{
	private int accountNumber;
	private String makeAndModel;
	private String state;

	public AutoPolicy ( int accountNumber, String makeAndModel, String state)
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	public int getAccountNumber ()
	{
		return accountNumber;
	}
	public void setAccountNumber (int AccountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public String getMakeAndModel ()
	{
		return makeAndModel;
	}
	public void setMakeAndModel (String makeAndModel)
	{
		this.makeAndModel = makeAndModel;
	}
	public String getState ()
	{
		return state;
	}
	public void setState ( String state)
	{
		this.state = state;
	}

	public boolean isNoFaultState ()
	{
		boolean noFaultState;
		switch (getState())
		{
			case "MA" : case "NJ" : case "NY" : case "P" : noFaultState = true;
				   break;
			default : noFaultState = false;
				  break;
		}
		return noFaultState;
	}
}
