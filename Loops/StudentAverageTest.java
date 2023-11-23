import javax.swing.JOptionPane;

public class StudentAverageTest
{
	public static void main (String []args )
	{
		String name;
		String grade;
		double test=0.0;

		StudentAverage student = new StudentAverage ("Benk", "Pass");

		name = JOptionPane.showInputDialog ("Enter your full Name: ");
		student.setName(name);

		test = Double.parseDouble (JOptionPane.showInputDialog("Initial Test : "));

		double a =0.0;
		a = student.calcAverage(test);

		JOptionPane.showMessageDialog (null, String.format("Average = %.2f ", a));

	}

}

