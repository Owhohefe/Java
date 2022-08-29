import javax.swing.JFrame;

public class GUI_bullsEyeTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GUI_bullsEye panel = new GUI_bullsEye();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(280, 300);
		frame.setVisible(true);

	}

}
