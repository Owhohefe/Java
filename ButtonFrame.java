import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class ButtonFrame extends JFrame{
	private JButton plainJButton;
	private JButton fancyJButton;
	
	public ButtonFrame(){
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("Plain Button");
		add(plainJButton);
		
		Icon bug = new ImageIcon(getClass().getResource("add_bug.png"));
		Icon bug1 = new ImageIcon(getClass().getResource("bug_insect.png"));
		
		fancyJButton = new JButton("Fancy Button", bug);
		fancyJButton.setRolloverIcon(bug1);
		add(fancyJButton);
		
		plainJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed %s",event.getActionCommand()));
				
			}
		});
		
		fancyJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed %s",event.getActionCommand()));
				
			}
		});
		
	}

}
