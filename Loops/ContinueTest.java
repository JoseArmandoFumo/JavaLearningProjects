import javax.swing.JOptionPane;

public class ContinueTest
{
	public static void main (String [] args)
	{
		for (int count = 1; count <=10; count++)
		{
			if (count ==5 ) 
				continue;
			JOptionPane.showMessageDialog (null, count);
		}
		JOptionPane.showMessageDialog(null, "Used continue to skip printing 5");
	}
}

