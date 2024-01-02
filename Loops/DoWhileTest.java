import javax.swing.JOptionPane;

public class DoWhileTest
{
	public static void main (String[] args)
	{
		int i=1;

		do {
			JOptionPane.showMessageDialog (null, i);
			i++; 
		} while (i<=10);

	}
}


