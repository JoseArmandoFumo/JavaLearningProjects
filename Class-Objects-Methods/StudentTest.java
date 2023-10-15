import java.util.Scanner;

public class StudentTest
{
	public static void main( String [] args)
	{
		Scanner input = new Scanner(System.in);

		Student student=new Student();

		System.out.print("Please enter the name: ");
		String theName = input.nextLine();
		student.setName(theName);

		System.out.print("Please Enter the Age: ");
		int theAge = input.nextInt();
		student.setAge(theAge);
		if(theAge<0) 
			System.out.println("The Age introduced is invalid!!");
		else
		{
		System.out.printf("The name in student object is: %s%n",student.getName());
		System.out.printf("The age in student Object is: %d%n", student.getAge());
		}
	}
}
