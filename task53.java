import javax.swing.JOptionPane;


public class Task53 
{
	public static void main (String [] args)
	{
		int i;
		int sum =0;
		int count = 0;

		for (i = 1; i<= 99; i++)
		{
			if (i % 2 == 1 )
			{
				count += 1;
				sum += i;
			}

		}
		JOptionPane.showMessageDialog (null, "The Sum is: " + sum);
	}
}

