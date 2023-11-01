import javax.swing.JOptionPane;

public class HeartRatesTest 
	{
		public static void main (String [] args)
		{

			HeartRates hr = new HeartRates ("Benk", "Fumo", 22,04,1992);
			
			int age = Integer.parseInt (JOptionPane.showInputDialog("Enter Birth Day: "));
					hr.getAge( age);
			JOptionPane.showMessageDialog(null, "*******Current Data ********* \n"+ hr.getName() + "\n" + hr.getSurname()
					+ "\n" + hr.getYear() + " \n "+hr.getMonth() +" \n" + hr.getDay() + "\n \n \n \n Your Age is: " + age);


		}
	}

