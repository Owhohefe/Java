import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Font;

public class CheckBoxFrame extends JFrame{
	private JTextField textField;
	private JCheckBox boldJCheckBox;
	private JCheckBox italicJCheckBox;
	
	public CheckBoxFrame(){
		super("JCheckBox Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change", 20);
		textField.setFont(new Font("serif", Font.PLAIN, 14));
		add(textField);
		
		boldJCheckBox = new JCheckBox("Bold");
		italicJCheckBox = new JCheckBox("Italic");
		add(boldJCheckBox);
		add(italicJCheckBox);
		
/*		boldJCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()){
					textField.setFont(new Font("serif", Font.BOLD+Font.ITALIC, 14));
				}else if (boldJCheckBox.isSelected()){
					textField.setFont(new Font("serif", Font.BOLD, 14));
				}else if(italicJCheckBox.isSelected()){
					textField.setFont(new Font("serif", Font.ITALIC, 14));
				}else{
					textField.setFont(new Font("serif", Font.PLAIN, 14));
				}
			}
		});
		
		italicJCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()){
					textField.setFont(new Font("serif", Font.BOLD+Font.ITALIC, 14));
				}else if (italicJCheckBox.isSelected()){
					textField.setFont(new Font("serif", Font.ITALIC, 14));
				}else if (boldJCheckBox.isSelected()){
					textField.setFont(new Font("serif", Font.BOLD, 14));
				}else{
					textField.setFont(new Font("serif", Font.PLAIN, 14));
				}
			}
		});*/
		
		CheckBoxHandler handler = new CheckBoxHandler();
			boldJCheckBox.addItemListener(handler);
			italicJCheckBox.addItemListener(handler);

	}
	
	private class CheckBoxHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()){
				font = new Font("serif", Font.BOLD+Font.ITALIC, 14);
			}else if (italicJCheckBox.isSelected()){
				font = new Font("serif", Font.ITALIC, 14);
			}else if (boldJCheckBox.isSelected()){
				font = new Font("serif", Font.BOLD, 14);
			}else{
				font = new Font("serif", Font.PLAIN, 14);
			} 
			
			textField.setFont(font);
		}
		
	}

}
