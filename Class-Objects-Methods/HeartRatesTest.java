import javax.swing.JOptionPane;

public class HeartRatesTest 
	{
		public static void main (String [] args)
		{

			HeartRates hr = new HeartRates ("Benk", "Fumo", 22,04,1992);
			
		String name = JOptionPane.showInputDialog ("Enter your Name: ");
		hr.setName(name);
		String surname = JOptionPane.showInputDialog ("Enter your Surname: ");
		hr.setSurname(surname);
		int year = Integer.parseInt (JOptionPane.showInputDialog ("Enter your Birth Year: "));
		hr.setYear(year);
		int month = Integer.parseInt (JOptionPane.showInputDialog(" ENter your Birth Month: "));
		hr.setMonth(month);
		int day = Integer.parseInt (JOptionPane.showInputDialog("Enter Birth Day: "));
                hr.setDay( day);
		
		int age = hr.getAge(year);
		int maxFrequency = hr.maxHeartRate(age);																			

	               JOptionPane.showMessageDialog(null, "\n"+ hr.getName() + " " + hr.getSurname()
                                        		+ "\n" + hr.getDay() + "/"+hr.getMonth() 
							+"/" + hr.getYear() 
							+ "\n \n \n Your Age is: " + age+ "\n Max Heart Rate: "+maxFrequency);

					
		}
	}

