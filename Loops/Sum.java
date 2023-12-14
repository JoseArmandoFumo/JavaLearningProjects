import javax.swing.JOptionPane;

public class Sum 
{
	public static void main (String [] args)
	{

		int total=0;

		for (int i = 2 ; i<=20 ; i +=2)
			total += i;

		JOptionPane.showMessageDialog (null, "Total : " + total);

	}
}

