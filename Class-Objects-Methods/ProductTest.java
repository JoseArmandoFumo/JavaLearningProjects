import javax.swing.JOptionPane;


public class ProductTest  
{
	public static void main (String [] args)
	{
		Product prod = new Product(4,2,3);

//		JOptionPane.showMessageDialog(null, prod.getN1());
		int number = Integer.parseInt (JOptionPane.showInputDialog ("Enter first number: "));
		prod.setN1(number);
		

		int nb = Integer.parseInt (JOptionPane.showInputDialog("Enter sen=cond Number :"));
		prod.setN2(nb);

		int nm = Integer.parseInt (JOptionPane.showInputDialog("Enter  third number: "));
		prod.setN3(nm);

		int product = prod.getN1()*prod.getN2()*prod.getN3();

		JOptionPane.showMessageDialog(null, prod.getN1() + " * "+ prod.getN2() +" * "+ prod.getN3()+ " = " +product);

	}

}
