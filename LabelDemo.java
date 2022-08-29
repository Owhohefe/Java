import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class LabelDemo {

	public static void main(String[] args) {
		
		JLabel northLabel = new JLabel("North");
		
		ImageIcon labelIcon = new ImageIcon("C:\\Users\\oekpom\\Desktop\\python\\pass.png");
		JLabel centerLabel = new JLabel(labelIcon);
		centerLabel.setText("Center");
		
		JLabel southLabel = new JLabel(labelIcon);
		southLabel.setText("South");
		
		
		JFrame application = new JFrame();
		
		application.add(northLabel, BorderLayout.NORTH);
		application.add(centerLabel, BorderLayout.CENTER);
		application.add(southLabel, BorderLayout.SOUTH);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400, 400);
		application.setVisible(true);
	}

}
