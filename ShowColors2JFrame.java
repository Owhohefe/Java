import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ShowColors2JFrame extends JFrame{
	
	private JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel;
	
	public ShowColors2JFrame(){
		
		super("Using JColorChooser");
		
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
		add(colorJPanel, BorderLayout.CENTER);

		changeColorJButton = new JButton("Change Color");
		add(changeColorJButton, BorderLayout.SOUTH);
		changeColorJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				color = JColorChooser.showDialog(colorJPanel, "Choose a Color", color);
				if(color == null){
					color = Color.LIGHT_GRAY;
				}
				colorJPanel.setBackground(color);
			}
		});
		
	}

}
