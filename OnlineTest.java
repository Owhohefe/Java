
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener{
	
	JLabel myLabel;
	JRadioButton Jb[] = new JRadioButton[5];
	JButton b1, b2;
	ButtonGroup bg;
	
	int count =0, current =0; // x = 1, y =1, now = 0;
	//int QMS[] = new int [10];
	
	OnlineTest(String s){
		super("Online Test");
		myLabel = new JLabel();
		add(myLabel);
		
		bg = new ButtonGroup();
		
		for (int i=0; i<5; i++){
			Jb[i]= new JRadioButton();
			add(Jb[i]);
			bg.add(Jb[i]);
		}
		
		b1 = new JButton("Next");
		b2 = new JButton();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b2.setVisible(false);
		
		add(b1);
		add(b2);
		setQns();
		
		myLabel.setBounds(30, 40, 450, 30);
		myLabel.setFont(new Font("Aerial", Font.BOLD, 16));
		
		Jb[0].setBounds(50, 80, 200, 20);
		Jb[1].setBounds(50, 110, 200, 20);
		Jb[2].setBounds(50, 140, 200, 20);
		Jb[3].setBounds(50, 170, 200, 20);
		
		b1.setBounds(100, 240, 100, 30);
		b2.setBounds(270, 240, 100, 30);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setSize(600, 350);
		setLocation(250, 100);
		
	}
	

	public void actionPerformed(ActionEvent event){
		if (event.getSource()==b1){
			count = count+1;
			current++;
			setQns();
			
			if (current == 4){
				b1.setVisible(false);
				b2.setVisible(true);
				b2.setText("Check Result");
			}
		}
		
		if (event.getActionCommand().equals("Check Result")){
			if (checkQns()){
				count  = count+1;
				current++;
				//System prints a result;
				JOptionPane.showMessageDialog(this, "Correct Answer " + count);
				System.exit(0);
				
			}
			}
		}
		

	
	void setQns(){
		Jb[4].setSelected(true);
		if(current == 0){
			myLabel.setText("Q1: Which one among the following is not a primitive datatype?");
			Jb[0].setText("int");
			Jb[1].setText("float");
			Jb[2].setText("boolean");
			Jb[3].setText("array");
		}
		
		if(current == 1){
			myLabel.setText("Q2: Which of this is available to subclasses?");
			Jb[0].setText("Package");
			Jb[1].setText("Class");
			Jb[2].setText("Object");
			Jb[3].setText("ActionEvent");
		}
		
		if(current == 2){
			myLabel.setText("Q3: String class is defined in which package?");
			Jb[0].setText("lang");
			Jb[1].setText("swing");
			Jb[2].setText("applet");
			Jb[3].setText("awt");
		}
		
		if(current == 3){
			myLabel.setText("Q4: Which one among these is a key word?");
			Jb[0].setText("get");
			Jb[1].setText("off");
			Jb[2].setText("if");
			Jb[3].setText("on");
		}
		
		if(current == 4){
			myLabel.setText("Q5: Which one of these is not a String method?");
			Jb[0].setText("nextLine()");
			Jb[1].setText("toString()");
			Jb[2].setText("setText()");
			Jb[3].setText("Integer.valueOf()");
		}
		
		//myLabel.setBounds(30, 40, 450, 30);
		
		//for(int a = 0, j = 0; a<=90; a+=30,j++){
			//Jb[j].setBounds(50, 80+a, 200, 20);
		
		//}
	}
	
	boolean checkQns(){
		if (current == 0){
			return (Jb[3].isSelected());
		}
		
		if (current == 1){
			return (Jb[2].isSelected());
		}
		
		if (current == 2){
			return (Jb[0].isSelected());
		}
		
		if (current == 3){
			return (Jb[2].isSelected());
		}
		
		if (current == 4){
			return (Jb[3].isSelected());
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		new OnlineTest("Online Test");
	}

}