import java.awt.Color.*;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GUI_bullsEye extends JPanel {
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.setColor(new Color(244,233,200));
		g.fillOval(10, 10, 250, 250);
		
		g.setColor(new Color(255,255,0));
		g.fillOval(35, 35, 200, 200);
		
		g.setColor(new Color(244,233,200));
		g.fillOval(60, 60, 150, 150);
		
		g.setColor(new Color(255,255,0));
		g.fillOval(85, 85, 100, 100);
		
		g.setColor(new Color(244,233,200));
		g.fillOval(110, 110, 50, 50);
	}

}
