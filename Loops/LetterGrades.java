import javax.swing.JOptionPane;

public class LetterGrades
{
	public static void main (String [] args)
	{
		int total = 0;
		int i = 0;
		int gradeCounter = 0;
		int aCounter = 0;
		int bCounter = 0;
		int cCounter = 0;
		int dCounter = 0;
		int eCounter = 0;

		int op = Integer.parseInt(JOptionPane.showInputDialog ("Enter the Grade or press -1 to Exit: "));
		
		gradeCounter++;
		total +=op;

		while (op != -1)
		{
			switch (op/10)
			{
				case 9: 
				case 10: ++aCounter;
					 break;
				case 8: ++bCounter;
					break;
				case 7: ++cCounter;
					break;
				case 6: ++dCounter;
					break;
				default: ++eCounter;
					 break;
			}


		}
		JOptionPane.showMessageDialog (null, "Greade Report: "); 
		
		if (gradeCounter != 0) 
		{
			double average = (double) total / gradeCounter;
			JOptionPane.showMessageDialog (null, "Greade Counter: "+ gradeCounter + "\n"+"Total: " + total);

		}
		else
			JOptionPane.showMessageDialog (null, "No Grade were entered!");
		}

}
