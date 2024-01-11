import javax.swing.JOptionPane;


public class Factorial 
{
	public static void main (String args [])
	{
		long factorial =1;
		int n;

//		for (int i = 1; i<=20; i+=1)
			n = Integer.parseInt (JOptionPane.showInputDialog ("Enter the number: "));
		for (int i = 1; i<= n; i++)
		{
			factorial *= i;
		}
			JOptionPane.showMessageDialog (null, n+"! = " + factorial); 
	}
}

