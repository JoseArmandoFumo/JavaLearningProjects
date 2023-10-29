import javax.swing.JOptionPane;

public class Date 
{
	private int ano;
	private int mes;
	private int dia;

	public Date (int dia, int mes, int ano) 
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getAno ()
	{
		return ano;
	}
	public void setAno (int ano)
	{
		this.ano = ano;
	}

	public int getMes ()
	{
		return mes;
	}
	public void setMes (int mes)
	{
		this.mes = mes;
	}
	public int getDia ()
	{
		return dia;
	}
	public void setDia (int dia)
	{
		this.dia = dia;
	}

	public void displayDate (int dia , int mes , int ano)
	{
		JOptionPane.showMessageDialog (null, dia +"/ " + mes +" / " +ano);
	}
}




