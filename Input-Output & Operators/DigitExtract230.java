import java.util.Scanner;

public class DigitExtract230 
{ 
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int number;
		int remainder=0;
		System.out.print ("Enter the number: ");
		number = input.nextInt();

			if (number>0) 
				 // Printing the last digit of the number
    				
 
          	  // Finding the remainder (Last Digit)
                remainder = number %10;
 
            	// Printing the remainder/current last digit
           	 
 		System.out.printf("%d%s",remainder,"   ");
            	// Removing the last digit/current last digit
           	 number = number / 10;
		
		
		remainder = number % 10;
		System.out.printf("%d%s",remainder, "   ");
		number = number /10;

		remainder = number % 10;
		System.out.printf ("%d%s", remainder,"   ");
		number = number / 10;

		remainder = number % 10;
		System.out.printf("%d%s",remainder,"   ");
		number = number /10;

		remainder = number % 10;
		System.out.printf ("%d%s",remainder,"   ");
		number = number /10; 
        	// M  E  L  H  O  R  A  R   A   O  R  D  E  M    D  E   A  P R E S  E  N T A C A O					

							
								}

}