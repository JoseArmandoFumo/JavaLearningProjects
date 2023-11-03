import javax.swing.JOptionPane;

public class HeartRatesTest 
	{
		public static void main (String [] args)
		{

			HeartRates hr = new HeartRates ("Benk", "Fumo", 22,04,1992);
			
			


			JOptionPane.showMessageDialog(null, "*******Current Data ********* \n"+ hr.getName() + "\n" + hr.getSurname()
					+ "\n" + hr.getYear() + "/ "+hr.getMonth() +" /" + hr.getDay() + "\n \n \n \n ");


			 int birth = Integer.parseInt (JOptionPane.showInputDialog("Enter Birth Year: "));
                        hr.getAge( birth);
			int age = hr.getAge(birth);

			JOptionPane.showMessageDialog (null, age);

	/*               JOptionPane.showMessageDialog(null, "\n"+ hr.getName() + "\n" + hr.getSurname()
                                        + "\n" + hr.getYear() + " \n "+hr.getMonth() +" \n" + hr.getDay() + "\n \n \n \n Your Age is: " + age);

					*/
		}
	}

