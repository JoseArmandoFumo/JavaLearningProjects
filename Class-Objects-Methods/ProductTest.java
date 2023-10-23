import javax.swing.JOptionPane;


public class ProductTest  
{
	public static void main (String [] args)
	{
		Product prod = new Product(1,1,1);

//		JOptionPane.showMessageDialog(null, prod.getN1());
	int number = Integer.parseInt (JOptionPane.showInputDialog ("Enter first number: "));
		JOptionPane.showMessageDialog(null, "NUmero1",getN1(number));

	}

}
