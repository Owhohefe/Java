import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class PanelFrame extends JFrame{

	private JPanel buttonJPanel;
	private JButton [] buttons;
	
	public PanelFrame(){
		
		super("Panel Demo");
		
		buttons = new JButton[5];
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(1,buttons.length));
		
		for (int count=0; count < buttons.length; count++){
			buttons[count] = new JButton("Button"+(count+1));
			buttonJPanel.add(buttons[count]);
		}
		
		add(buttonJPanel,BorderLayout.SOUTH);
	}
}
