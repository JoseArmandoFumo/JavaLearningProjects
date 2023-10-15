import java.util.Scanner;

public class PositiveNegative232 
{
	public static void main (String [] args)
	  {
		Scanner input = new Scanner(System.in);
		int n1=0, n2=0, n3=0, n4=0, n5=0;
		int posit=0, negat=0,zero=0;

		System.out.print("Enter 1st number: ");
		n1 = input.nextInt();
			if (n1 >0)
				posit +=1;
			if (n1<0)
				negat +=1;
			if (n1 ==0)
				zero +=1;
		System.out.print ("Enter 2nd Number: ");
		n2 = input.nextInt();
			if (n2>0)
				posit +=1;
			if (n2<0)
				negat +=1;
			if (n2 == 0)
				zero +=1;

		System.out.print ("Enteer 3rd Number: ");
		n3 = input.nextInt();
			if (n3>0)
				posit +=1;
			if (n3<0)
				negat +=1;
			if (n3 == 0)
				zero +=1;
		System.out.print ("Enter 4th Number: ");
		n4 = input.nextInt();
			if (n4>0)
				posit +=1;
			if (n4<0)
				negat +=1;
			if (n4==0)
				zero +=1;
		System.out.print ("Enter 5th Number: ");
		n5 = input.nextInt();
			if (n5 > 0)
				posit += 1;
			if (n5 < 0)
				negat += 1;
			if (n5 == 0)
				zero += 1;

		System.out.printf ("Negativos: %d    Positivos:  %d     Zeros: %d",negat,posit,zero);

		// O P T I M I Z A R  O  C O D I G O
		
		}
}