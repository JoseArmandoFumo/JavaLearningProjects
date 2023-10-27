import javax.swing.JOptionPane;

public class EmployeeTest 
{
	public static void main (String [] args)
	{
		Employee emp1 = new Employee ("Benk" , "Fumo", 1.0);
		Employee emp2 = new Employee("Jose", "Armando", 20.000);

		double sal=0.0;

		String name = JOptionPane.showInputDialog("Enter First Name: ");
		emp1.setName(name);
		
		String surname = JOptionPane.showInputDialog(" Enter Your Surname: ");
		emp1.setSurname(surname);

		sal = Double.parseDouble(JOptionPane.showInputDialog ("Enter your Mounthly Salary: "));
		emp1.setSalary(sal);
		
		double  totalSal = emp1.salaryCalculator(sal);

		JOptionPane.showMessageDialog(null, "Name: " +emp1.getName() + "\n Surname: " + emp1.getSurname() + "\n" + totalSal);

	}
}
