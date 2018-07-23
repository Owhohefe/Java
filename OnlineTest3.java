
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

class OnlineTest3 extends JFrame implements ActionListener{
	
	JLabel myLabel, myLabel1, myLabel2;
	JRadioButton Jb[] = new JRadioButton[15];
	
	JButton b1, b2;
	ButtonGroup bg, bg1, bg2;
	
	String Answers[] = new String [9];
	
	int count =0, current =0;
	
	
	OnlineTest3 (){
		super ("Online Test");
		myLabel = new JLabel();
		myLabel1 = new JLabel();
		myLabel2 = new JLabel();
		
		add(myLabel);
		add(myLabel1);
		add(myLabel2);
		
	
		for (int i=0; i<15; i++){
			Jb[i]= new JRadioButton();
			add(Jb[i]);
		}
		
		
		bg = new ButtonGroup();
		bg1 = new ButtonGroup();
		bg2 = new ButtonGroup();
	
		bg.add(Jb[0]);
		bg.add(Jb[1]);
		bg.add(Jb[2]);
		bg.add(Jb[3]);
		bg.add(Jb[4]);
		
		bg1.add(Jb[5]);
		bg1.add(Jb[6]);
		bg1.add(Jb[7]);
		bg1.add(Jb[8]);
		bg1.add(Jb[9]);
		
		bg2.add(Jb[10]);
		bg2.add(Jb[11]);
		bg2.add(Jb[12]);
		bg2.add(Jb[13]);
		bg2.add(Jb[14]);
		
		
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
		
		myLabel1.setBounds(30, 210, 450, 30);
		myLabel1.setFont(new Font("Aerial", Font.BOLD, 16));
		
		Jb[5].setBounds(50, 250, 200, 20);
		Jb[6].setBounds(50, 280, 200, 20);
		Jb[7].setBounds(50, 310, 200, 20);
		Jb[8].setBounds(50, 340, 200, 20);
		
		myLabel2.setBounds(30, 380, 450, 30);
		myLabel2.setFont(new Font("Aerial", Font.BOLD, 16));
		
		Jb[10].setBounds(50, 420, 200, 20);
		Jb[11].setBounds(50, 450, 200, 20);
		Jb[12].setBounds(50, 480, 200, 20);
		Jb[13].setBounds(50, 510, 200, 20);
		
		b1.setBounds(100, 590, 100, 30);
		b2.setBounds(270, 590, 150, 30);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setSize(screenSize.width, screenSize.height);	
	}

	
	void setQns(){
		Jb[4].setSelected(true);
		Jb[9].setSelected(true);
		Jb[14].setSelected(true);
		
		if(current == 0){
			myLabel.setText("Q1: Which one among the following is not a primitive datatype?");
			Jb[0].setText("int");
			Jb[1].setText("float");
			Jb[2].setText("boolean");
			Jb[3].setText("array");
			
			myLabel1.setText("Q2: Which of this is available to subclasses?");
			Jb[5].setText("Package");
			Jb[6].setText("Class");
			Jb[7].setText("Object");
			Jb[8].setText("ActionEvent");
			
			myLabel2.setText("Q3: String class is defined in which package?");
			Jb[10].setText("lang");
			Jb[11].setText("swing");
			Jb[12].setText("applet");
			Jb[13].setText("awt");
		}
		
		if(current == 1){
			
			myLabel.setText("Q4: Which one among these is a key word?");
			Jb[0].setText("get");
			Jb[1].setText("off");
			Jb[2].setText("if");
			Jb[3].setText("on");
			
			myLabel1.setText("Q5: Which one of these is not a String method?");
			Jb[5].setText("nextLine()");
			Jb[6].setText("toString()");
			Jb[7].setText("setText()");
			Jb[8].setText("Integer.valueOf()");
		
			myLabel2.setText("Q6: This is the parent of Error and Exception classes?");
			Jb[10].setText("Throwable");
			Jb[11].setText("Catchable");
			Jb[12].setText("MainError");
			Jb[13].setText("MainException");
		}
		
		if(current == 2){
			
			myLabel.setText("Q7: What is the default value of float variable?");
			Jb[0].setText("0.0d");
			Jb[1].setText("0.0f");
			Jb[2].setText("0");
			Jb[3].setText("not defined");
			
			myLabel1.setText("Q8: What is the size of short variable?");
			Jb[5].setText("8 bit");
			Jb[6].setText("16 bit");
			Jb[7].setText("32 bit");
			Jb[8].setText("64 bit");
			
			myLabel2.setText("Q9: Which is a valid keyword in java?");
			Jb[10].setText("interface");
			Jb[11].setText("string");
			Jb[12].setText("Float");
			Jb[13].setText("unsigned");
		}	
	}
	
	void setAC(){
		if(current == 0){
			Jb[0].setActionCommand("int");
			Jb[1].setActionCommand("float");
			Jb[2].setActionCommand("boolean");
			Jb[3].setActionCommand("array");
			
			Jb[5].setActionCommand("Package");
			Jb[6].setActionCommand("Class");
			Jb[7].setActionCommand("Object");
			Jb[8].setActionCommand("ActionEvent");
		
			Jb[10].setActionCommand("lang");
			Jb[11].setActionCommand("swing");
			Jb[12].setActionCommand("applet");
			Jb[13].setActionCommand("awt");	
		}
		
		if(current == 1){
			Jb[0].setActionCommand("get");
			Jb[1].setActionCommand("off");
			Jb[2].setActionCommand("if");
			Jb[3].setActionCommand("on");
			
			Jb[5].setActionCommand("nextLine()");
			Jb[6].setActionCommand("toString()");
			Jb[7].setActionCommand("setText()");
			Jb[8].setActionCommand("Integer.valueOf()");
			
			Jb[10].setActionCommand("Throwable");
			Jb[11].setActionCommand("Catchable");
			Jb[12].setActionCommand("MainError");
			Jb[13].setActionCommand("MainException");
		}
	
		if(current == 2){
			Jb[0].setActionCommand("0.0d");
			Jb[1].setActionCommand("0.0f");
			Jb[2].setActionCommand("0");
			Jb[3].setActionCommand("not defined");
			
			Jb[5].setActionCommand("8 bit");
			Jb[6].setActionCommand("16 bit");
			Jb[7].setActionCommand("32 bit");
			Jb[8].setActionCommand("64 bit");
			
			Jb[10].setActionCommand("interface");
			Jb[11].setActionCommand("string");
			Jb[12].setActionCommand("Float");
			Jb[13].setActionCommand("unsigned");	
		}
	}
	
	public void actionPerformed(ActionEvent event){

		if (event.getSource()==b1){
			setAC();
			Answers[count] = bg.getSelection().getActionCommand();
			Answers[count+1] = bg1.getSelection().getActionCommand();
			Answers[count+2] = bg2.getSelection().getActionCommand();
			count+=3;
			current++;
			setQns();
			
			if (current == 2){
				b1.setVisible(false);
				b2.setVisible(true);
				b2.setText("Check Result");
			}
		}
		
		if (event.getSource()==b2){
			setAC();
			current=2;
			count = 6;
			Answers[count] = bg.getSelection().getActionCommand();
			Answers[count+1] = bg1.getSelection().getActionCommand();
			Answers[count+2] = bg2.getSelection().getActionCommand();
			String [] CAnswers = {"array", "Object", "lang", "if", "Integer.valueOf()","Throwable","0.0f","32 bit","interface"};
			
			int sum = 0;
	
			for (int i = 0; i<CAnswers.length;i++){
				if (Answers[i] == CAnswers[i]){
				sum = sum+1;
				}	
			}
			
			JOptionPane.showMessageDialog(this,"You scored " +sum+"\\"+CAnswers.length+".\n\nYour answers were "+Arrays.toString(Answers));
					
			System.exit(0);
			}
		}
	
	public static void main(String[] args) {
		new OnlineTest3 ();
	}
}

