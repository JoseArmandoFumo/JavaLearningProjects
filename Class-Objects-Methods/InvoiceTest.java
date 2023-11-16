iimport javax.swing.JOptionPane;

public class InvoiceTest
{
	public static void main(String [] args)
	{
		Invoice inv = new Invoice ("1","Book",4,2.5);
		int quant;
		double totalPrice = 0.0;
		double pric;
		
		//inv.getInvoiceAmount();

		//JOptionPane.showMessageDialog (null,"Current Data: \n\n" + inv.getId() + "\n"+ inv.getDescription() +"\n"+ inv.getQty() +"\n"+ inv.getPrice());
	
		quant = Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity: "));
		inv.setQty(quant);

		pric = Double.parseDouble(JOptionPane.showInputDialog("Enter unit price: "));
		inv.setPrice( pric);

		totalPrice = inv.getInvoiceAmount(quant,pric);

		JOptionPane.showMessageDialog(null, "The Amount to be paid is: " + totalPrice);


	}
}
