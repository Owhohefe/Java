import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GUIclass{

	Frame myFrame = new Frame("Leap Year calculator");
	TextField myTextField1, myTextField2;
	Label Label1, Label2;
	
	
	GUIclass(){
		
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
		
		myTextField1 = new TextField();
		myTextField1.setBounds(70, 50, 150, 20);
		Label1 = new Label("INPUT");
		Label1.setBounds(15, 50, 50, 20);
		
		Button btn = new Button("check year");
		btn.setBounds(70, 90, 100, 20);//setting the position of the button
		
		
		myTextField2 = new TextField();
		myTextField2.setBounds(70, 130, 150, 20);
		Label2 = new Label("OUTPUT");
		Label2.setBounds(15, 130, 50, 20);
		
		myFrame.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                myFrame.dispose();  
            }  
        }); 
		
		myFrame.setSize(250, 200);// for the frame
		myFrame.setLayout(null);// for the frame
		myFrame.setVisible(true);// for the frame
		
		myFrame.add(myTextField1);
		myFrame.add(Label1);
		myFrame.add(myTextField2);
		myFrame.add(Label2);
		myFrame.add(btn);
		myFrame.setMenuBar(menubar);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int yr = Integer.valueOf(myTextField1.getText());
				LeapYear(yr);
			}
		});
		
		GUIclassItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GUIclass();	
			}
		});
		
		GUIPrintAgeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUIPrintAge();
				myFrame.setVisible(false);
			}
		});
		
		GUISwingClassItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GUISwingClass();
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
	
	public int LeapYear(int year){
		int result = year%4;
		if (result==0){
			myTextField2.setText("This is a leap year");	
		}else {	
			myTextField2.setText("This is not a leap year");
		}
		
		return result;
		
	}

	public static void main (String []args){
		new GUIclass();
		
		
	}
}
