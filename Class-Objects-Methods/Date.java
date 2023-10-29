import javax.swing.JOptionPane;

public class Date 
{
	private int ano;
	private int mes;
	private int dia;

	public Date (int ano, int mes, int dia) 
	{
		if (ano >=0)
			this.ano = ano;
		if (mes <=12 && mes >0)

			this.mes = mes;
		if (dia <=1 && dia >0)
			this.dia = dia;

	}
	public void getAno ()
	{
		return ano;
	}
	public int setAno (int ano)
	{
		this.ano = ano;
	}

	public void getMes ()
	{
		return mes;
	}
	public int setMes (int mes)
	{
		this.mes = mes;
	}
	public void getDia ()
	{
		return dia;
	}
	public int setDia (int dia)
	{
		this.dia = dia;
	}

	public void displayDate (int dia , int mes , int ano)
	{
		JOptionPane.showMessageDialog (null, dia +"/" + mes +"/" +ano);
	}
}




