
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUISwingClass {
	JFrame frame = new JFrame("Leap Year Calculator");
	JTextField myTextField1, myTextField2;
	JLabel Label1, Label2;
	
	GUISwingClass (){
		JMenuBar menubar = new JMenuBar();
		JMenu MyWork = new JMenu("My Work");
		
		JMenuItem GUISwingClassItem = new JMenuItem("GUISwingClass");
		JMenuItem GUIclassItem = new JMenuItem("GUIclass");
		JMenuItem GUIInterestItem = new JMenuItem("GUIInterest");
		JMenuItem GUIPrintAgeItem = new JMenuItem("GUIPrintAge");
		
		MyWork.add(GUISwingClassItem);
		MyWork.add(GUIclassItem);
		MyWork.add(GUIInterestItem);
		MyWork.add(GUIPrintAgeItem);
		
		menubar.add(MyWork);
		
		
		myTextField1 = new JTextField();
		myTextField1.setBounds(70, 30, 150, 20);
		Label1 = new JLabel("INPUT");
		Label1.setBounds(15, 30, 50, 20);
		
		JButton btn = new JButton("Check Year");
		btn.setBounds(70, 70, 100, 20);
		
		myTextField2 = new JTextField();
		myTextField2.setBounds(70, 110, 150, 20);
		Label2 = new JLabel("OUTPUT");
		Label2.setBounds(15, 110, 50, 20);
		
		frame.setSize(250, 200);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(myTextField1);
		frame.add(Label1);
		frame.add(myTextField2);
		frame.add(Label2);
		frame.add(btn);
		frame.setJMenuBar(menubar);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int yr = Integer.valueOf(myTextField1.getText());
				LeapYear(yr);
				
			}
		});
		
		GUISwingClassItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUISwingClass();
			}
		});
		
		GUIPrintAgeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUIPrintAge();
				frame.setVisible(false);
			}
		});
		
		GUIclassItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GUIclass();
				frame.setVisible(false);
			}
		});
		
		GUIInterestItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GUIInterest();
				frame.setVisible(false);
			}
		});
		
	}
	
	
	public int LeapYear(int year){
		int result = year%4;
		if (result ==0){
			myTextField2.setText("This is a Leap year");
		}else{
			myTextField2.setText("This is not a Leap year");
		}
		return result;
	}
	
	
	public static void main(String [] args){

		new GUISwingClass();
		
	}
	
}
