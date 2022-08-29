import javax.swing.JFrame;

public class DrawArcs {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArcsJPanel application = new ArcsJPanel();
		frame.add(application);
		frame.setSize(300, 210);
		frame.setVisible(true);

	}

}
