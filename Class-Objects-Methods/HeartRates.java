import javax.swing.JOptionPane;

public class HeartRates 
{
	private String name;
	private String surname;
	private int day;
	private int month;
	private int year;

	public class HeartRates (String name, String surname, int day, int month, int year)
	{
		this.name = name;
		this.surname = surname;
		this.day = day;
		this.month =  month;
		this.year = year;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName (String name)
	{
		this.name = name;
	}

	public String getSurname ()
	{
		return surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
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
	public void setYear (int year)
	{
		this.year = year;
	}

	public int getAge(int birthYear)
	{     
		int age;
		if(birthYear >=0)
		age = 2023 - birthYear;
		else
			age = -1;
		
		return age;

	}


	public int maxHeartRate (int age)
	{
		int mhf = 220 - age;

		return mhf;

	}

	public  double targetHeartRate (int mhf)
	{
		double thr = mhf * 0.50;

		return thr;
		
	} 
	
}
