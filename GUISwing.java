import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUISwing {
	
	public void newButton(){
		JFrame frame = new JFrame("Button Test");
		JButton btn = new JButton("Click me");
		
		btn.setBounds(120,150,150,50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.add(btn);
		
		HandlerClass Handler = new HandlerClass();
		btn.addActionListener(Handler);
	}
	
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));	
		}
		
	}
	

	public static void main(String[] args) {
		GUISwing newObj = new GUISwing();
		
		newObj.newButton();
		
		
	}

}
