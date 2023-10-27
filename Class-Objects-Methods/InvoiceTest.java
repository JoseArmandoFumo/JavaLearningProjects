import javax.swing.JOptionPane;

public class InvoiceTest
{
	public static void main(String [] args)
	{
		Invoice inv = new Invoice ("1","Book",4,2.5);

		JOptionPane.showMessageDialog (null,"Current Data: \n\n" + inv.getId() + "\n"+ inv.getDescription() +"\n"+ inv.getQty() +"\n"+ inv.getPrice());
	}
}
