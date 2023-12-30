import javax.swing.JOptionPane;

public class Investiment 
{ 
	public static void main (String [] args)
	{
		int principal;
		double r = 0.5;
		int year;
		double amount;
		
		principal = Integer.parseInt(JOptionPane.showInputDialog ("Informe o valor: "));
		int n = Integer.parseInt (JOptionPane.showInputDialog ("Informe o numer de anos: "));

			for (year =1 ; year<= n; ++year){
				amount = principal * Math.pow(1.0 + r, year );

				JOptionPane.showMessageDialog (null,"Year: "+ year + " mount: "+amount);
			}
	}
}


