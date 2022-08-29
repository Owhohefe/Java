import javax.swing.JFrame;

public class Fonts {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FontJPanel application = new FontJPanel();
		frame.add(application);
		frame.setSize(420,150);
		frame.setVisible(true);

	}

}
