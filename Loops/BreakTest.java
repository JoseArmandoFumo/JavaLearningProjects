import javax.swing.JOptionPane;

public class BreakTest
{
	public static void main (String [] args) 
	{
		int count;
		for (count = 1; count<=10; count++)
		{
			if (count ==5 )
				break;
			JOptionPane.showMessageDialog (null, count);
		}
		JOptionPane.showMessageDialog (null, "Broke out of  loop at count = "+ count);
	}
}

