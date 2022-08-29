import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI_DrawRectOROval_Test {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null, "Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals");
		
		int choice = Integer.parseInt(input);
		
		GUI_DrawRectOROval GDRO = new GUI_DrawRectOROval(choice);
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(GDRO);
		frame.setSize(250, 250);
		frame.setVisible(true);
	
	}

}
