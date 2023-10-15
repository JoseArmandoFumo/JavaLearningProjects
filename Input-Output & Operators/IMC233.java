import java.util.Scanner;

public class IMC233 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		double imc;
		double weight;
		double height;
		String status = " ";

		System.out.println( "%n****Department of Health and Human Services/National Institutes of Health*****\n");
		System.out.print ("Enter your Weight: ");
		weight = input.nextDouble();
		System.out.print ("Enter your Height: ");
		height = input.nextDouble();
		
		imc =0;
		imc = weight/height*height;

			if (imc <= 18.5)
				status = "Underweight";
			if (imc <=18.5 || imc <= 24.9)
				status = "Normal";
			if (imc >= 25 || imc <= 29.9)
				status = "Overweight";
			if (imc >=30)
				status = "Obese";
 
		
		System.out.println (" BMI Status ");
		System.out.printf ("%s", status);
	}
}
