import javax.swing.JOptionPane;

public class HeartRatesTest 
	{
		public static void main (String [] args)
		{

			HeartRates hr = new HeartRates ("Benk", "Fumo", 22,04,1992);

			JOptionPane.showMessageDialog(null, hr.getName() + hr.getSurname());

		}
	}

