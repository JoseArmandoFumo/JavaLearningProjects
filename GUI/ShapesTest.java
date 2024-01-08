import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest 
{
	public static void main (String [] args) 
	{
//	Shapes panel = new Shapes (choice);
	

	int choice = Integer.parseInt (JOptionPane.showInputDialog ("1 - Draw rectangles\n" + "2 - Draw Ovals"));
	
	Shapes panel = new Shapes (choice);

	JFrame application = new JFrame ();

	application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	application.add (panel);
	application.setSize (300, 300);
	application.setVisible (true);
	}

}

