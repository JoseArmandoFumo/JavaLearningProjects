import javax.swing.JOptionPane;

public HealthProfile
{
	private String name;
	private String surname;
	private char gender;
	private int day;
	private int month;
	private int year;

	public class HealthProfile (String name, String surname, char gender, int day, int month, int year)
	{
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
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
	
	public char getGender()
	{
		return gender;
	}
	public void setGender (char gender)
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
	public setMonth (int month)
	{
		this.month = month;
	}

	public int getYear ()
	{
		return year;
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
}

