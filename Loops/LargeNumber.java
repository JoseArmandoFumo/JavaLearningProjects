import javax.swing.JOptionPane;

public class LargeNumber 
{
	public static void main (String [] args)
	{
		 int counter=0;
		 int number=0;
		 int largest=0;

		while ( counter <10)
		{
			number = Integer.parseInt (JOptionPane.showInputDialog ("Enter Valid  Number: "));
			if (number > largest) 
			{
				largest = number; 
				counter += 1;
			}
			else 
				counter +=1;

		}
		JOptionPane.showMessageDialog (null, "The lasgest Number is: "+ largest);

	}
}
//EFECTUAR A VALIDACAO

