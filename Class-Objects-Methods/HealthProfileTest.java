import javax.swing.JOptionPane;

public class HealthProfileTest 
{
	public static void main (String [] args )
	{
		HealthProfile p = new HealthProfile ( "Jose", "Armando", "Male", 22,04,1992, 59.0, 1.78);
		
		String name,surname;
		String gender;
		double weight, height;
		int day, month, year;

		name = JOptionPane.showInputDialog ("Name: ");
		p.setName(name);
		surname = JOptionPane.showInputDialog ("Surname: ");
		p.setSurname(surname);
		gender = JOptionPane.showInputDialog ("Gender: ");
		//gender.charAt(0);
		p.setGender (gender);
		day = Integer.parseInt (JOptionPane.showInputDialog ("Birth day: "));
		p.setDay(day);
		month = Integer.parseInt (JOptionPane.showInputDialog ("Birth Month: "));
		p.setMonth(month);
		year = Integer.parseInt (JOptionPane.showInputDialog ("Birth Year: "));
		p.setYear(year);

		int age = p.getAge(year);
		int mhf= p.maxHeartRate (age);
		double thr = p.targetHeartRate (mhf);
		//p.imcCalculator (weight,height);

		JOptionPane.showMessageDialog (null, "Name: "+name+ " " + surname + "\n"
						+ "Gender: "+ gender+ "\n" + "Birthday" 
						+ day + "/"+month + "/"+year + "\n \n\n"
						+ "Age: "+age + "\n"+ "Maxim Heart Frequency : "
						+mhf +"\n" + "Target Heart Rate: " + thr);


	}
}

