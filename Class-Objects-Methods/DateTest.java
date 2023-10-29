import javax.swing.JOptionPane;

public class DateTest 
{
	public static void main (String [] args )
	{
		Date date = new Date (12,07,2000);

	int day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day: "));
			date.setDia(day);

		int month = Integer.parseInt( JOptionPane.showInputDialog ("Enter the Month"));
			date.setMes(month);

		int year = Integer.parseInt (JOptionPane.showInputDialog ("Enter the Year: "));
			date.setAno(year);

		date.displayDate(day,month,year);
	}
}
