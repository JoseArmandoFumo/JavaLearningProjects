import javax.swing.JOptionPane;


public class ProductTest  
{
	public static void main (String [] args)
	{
		Product prod = new Product(1,1,1);

		JOptionPane.showMessageDialog(null, prod.getN1());
//	JOptionPane.showInputDialog ("Enter first number: ");
//	prod.getN1() = JOptionPane.input.parseInt();

	}

}
