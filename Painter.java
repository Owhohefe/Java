import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Painter {

	public static void main(String[] args) {
		JFrame application = new JFrame();
		
		PaintPanel paintPanel = new PaintPanel();
		application.add(paintPanel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Drag the mouse to draw");
		application.add(label,BorderLayout.SOUTH);
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400, 200);
		application.setVisible(true);

	}

}
