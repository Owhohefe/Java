import javax.swing.JFrame;
import java.awt.Color;

public class LinesRectsOvals extends JFrame{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LinesRectsOvalsJPanel application = new LinesRectsOvalsJPanel();
		application.setBackground(Color.WHITE);
		frame.add(application);
		frame.setSize(400, 200);
		frame.setVisible(true);

	}

}
