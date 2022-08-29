import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RadioButtonFrame extends JFrame{
	
	private Font plainFont;
	private Font boldFont;
	private Font italicFont;
	private Font boldItalicFont;
	private JTextField textField;
	private JRadioButton plainJRadioButton;
	private JRadioButton boldJRadioButton;
	private JRadioButton italicJRadioButton;
	private JRadioButton boldItalicJRadioButton;
	private ButtonGroup radioGroup;
	
	public RadioButtonFrame(){
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change", 25 );
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("Bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("Bold/Italic",false);
		add(textField);
		add(plainJRadioButton);
		add(boldJRadioButton);
		add(italicJRadioButton);
		add(boldItalicJRadioButton);
		
		plainFont = new Font("serif", Font.PLAIN, 14);
		boldFont = new Font("serif", Font.BOLD, 14);
		italicFont = new Font("serif", Font.ITALIC, 14);
		boldItalicFont = new Font("serif", Font.BOLD+Font.ITALIC, 14);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(plainJRadioButton);
		radioGroup.add(boldJRadioButton);
		radioGroup.add(italicJRadioButton);
		radioGroup.add(boldItalicJRadioButton);
		
		plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
	}

	private class RadioButtonHandler implements ItemListener{
		
		Font font;
		
		public RadioButtonHandler(Font f){
			font = f;
		}
		@Override
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
			
		}
		
	}
}
