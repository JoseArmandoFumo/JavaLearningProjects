import javax.swing.JOptionPane;

public class StudentAverageTest
{
	public static void main (String []args )
	{
		String name;
		String grade;
		double test=0.0;
		double average;

		StudentAverage student = new StudentAverage ("Benk", "Pass");

		name = JOptionPane.showInputDialog ("Enter your full Name: ");
		student.setName(name);

		test = Double.parseDouble (JOptionPane.showInputDialog("Initial Test : "));
	

			if (test <=20) //add exception for Strings
			{
			//double average;
			average = student.calcAverage(test);

			if (average <10)
				grade = "Failed";
			else
				grade = "Passed!";

			JOptionPane.showMessageDialog (null,"Name: "+ name + "\n"+ String.format("Average = %.2f ", average)+"\n Grade: "+grade);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Enter valid value");
				test = Double.parseDouble (JOptionPane.showInputDialog ("Initial Test: "));
				average = student.calcAverage (test);
				if (average <10)
					grade = "Failed";
				else
					grade = "Succefull";

				JOptionPane.showMessageDialog (null, "Name: " + name+ "\n" + "Average: "+ average+ "\n" + "Grade: " + grade);
			}
		
	}
}

