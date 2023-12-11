import javax.swing.JOptionPane;

public class ClientCredit 
{
	private String name;
	private int accountNr;
	private int initialBalance;
	private int total_monthly;
	private int totalCredit;
	private int limit;

	public ClientCredit (String name, int accountNr, int initialBalance, int total_monthly,
			int totalCredit, int limit)
	{
		this.name = name;
		this.accountNr = accountNr;
		this.initialBalance=initialBalance;
		this.total_monthly =total_monthly;
		this.totalCredit=totalCredit;
		this.limit = limit;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAccountNr (){
		return accountNr;
	}
	public void setAccountNr (int accountNr){
		this.accountNr = accountNr;
	}
	public int getInitialBalance (){
		return initialBalance;
	}
	public void setInitialBalance (int initialBalance){
		this.initialBalance = initialBalance;
	}
	public int getTotal_monthly(){
		return total_monthly;
	}
	public void setTotal_monthly (int total_monthly){
		this.total_monthly = total_monthly;
	}
	public int getTotalCredit (){
		return totalCredit;
	}
	public void setTotalCredit (int totalCredit){
		this.totalCredit = totalCredit;
	}
	public int getLimit (){
		return limit;
	}
	public void setLimit (int limit){
		this.limit = limit;
	}
	public int newBalance (int initialBalance, int total_monthly, int totalCredit)
	{
		int newBal = initialBalance + total_monthly - totalCredit;

		return newBal;
	}



}
