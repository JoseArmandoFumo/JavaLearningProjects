import javax.swing.JFrame;
public class DrawExercise41Test 
{
	public static void main (String [] args)
	{
		DrawExercise41 panel = new DrawExercise41 ();

		JFrame app = new JFrame ();

		app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		app.add (panel);
		app.setSize (40, 250);
		app.setVisible (true);

	}

}
