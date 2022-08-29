import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GUITabs {
	
	JFrame myFrame = new JFrame("GUI Tabs");
	
	GUITabs(){
		
		ImageIcon submitIcon = new ImageIcon(getClass().getResource("img/send.png"));
		ImageIcon userIcon = new ImageIcon(getClass().getResource("img/user.jpg"));
		ImageIcon desktop1Icon = new ImageIcon(getClass().getResource("img/javahome.png"));
		ImageIcon desktop2Icon = new ImageIcon(getClass().getResource("img/css.jpg"));
		ImageIcon desktop3Icon = new ImageIcon(getClass().getResource("img/bootstrap.jpg"));
		ImageIcon desktop4Icon = new ImageIcon(getClass().getResource("img/html.png"));
		ImageIcon desktop5Icon = new ImageIcon(getClass().getResource("img/jscript.png"));
		ImageIcon desktop6Icon = new ImageIcon(getClass().getResource("img/phplogo.png"));
		
		JDesktopPane desktop1 = new JDesktopPane();
		
		JTextArea myTextArea = new JTextArea();
		myTextArea.setText("This is a Text Area..");
		myTextArea.setSize(700, 300);
		desktop1.add(myTextArea);
		
		
		JDesktopPane desktop2 = new JDesktopPane();
		Font font = new Font("Aerial", Font.BOLD, 18);
		desktop2.setBackground(Color.LIGHT_GRAY);
		
		JLabel myLabel = new JLabel("LOGIN FORM");
		myLabel.setBounds(20, 10, 200, 30);
		myLabel.setFont(font);
		desktop2.add(myLabel);
		
		JLabel myLabel1 = new JLabel("Mat. No.:");
		myLabel1.setBounds(20, 50, 70, 30);
		desktop2.add(myLabel1);
		
		JTextField myTextField = new JTextField();
		myTextField.setBounds(80, 50, 200, 30);
		desktop2.add(myTextField);
		
		
		JLabel myLabel2 = new JLabel("PIN:");
		myLabel2.setBounds(20, 90, 70, 30);
		desktop2.add(myLabel2);
		
		JTextField myTextField1 = new JTextField();
		myTextField1.setBounds(80, 90, 200, 30);
		desktop2.add(myTextField1);
		
		
		JButton myBtn = new JButton("Submit");
		myBtn.setBounds(80, 135, 100, 25);
		myBtn.setIcon(submitIcon);
		myBtn.setForeground(Color.WHITE);
		myBtn.setBackground(Color.RED);
		desktop2.add(myBtn);
		
		
		JDesktopPane desktop3 = new JDesktopPane();
		Font myFont = new Font("Aerial", Font.BOLD, 18);
		desktop3.setBackground(Color.BLACK);
		
		JLabel label1 = new JLabel("New User Form");
		label1.setBounds(20, 5, 200, 50);
		label1.setFont(myFont);
		label1.setIcon(userIcon);
		label1.setForeground(Color.ORANGE);
		desktop3.add(label1);
		
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(120, 60, 200, 30);
		desktop3.add(textField1);
		
		JLabel label2 = new JLabel("Name:");
		label2.setBounds(20, 60, 110, 30);
		label2.setForeground(Color.WHITE);
		desktop3.add(label2);
		
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(120, 100, 200, 30);
		desktop3.add(textField2);
		
		JLabel label3 = new JLabel("Mat. No.:");
		label3.setBounds(20, 100, 110, 30);
		label3.setForeground(Color.WHITE);
		desktop3.add(label3);
		
		
		JTextField textField3 = new JTextField();
		textField3.setBounds(120, 140, 200, 30);
		desktop3.add(textField3);
		
		JLabel label4 = new JLabel("School Name:");
		label4.setBounds(20, 140, 110, 30);
		label4.setForeground(Color.WHITE);
		desktop3.add(label4);
		
		
		JTextField textField4 = new JTextField();
		textField4.setBounds(120, 180, 200, 30);
		desktop3.add(textField4);
		
		JLabel label5 = new JLabel("New PIN:");
		label5.setBounds(20, 180, 110, 30);
		label5.setForeground(Color.WHITE);
		desktop3.add(label5);
		
		
		JTextField textField5 = new JTextField();
		textField5.setBounds(120, 220, 200, 30);
		desktop3.add(textField5);
		
		JLabel label6 = new JLabel("Confirm PIN:");
		label6.setBounds(20, 220, 110, 30);
		label6.setForeground(Color.WHITE);
		desktop3.add(label6);
		

		JButton submitBtn = new JButton("Submit");
		submitBtn.setBounds(120, 270, 100, 25);
		submitBtn.setIcon(submitIcon);
		submitBtn.setForeground(Color.WHITE);
		submitBtn.setBackground(Color.RED);
		desktop3.add(submitBtn);
		
		JDesktopPane desktop4 = new JDesktopPane();
		
		JTextArea myTextArea1 = new JTextArea();
		myTextArea1.setText("This is the Text Area for desktop4..");
		myTextArea1.setSize(700, 300);
		desktop4.add(myTextArea1);
		
		JDesktopPane desktop5 = new JDesktopPane();
		
		JTextArea myTextArea2 = new JTextArea();
		myTextArea2.setText("This is the Text Area for desktop5..");
		myTextArea2.setSize(700, 300);
		desktop5.add(myTextArea2);
		
		JDesktopPane desktop6 = new JDesktopPane();
		
		JTextArea myTextArea3 = new JTextArea();
		myTextArea3.setText("This is the Text Area for desktop6..");
		myTextArea3.setSize(700, 300);
		desktop6.add(myTextArea3);
		
		JTabbedPane myTabs = new JTabbedPane();
		
	
		myTabs.addTab("Java",desktop1Icon, desktop1);
		myTabs.addTab("CSS",desktop2Icon, desktop2);
		myTabs.addTab("Bootstrap",desktop3Icon, desktop3);
		myTabs.addTab("HTML",desktop4Icon, desktop4);
		myTabs.addTab("Javascript",desktop5Icon, desktop5);
		myTabs.addTab("PHP",desktop6Icon, desktop6);
		
		//myTabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		myTabs.setSize(700, 500);
		
		myFrame.add(myTabs);
		
		myFrame.setSize(700, 500);
		myFrame.setLayout(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(100, 50);
		myFrame.setVisible(true);
	}
	

	public static void main(String[] args) {

		new GUITabs();

	}

}
