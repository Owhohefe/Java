import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GUIRadioButton {
	JFrame myFrame = new JFrame("RadioButton");
	JTextField TextField;
	JRadioButton Plain, Bold, Italics, BoldItalic;
	ButtonGroup group;
	
	GUIRadioButton (){
		TextField = new JTextField("This is a sentence", 25);
		TextField.setFont(new Font("Serif", Font.PLAIN, 14));
		myFrame.add(TextField);
		
		Plain = new JRadioButton("Plain", true);
		myFrame.add(Plain);
		
		Bold = new JRadioButton("Bold", false);
		myFrame.add(Bold);
		
		Italics = new JRadioButton("Italic", false);
		myFrame.add(Italics);
		
		BoldItalic = new JRadioButton("BoldItalic", false);
		myFrame.add(BoldItalic);
		
		group = new ButtonGroup();
		group.add(Plain);
		group.add(Bold);
		group.add(Italics);
		group.add(BoldItalic);
		
		myFrame.setLayout(new FlowLayout());
		myFrame.setSize(300, 150);
		myFrame.setVisible(true);
		
		HandlerClass Handler = new HandlerClass ();
		Plain.addItemListener(Handler);
		Bold.addItemListener(Handler);
		Italics.addItemListener(Handler);
		BoldItalic.addItemListener(Handler);
			
	}
	
	public class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(Plain.isSelected()){
				TextField.setFont(new Font("Serif", Font.PLAIN, 14));
			}else if(Bold.isSelected()){
				TextField.setFont(new Font("Serif", Font.BOLD, 14));
			}else if(Italics.isSelected()){
				TextField.setFont(new Font("Serif", Font.ITALIC, 14));
			}else if(BoldItalic.isSelected()){
				TextField.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 14));
			}	
		}	
	}
	
	public static void main(String[] args) {
		new GUIRadioButton ();
	}

}
