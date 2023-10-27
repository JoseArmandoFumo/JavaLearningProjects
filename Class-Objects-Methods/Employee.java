import javax.swing.JOptionPane;

public class Employee
{
	private String name;
	private String surname;
	private double salary;


	public Employee( String name, String surname, double salary)

	{
		this.name = name;
		this.surname = surname;

		if (salary>0)
			this.salary = salary;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
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

	public double getSalary ()
	{
		return salary;
	}
	public void setSalary (double salary)
	{
		this.salary = salary;
	}

	public double salaryCalculator (double sal)
	{
		sal *=12;
		double salBonus = sal + sal * 0.1;
		JOptionPane.showMessageDialog (null, name +" "+ surname + "\n Anual Salary: " + sal + "\n" + "Anual Salary with Bonus: " + salBonus);
		
		return 0;
	}
}
