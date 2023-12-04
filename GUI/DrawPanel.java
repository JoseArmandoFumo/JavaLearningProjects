import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();

		g.drawLine (10,0, width, height);

		g.drawLine (10, height, width, 0);

	}
}
