import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GUITextFieldFrame extends JFrame {
	
	private JTextField TextField1;
	private JTextField TextField2;
	private JTextField TextField3;
	private JPasswordField PasswordField;
	
	public GUITextFieldFrame(){
		super ("JTextField and JPassWordField");
		setLayout (new FlowLayout());
		
		TextField1 = new JTextField (10);
		add (TextField1);
		
		TextField2 = new JTextField("Enter text here");
		add(TextField2);
		
		TextField3 = new JTextField("Uneditable text field", 21);
		TextField3.setEditable(false);
		add(TextField3);
		
		PasswordField = new JPasswordField("Hidden text");
		add (PasswordField);
		
		TextFieldHandler Handler = new TextFieldHandler ();
		TextField1.addActionListener(Handler);
		TextField2.addActionListener(Handler);
		TextField3.addActionListener(Handler);
		PasswordField.addActionListener(Handler);
	}
		
		private class TextFieldHandler implements ActionListener {
			public void actionPerformed(ActionEvent event){
				String info = "";
				
				if (event.getSource()==TextField1){
					info = String.format("TextField1: %s", event.getActionCommand());
					}
					
				else if (event.getSource()==TextField2){
					info = String.format("TextField2: %s", event.getActionCommand());
					}
					
				else if (event.getSource()==TextField3){
					info = String.format("TextField3: %s", event.getActionCommand());
					}
					
				else if (event.getSource()==PasswordField){
					info = String.format("PasswordField: %s", event.getActionCommand());
					}
				
				JOptionPane.showMessageDialog(null, info);
				}	
			}
		}

