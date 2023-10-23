import java.util.Scanner;
import javax.swing.JOptionPane;

public class StudentTest
{
	public static void main( String [] args)
	{
		Scanner input = new Scanner(System.in);

		Student student=new Student();

	//	System.out.print("Please enter the name: ");
	//	String theName = input.nextLine();
	//	student.setName(theName);

		String theName = JOptionPane.showInputDialog ("Please Enter the Name: ");
		student.setName(theName);

		int theAge = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Age: "));
	//	int theAge = input.nextInt();
		student.setAge(theAge);
		if(theAge<0) 
	//		System.out.println("The Age introduced is invalid!!");
			JOptionPane.showInputDialog("The Age introduced is invalid!");
		else
		{
		JOptionPane.showMessageDialog(null, student.getName() +"\n" + student.getAge());
		//JOptionPane.showInputDialog(null, student.getAge());
		//System.out.printf("The name in student object is: %s%n",student.getName());
		//System.out.printf("The age in student Object is: %d%n", student.getAge());
		}
	}
}
