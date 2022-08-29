
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GUIInterest {
	JFrame myFrame = new JFrame("Interest");
	JTextField TextField1, TextField2, TextField3, TextField4;
	JLabel Label1, Label2, Label3,Label4;
	
	GUIInterest(){
		
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
		
		TextField1 = new JTextField();
		TextField1.setBounds(90, 10, 110, 20);
		Label1 = new JLabel("PRINCIPAL");
		Label1.setBounds(10, 10, 100, 20);
		
		TextField2 = new JTextField();
		TextField2.setBounds(90, 40, 110, 20);
		Label2 = new JLabel("RATE");
		Label2.setBounds(10, 40, 100, 20);
		
		TextField3 = new JTextField();
		TextField3.setBounds(90, 70, 110, 20);
		Label3 = new JLabel("TIME");
		Label3.setBounds(10, 70, 100, 20);
		
		TextField4 = new JTextField();
		TextField4.setBounds(90, 100, 110, 20);
		Label4 = new JLabel("INTEREST");
		Label4.setBounds(10, 100, 100, 20);
		
		JButton btn = new JButton("Compute");
		btn.setBounds(90, 130, 110, 20);
		
		myFrame.setLayout(null);
		myFrame.setSize(350, 250);
		myFrame.setVisible(true);
		
		myFrame.add(TextField1);
		myFrame.add(Label1);
		myFrame.add(TextField2);
		myFrame.add(Label2);
		myFrame.add(TextField3);
		myFrame.add(Label3);
		myFrame.add(TextField4);
		myFrame.add(Label4);
		myFrame.add(btn);
		myFrame.setJMenuBar(menubar);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			/*
				float P = Float.valueOf(TextField1.getText());
			float R = Float.valueOf(TextField2.getText());
			float T = Float.valueOf(TextField3.getText());
			
			CalcInterest(P, R, T);
			*/
				
			int i =0;
			//do{
				try{
					float P = Float.valueOf(TextField1.getText());
					float R = Float.valueOf(TextField2.getText());
					float T = Float.valueOf(TextField3.getText());
					
					CalcInterest(P, R, T);
					i=1;
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "You have to enter Principal, Rate and Time");
					/*float P = Float.valueOf(TextField1.getText());
					float R = Float.valueOf(TextField2.getText());
					float T = Float.valueOf(TextField3.getText());
					
					CalcInterest(P, R, T);*/
				}
		//}while(i==0);
			
			}
		});
		
		GUIInterestItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GUIInterest();
				
			}
		});
		
		GUISwingClassItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUISwingClass();
				myFrame.setVisible(false);
			}
		});
		
		GUIPrintAgeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUIPrintAge();
				myFrame.setVisible(false);
			}
		});
		
		GUIclassItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GUIclass();
				myFrame.setVisible(false);
			}
		});
	}
	
	public double CalcInterest(float Principal, float Rate, float Time){
		float Interest = ((Principal*Rate*Time)/100);
		String Interest1 = String.valueOf(Interest);
		TextField4.setText(Interest1);
		return Interest;	
	}
	
	public static void main (String [] args){
		new GUIInterest();	
	}
	
}
