import java.util.Scanner;

public class BarCode 
{
	public static void main (String [] args)
	{ 
		
		int n;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <=5; i++)
		{
			System.out.println ("Enter number: ");
			n = input.nextInt ();
		
			if (n > 1 && n< 30)
			{
				for (int j =1; j <= n; j++)
				{
					System.out.print ("* ");
				}
			}
	
			System.out.println ();
	}
	}
}


