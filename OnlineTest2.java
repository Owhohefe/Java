
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

class OnlineTest2 extends JFrame implements ActionListener{
	
	JLabel myLabel;
	JRadioButton Jb[] = new JRadioButton[5];
	JButton b1, b2;
	ButtonGroup bg;
	
	String Answers[] = new String [10];
	
	int count =1, current =0;
	
	
	OnlineTest2 (){
		super ("Online Test");
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
		b2.setBounds(270, 240, 150, 30);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setSize(600, 350);
		setLocation(250, 100);
		
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
		
		if(current == 5){
			myLabel.setText("Q6: This is the parent of Error and Exception classes?");
			Jb[0].setText("Throwable");
			Jb[1].setText("Catchable");
			Jb[2].setText("MainError");
			Jb[3].setText("MainException");
		}
		
		if(current == 6){
			myLabel.setText("Q7: What is the default value of float variable?");
			Jb[0].setText("0.0d");
			Jb[1].setText("0.0f");
			Jb[2].setText("0");
			Jb[3].setText("not defined");
		}
		
		if(current == 7){
			myLabel.setText("Q8: What is the size of short variable?");
			Jb[0].setText("8 bit");
			Jb[1].setText("16 bit");
			Jb[2].setText("32 bit");
			Jb[3].setText("64 bit");
		}
		
		if(current == 8){
			myLabel.setText("Q9: Which is a valid keyword in java?");
			Jb[0].setText("interface");
			Jb[1].setText("string");
			Jb[2].setText("Float");
			Jb[3].setText("unsigned");
		}
		
		if(current == 9){
			myLabel.setText("Q10: Which is a reserved word in the Java programming language?");
			Jb[0].setText("method");
			Jb[1].setText("native");
			Jb[2].setText("subclasses");
			Jb[3].setText("reference");
		}
	}
	
	void setAC(){
		if(current == 0){
			Jb[0].setActionCommand("int");
			Jb[1].setActionCommand("float");
			Jb[2].setActionCommand("boolean");
			Jb[3].setActionCommand("array");
		}
		
		if(current == 1){
			Jb[0].setActionCommand("Package");
			Jb[1].setActionCommand("Class");
			Jb[2].setActionCommand("Object");
			Jb[3].setActionCommand("ActionEvent");
		}
		
		if(current == 2){
			Jb[0].setActionCommand("lang");
			Jb[1].setActionCommand("swing");
			Jb[2].setActionCommand("applet");
			Jb[3].setActionCommand("awt");
		}
		
		if(current == 3){
			Jb[0].setActionCommand("get");
			Jb[1].setActionCommand("off");
			Jb[2].setActionCommand("if");
			Jb[3].setActionCommand("on");
		}
		
		if(current == 4){
			Jb[0].setActionCommand("nextLine()");
			Jb[1].setActionCommand("toString()");
			Jb[2].setActionCommand("setText()");
			Jb[3].setActionCommand("Integer.valueOf()");
		}
		
		if(current == 5){
			Jb[0].setActionCommand("Throwable");
			Jb[1].setActionCommand("Catchable");
			Jb[2].setActionCommand("MainError");
			Jb[3].setActionCommand("MainException");
		}
		
		if(current == 6){
			Jb[0].setActionCommand("0.0d");
			Jb[1].setActionCommand("0.0f");
			Jb[2].setActionCommand("0");
			Jb[3].setActionCommand("not defined");
		}
		
		if(current == 7){
			Jb[0].setActionCommand("8 bit");
			Jb[1].setActionCommand("16 bit");
			Jb[2].setActionCommand("32 bit");
			Jb[3].setActionCommand("64 bit");
		}
		
		if(current == 8){
			Jb[0].setActionCommand("interface");
			Jb[1].setActionCommand("string");
			Jb[2].setActionCommand("Float");
			Jb[3].setActionCommand("unsigned");
		}
		
		if(current == 9){
			Jb[0].setActionCommand("method");
			Jb[1].setActionCommand("native");
			Jb[2].setActionCommand("subclasses");
			Jb[3].setActionCommand("reference");
		}
	}
	
	public void actionPerformed(ActionEvent event){

		if (event.getSource()==b1){
			setAC();
			count = count+1;
			Answers[current] = bg.getSelection().getActionCommand();
			current++;
			setQns();
			
			if (current == 9){
				b1.setVisible(false);
				b2.setVisible(true);
				b2.setText("Check Result");
			}
		}
		
		if (event.getSource()==b2){
			setAC();
			current = 9;
			Answers[current] = bg.getSelection().getActionCommand();
			String [] CAnswers = {"array", "Object", "lang", "if", "Integer.valueOf()","Throwable","0.0f","32 bit","interface","native"};
			
			int sum = 0;
	
			for (int i = 0; i<CAnswers.length;i++){
				if (Answers[i] == CAnswers[i]){
				sum = sum+1;
				}	
			}
			
			JOptionPane.showMessageDialog(this,"You scored " +sum+"\\"+count+".\n\nYour answers were "+Arrays.toString(Answers));
			System.exit(0);
			
			}
		}
	
	public static void main(String[] args) {
		new OnlineTest2 ();
	}

}