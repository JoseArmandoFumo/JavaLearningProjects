import javax.swing.JOptionPane;


public class ProductTest  
{
	public static void main (String [] args)
	{
		Product prod = new Product(0,2,3);

//		JOptionPane.showMessageDialog(null, prod.getN1());
		int number = Integer.parseInt (JOptionPane.showInputDialog ("Enter first number: "));
		prod.setN2(number);

		int nb = Integer.parseInt (JOptionPane.showInputDialog("Enter sen=cond Number :"));
		prod.setN1(nb);

		int nm = Integer.parseInt (JOptionPane.showInputDialog("Enter  third number: "));
		prod.setN3(nm);

		JOptionPane.showMessageDialog(null, "NUmero1: " + prod.getN1() + prod.getN2() + prod.getN3());

	}

}
