import javax.swing.JFrame;

public class DrawSmileyTest {

	public static void main(String[] args) {
		JFrame application = new JFrame();
		DrawSmiley panel = new DrawSmiley();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(230, 250);
		application.add(panel);
		application.setVisible(true);
		

	}

}
