import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  

import javax.swing.JOptionPane;
 

public class GUIPrintAge {
	Frame myFrame = new Frame("PrintAge");
	TextField TextField1, TextField2, TextField3;
	Label Label1, Label2, Label3;
	
	GUIPrintAge(){
		
		MenuBar menubar = new MenuBar();
		
		Menu MyWork = new Menu("My Work"); 
		
		MenuItem GUISwingClassItem = new MenuItem("GUISwingClass");
		MenuItem GUIclassItem = new MenuItem("GUIclass");
		MenuItem GUIInterestItem = new MenuItem("GUIInterest");
		MenuItem GUIPrintAgeItem = new MenuItem("GUIPrintAge");
		
		MyWork.add(GUISwingClassItem);
		MyWork.add(GUIclassItem);
		MyWork.add(GUIInterestItem);
		MyWork.add(GUIPrintAgeItem);
		
		menubar.add(MyWork);
		
		
		TextField1 = new TextField();
		TextField1.setBounds(120, 50, 100, 20);
		Label1 = new Label("BIRTH YEAR");
		Label1.setBounds(10, 50, 100, 20);
		
		TextField2 = new TextField();
		TextField2.setBounds(120, 80, 100, 20);
		Label2 = new Label("CURRENT YEAR");
		Label2.setBounds(10, 80, 100, 20);
		
		TextField3 = new TextField();
		TextField3.setBounds(120, 110, 100, 20);
		Label3 = new Label("AGE");
		Label3.setBounds(10, 110, 100, 20);
		
		Button btn = new Button("Compute Age");
		btn.setBounds(120, 140, 100, 20);
		
		myFrame.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                myFrame.dispose();  
            }  
        });  
		
		myFrame.setLayout(null);
		myFrame.setSize(250, 200);
		myFrame.setVisible(true);
		
		myFrame.add(TextField1);
		myFrame.add(Label1);
		myFrame.add(TextField2);
		myFrame.add(Label2);
		myFrame.add(TextField3);
		myFrame.add(Label3);
		myFrame.add(btn);
		myFrame.setMenuBar(menubar);
		
	
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int i=0;
				do{
					try{
						int birthyr = Integer.valueOf(TextField1.getText());
						int currentyr = Integer.valueOf(TextField2.getText());
			 
						PrintAge(birthyr, currentyr);
						i=1;
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "You have to enter Birth year and Current year as Integers");
						int birthyr = Integer.valueOf(TextField1.getText());
						int currentyr = Integer.valueOf(TextField2.getText());
						 
						PrintAge(birthyr, currentyr);
					}
			}while(i==0);
			
			}	
		});
		
		GUIPrintAgeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUIPrintAge();
				
			}
		});
		
		GUISwingClassItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUISwingClass();
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
		
		GUIInterestItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GUIInterest();
				myFrame.setVisible(false);
			}
		});
		
	}
	
	public int PrintAge(int birthYear,int currentYear){
		int Age = currentYear - birthYear;
		String Age1 = String.valueOf(Age);
		TextField3.setText(Age1);
		return Age;
	}
	

	public static void main(String[] args) {
		new GUIPrintAge();
	}

}
