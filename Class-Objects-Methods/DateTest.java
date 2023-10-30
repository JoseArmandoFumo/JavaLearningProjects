import javax.swing.JOptionPane;

public class DateTest 
{
	public static void main (String [] args )
	{
		Date date = new Date (12,07,2000);

	int day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day: "));

		if(day <=31 && day >0)
		date.setDia(day);
		else 
			JOptionPane.showMessageDialog(null, "Invalid day!");
		
		int month = Integer.parseInt( JOptionPane.showInputDialog ("Enter the Month"));
		if(month<=12 && month>0)
			date.setMes(month);
		else
			JOptionPane.showMessageDialog(null,"Month Invalid!");
			
		int year = Integer.parseInt (JOptionPane.showInputDialog ("Enter the Year: "));
		if(year>=0)
			date.setAno(year);
		else
			JOptionPane.showMessageDialog (null, "Invalid Year!");

		//In 2.0 version, this bug nust be fixed : show the date even with invalid input
		date.displayDate(day,month,year);
	}
}
