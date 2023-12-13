import javax.swing.JOptionPane;

public class Table 
{
	public static void main (String []args) 
	{
		int n=1;

		while (n<=5)
		{
			JOptionPane.showMessageDialog (null, n + "    "+ n*10 + "       " + n*100 + "        " + n*1000 + "\n");
			

			n += 1; 

		}

	}
}

