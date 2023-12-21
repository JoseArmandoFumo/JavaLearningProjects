import javax.swing.JOptionPane;

public class Investiment 
{ 
	public static void main (String [] args)
	{
		int p;
		double r = 0.5;
		int year;
		double a;
		
		p = Integer.parseInt(JOptionPane.showInputDialog ("Informe o valor: "));
		//n = Integer.parseInt (JOptionPane.showInputDialog ("Informe o numer de anos: "));

			for (year =1 ; year<=5; ++year){
				a = p * Math.pow(1.0 + r, year );

				JOptionPane.showMessageDialog (null,"Year: "+ year + " mount: "+a);
			}
	}
}


