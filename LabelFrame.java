import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;
	
public LabelFrame(){
	super ("Testing JLabel");
	setLayout (new FlowLayout());
	
	Label1 = new JLabel("Label with text");
	Label1.setToolTipText("This is Label1");
	add(Label1);
	
	Icon bug = new ImageIcon (getClass().getResource("images/download.jpeg"));
	Label2 = new JLabel ("Label with text and Icon", bug, SwingConstants.LEFT);
	Label2.setToolTipText("This is Label2");
	add(Label2);
	
	Label3 = new JLabel();
	Label3.setIcon(bug);
	Label3.setText("Label with text and Icon at bottom");
	Label3.setHorizontalTextPosition(SwingConstants.CENTER);
	Label3.setVerticalTextPosition(SwingConstants.BOTTOM);
	Label3.setToolTipText("This is Label3");
	add(Label3);
}	
	
}

