import javax.swing.JOptionPane;

public class FuelKm
{
	private double kilometers;
	private int fuelQty;

	public FuelKm (double kilometers, int fuelQty)
	{
		this.kilometers = kilometers;
		this.fuelQty = fuelQty;
	}

	public double getKilometers ()
	{
		return kilometers;
		
	}
	public void setKilometers (double kilometers)
	{
		this.kilometers = kilometers;
	}

	public int getFuelQty ()
	{
		return fuelQty;
	}
	public void setFuelQty (int fuelQty)
	{
		this.fuelQty = fuelQty;
	}

	public double fuelConsumption  (double kilometers, int fuelQty)
	{
		double consumption =0;

		consumption = kilometers / fuelQty;
		
		return consumption; 
	}
}


