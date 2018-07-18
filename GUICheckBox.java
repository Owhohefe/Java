import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class GUICheckBox {
	JFrame myFrame = new JFrame ("Bold/Italics");
	JTextField TextField;
	JCheckBox Bold, Italics;
	
	GUICheckBox (){
		TextField = new JTextField("This is a sentence");
		TextField.setFont(new Font("Serif", Font.PLAIN, 14));
		myFrame.add(TextField);
		
		Bold = new JCheckBox("Bold");
		Bold.setFont(new Font("Serif", Font.BOLD, 14));
		myFrame.add(Bold);
		
		Italics = new JCheckBox("Italics");
		Italics.setFont(new Font("Serif", Font.ITALIC, 14));
		myFrame.add(Italics);
		
		myFrame.setLayout(new FlowLayout());
		myFrame.setSize(350, 200);
		myFrame.setVisible(true);
		
		HandlerClass Handler = new HandlerClass();
		Bold.addItemListener(Handler);
		Italics.addItemListener(Handler);
	}
	
	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			
			if(Bold.isSelected() && Italics.isSelected()){
				TextField.setFont(new Font("Serif", Font.BOLD + Font.ITALIC , 14));
				myFrame.add(TextField);
			}else if(Italics.isSelected()){
					TextField.setFont(new Font("Serif", Font.ITALIC, 14));
					myFrame.add(TextField);
			}else if(Bold.isSelected()){
					TextField.setFont(new Font("Serif", Font.BOLD, 14));
					myFrame.add(TextField);
			}else{
				TextField.setFont(new Font("Serif", Font.PLAIN, 14));
				myFrame.add(TextField);
			}
		}
	}

	public static void main(String[] args) {
		new GUICheckBox ();

	}

}
