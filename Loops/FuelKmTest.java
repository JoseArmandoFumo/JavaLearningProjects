import javax.swing.JOptionPane;


public class FuelKmTest {
	public static void main (String [] args)
	{
		FuelKm fk = new FuelKm (0 , 0);

		int kilometers, fuelQty;
		double consumption = 0;
		int totalKilometers=0;
		int totalfuel=0;
		int op=0;

		while (op != -1)
		{
			kilometers = Integer.parseInt (JOptionPane.showInputDialog ("Enter the Kilometers: "));
			fk.setKilometers(kilometers);
			fuelQty = Integer.parseInt (JOptionPane.showInputDialog ("Enter the Fuel (L): "));
			fk.setFuelQty (fuelQty);

			if (kilometers >0 && fuelQty >0) 
			{
				consumption = fk.fuelConsumption (kilometers, fuelQty);
				totalKilometers += kilometers;
				totalfuel += fuelQty;

				JOptionPane.showMessageDialog (null, "The Consumption was: " + consumption + " KM/L");
			}
			else 
			JOptionPane.showMessageDialog (null, "Error! Enter valid data!");

		op = Integer.parseInt (JOptionPane.showInputDialog ("Do you want do continue (No=-1/ Yes =1)?"));
		}
	}


}

