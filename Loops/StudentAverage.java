import javax.swing.JOptionPane;

public class StudentAverage 
{
	private String name;
	private String grade;
	//private double average;
	//private 
	//
	public StudentAverage (String name, String grade)
	{
		this.name = name;
		this.grade = grade;

	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String getGrade()
	{
		return grade;
	}
	public void setGrade (String grade)
	{
		this.grade = grade;
	}

	public double calcAverage (double test)
		
	{
		double total =0.0;
		double i=0;
		double average=0;

		while (test != -1 )
		{
			if(test<=20)
			{
				total = total + test;
				test = Double.parseDouble( JOptionPane.showInputDialog("Enter test or -1 to quit: "));
				i=i+1;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid value!");
				test = Double.parseDouble( JOptionPane.showInputDialog("Enter testt or -1 to quit: "));
				//total  +=test;
				//i+=1;
			}
			//i= i+1;
		}
		if (i > 0)
		average = total/i;
		else
			JOptionPane.showMessageDialog (null, "No data were inserted!");

		return average;
	}
}
//bugs in method main (output)
//
