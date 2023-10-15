import java.util.Scanner;

public class Multiplos226 { 
	public static void main (String[] args) {

	  Scanner input= new Scanner(System.in);
		
		int a;
		int b;
		System.out.print ("Enter first Number: ");
		a = input.nextInt();
		System.out.print("Enter Second Digit: ");
		b = input.nextInt(); 
			if (a % b == 0)
				System.out.printf ("%s %d X %d = %d"," Multiplos  ",a,b, a*b);
			//else
				//System.out.printf ("%d%s",a, " Impar");
				}

}