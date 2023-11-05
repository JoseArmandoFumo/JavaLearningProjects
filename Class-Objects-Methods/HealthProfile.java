import javax.swing.JOptionPane;

public class HealthProfile
{
	private String name;
	private String surname;
	private String gender;
	private int day;
	private int month;
	private int year;
	private double weight;
	private double height;

	public HealthProfile (String name, String surname, String gender, int day, int month, int year, double weight, double height)
	{
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
		this.weight = weight;
		this.height = height;
	}
	public String getName( )
	{
		return name;
	}
	public void setName (String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}
	public void setSurname (String surname)
	{
		this.surname = surname;
	}
	
	public String getGender()
	{
		return gender;
	}
	public void setGender (String gender)
	{
		this.gender = gender;
	}

	public int getDay()
	{
		return day;
	}
	public void setDay (int day)
	{
		this.day = day;
	}
	public int getMonth ()
	{
		return month;
	}
	public void setMonth (int month)
	{
		this.month = month;
	}

	public int getYear ()
	{
		return year;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight (double weight)
	{
		this.weight = weight;
	}
	public double getHeight ()
	{
		return height;
	}
	public void setHeight (double height)
	{
		this.height = height;
	}

	public void setYear(int year)
	{
		this.year = year;
	}
	public int getAge (int birth)
	{
		int age = 2023 - birth;

		return age;
	}
	public int maxHeartRate (int age)
	{
		int mhf = 220 - age;
		return mhf;
	}

	public double targetHeartRate (int freqMax)
	{
		double thr = freqMax * 0.85;
		return thr;
	}

/*	public double imcCalculator (double weight, double height)
	{
		double imc = weight / height * height;

		if (imc < 18.5)
			JOptionPane.showMessageDialog (null, " Underweight!");
		else
		{
			if(imc <=24.9)
				JOptionPane.showMessageDialog (null, "Normal!");
			else
			{
				if (imc <= 29.9)
					JOptionPane.showMessageDialog (null, "Overweight!");
				else
					JOptionPane.showMessageDialog (null, "Obese!");
			}
		}
		return imc;
	} */
}

