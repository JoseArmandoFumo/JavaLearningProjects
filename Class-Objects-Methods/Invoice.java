import javax.swing.JOptionPane;

public class Invoice
{
	private String id;
	private String description;
	private int qty;
	private double price;

	public Invoice (String id, String description, int qty, double price)
	{
		this.id = id;
		this.description = description;
		this.qty = qty;
		this.price = price;

	}
	public String getId ()
	{
		return id;
	}

	public void setId (String id)
	{
		this.id = id;
	}

	public String getDescription ()
	{
		return description;
	}

	public void setDescription (String description)
	{
		this.description = description; 
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty (int qty)
	{
		this.qty = qty;
	}

	public double getPrice() 
	{
		return price;
	}
	public void setPrice (double price)
	{
		this.price = price;
	}
	public double getInvoiceAmount (int quant, double pric)
	{
		double totalPrice = 0.0;
		if (quant >0 && pric > 0.0)
			totalPrice = quant * pric;
		else
		{
			if(quant > 0 && pric <= 0.0)
			
				JOptionPane.showMessageDialog (null, "Price Invalid, Price must be higher than "+ pric);
			else 
				JOptionPane.showMessageDialog (null, "Quantity Invalid, Quantity must be Higher than "+ quant);
		}
		return totalPrice;
	}
}
