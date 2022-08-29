import javax.swing.JFrame;

public class GUI_DrawLine_Test {

	public static void main(String[] args) {
		GUI_DrawLIne  panel = new GUI_DrawLIne();
		
		JFrame frame = new JFrame();
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 250);
		frame.setVisible(true);
	
	}

}
