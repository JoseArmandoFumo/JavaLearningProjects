import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawExercise41 extends JPanel {
	public void paintComponent ( Graphics g)
	{	
		super.paintComponent (g);

		int width = getWidth();
		int height = getHeight();

		g.drawLine (0,100, width, height);

	//	g.drawLine(100, width,10,height);
	}
}


