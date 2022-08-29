import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;

public class LabelFrame extends JFrame{
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	public LabelFrame(){
		super("Testing JLabel");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label with text" );
		label1.setToolTipText("This is Label1");
		add(label1);
		
		ImageIcon pass = new ImageIcon("C:\\Users\\oekpom\\Desktop\\Python\\pass.png");
		label2 = new JLabel("Label with text and icon",pass,SwingConstants.LEFT);
		label2.setToolTipText("This is Label2");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Label with icon and text at bottom");
		label3.setIcon(pass);
		label3.setToolTipText("This is label3");
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		add(label3);
	}
	
	/*public static void main(String [] args){
		LabelFrame labelFrame = new LabelFrame();
		
		labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFrame.setSize(400, 400);
		labelFrame.setVisible(true);
	}*/
}
