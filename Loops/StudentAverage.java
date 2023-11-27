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
		double sum =0;
		double i=0;
		double average =0.0;

		//est = Double.parseDouble(JOptionPane.showInputDialog("Introduza a primeira nota: "));

		while (test >0 )
		{
		//sum += test;
		//i = i+1;
			if(test<=20)
			{
				test = Double.parseDouble( JOptionPane.showInputDialog("Enter test: "));
				sum +=test;
				i+=1;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid value!");
				test = Double.parseDouble( JOptionPane.showInputDialog("Enter testT: "));
				sum +=test;
				i+=1;
			}	
		}

		average = sum/i;

		return average;
	}
}

