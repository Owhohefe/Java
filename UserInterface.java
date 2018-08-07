package codecbt;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class UserInterface {
	
	ImageIcon submitIcon = new ImageIcon(getClass().getResource("../img/send.png"));
	ImageIcon userIcon = new ImageIcon(getClass().getResource("../img/user.jpg"));
	ImageIcon desktop2Icon = new ImageIcon(getClass().getResource("../img/Login.png"));
	ImageIcon desktop1Icon = new ImageIcon(getClass().getResource("../img/userReg.png"));
	ImageIcon desktop3Icon = new ImageIcon(getClass().getResource("../img/RegUsers.png"));
	ImageIcon settingsIcon = new ImageIcon(getClass().getResource("../img/Settings.png"));
		
		JFrame myFrame = new JFrame("Online Portal");
		JTabbedPane myTabs = new JTabbedPane();
		Color color = (Color.BLACK);
		Color color1 = (Color.ORANGE);
		
		JDesktopPane desktop1, desktop2, desktop3;

		JTextField textField1, textField2,textField3,textField4,textField5;
		
		JLabel label1,label2,label3,label4,label5,label6; 
		
		java.util.List<Users> studentList = new ArrayList<Users>();
		List userList = new List();
		
	UserInterface(){
			
			JMenuBar menubar = new JMenuBar();
			
			JMenu settings = new JMenu("Settings");
			settings.setIcon(settingsIcon);
			
			JMenuItem backGroundColor = new JMenuItem("Change Background Color");
			JMenuItem FontColor = new JMenuItem("Change Font Color");
			
			settings.add(backGroundColor);
			settings.add(FontColor);
			
			backGroundColor.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					color = JColorChooser.showDialog(null, "Pick Background Color", color);
					if (color==null){
						color = Color.BLACK;
					}
					desktop1.setBackground(color);
				}
			});
			
			FontColor.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					color1 =JColorChooser.showDialog(null, "Pick Font Color", color1);
					if (color1==null){
						color1 = Color.ORANGE;
					}
					label1.setForeground(color1);
					label2.setForeground(color1);
					label3.setForeground(color1);
					label4.setForeground(color1);
					label5.setForeground(color1);
					label6.setForeground(color1);
				}
			});
			
			menubar.add(settings);
			
		desktop1 = new JDesktopPane();
			Font myFont = new Font("Aerial", Font.BOLD, 18);
			desktop1.setBackground(color);
			
			label1 = new JLabel("New User Form");
			label1.setBounds(20, 5, 200, 50);
			label1.setFont(myFont);
			label1.setIcon(userIcon);
			label1.setForeground(color1);
			desktop1.add(label1);
			
			
			textField1 = new JTextField();
			textField1.setBounds(120, 60, 200, 30);
			desktop1.add(textField1);
			
			label2 = new JLabel("Name:");
			label2.setBounds(20, 60, 110, 30);
			label2.setForeground(color1);
			desktop1.add(label2);
			
			
			textField2 = new JTextField();
			textField2.setBounds(120, 100, 200, 30);
			desktop1.add(textField2);
			
			label3 = new JLabel("Mat. No.:");
			label3.setBounds(20, 100, 110, 30);
			label3.setForeground(color1);
			desktop1.add(label3);
			
			
			textField3 = new JTextField();
			textField3.setBounds(120, 140, 200, 30);
			desktop1.add(textField3);
			
			label4 = new JLabel("School Name:");
			label4.setBounds(20, 140, 110, 30);
			label4.setForeground(color1);
			desktop1.add(label4);
			
			
			textField4 = new JTextField();
			textField4.setBounds(120, 180, 200, 30);
			desktop1.add(textField4);
			
			label5 = new JLabel("New PIN:");
			label5.setBounds(20, 180, 110, 30);
			label5.setForeground(color1);
			desktop1.add(label5);
			
			
			textField5 = new JTextField();
			textField5.setBounds(120, 220, 200, 30);
			desktop1.add(textField5);
			
			label6 = new JLabel("Confirm PIN:");
			label6.setBounds(20, 220, 110, 30);
			label6.setForeground(color1);
			desktop1.add(label6);
			

			JButton submitBtn = new JButton("Submit");
			submitBtn.setBounds(120, 270, 100, 25);
			submitBtn.setIcon(submitIcon);
			submitBtn.setForeground(Color.WHITE);
			submitBtn.setBackground(Color.RED);
			desktop1.add(submitBtn);
			
			submitBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

					String studentName = textField1.getText();
					String matNo = textField2.getText();
					String schoolName = textField3.getText();
					String newPin = textField4.getText();
					String confirmPin = textField5.getText();
					
					regStudent(studentName, matNo, schoolName, newPin, confirmPin);
					
				}
			});
			
			
		desktop2 = new JDesktopPane();
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
			
			
			JButton myBtn = new JButton("LOGIN");
			myBtn.setBounds(80, 135, 100, 25);
			myBtn.setIcon(submitIcon);
			myBtn.setForeground(Color.WHITE);
			myBtn.setBackground(Color.RED);
			desktop2.add(myBtn);
			
			
		desktop3 = new JDesktopPane();
		    userList.setSize(700, 500);
			desktop3.add(userList);
			
			
			myTabs.addTab("User Registration",desktop1Icon, desktop1);
			myTabs.addTab("User Login",desktop2Icon, desktop2);
			myTabs.addTab("Registered Users",desktop3Icon, desktop3);
			
			myTabs.setSize(700, 500);
			
			myFrame.add(myTabs);
			
			myFrame.setSize(700, 500);
			myFrame.setLayout(null);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setLocation(100, 50);
			myFrame.setVisible(true);
			myFrame.setJMenuBar(menubar);
		}
		
		void regStudent(String a,String b,String c,String d,String e ){
			if (a.equals("")){
				JOptionPane.showMessageDialog(myFrame, "Name must not be empty");	
			}else if (b.equals("")){
				JOptionPane.showMessageDialog(myFrame, "Mat. No. must not be empty");	
			}else if (c.equals("")){
				JOptionPane.showMessageDialog(myFrame, "School Name must not be empty");	
			}else if (d.equals("")){
				JOptionPane.showMessageDialog(myFrame, "New PIN must not be empty");	
			}else if (e.equals("")){
				JOptionPane.showMessageDialog(myFrame, "Confirm PIN must not be empty");	
			}else if (!d.equals(e)){
				JOptionPane.showMessageDialog(myFrame, "PIN's do not match");	
			}else{
				Users user = new Users(a,b,c,d);
				boolean check = studentList.add(user);
				if (check == true){
					String sname = "", smatNo="", sschoolName="", spin="";
					for (Users u :studentList){
						sname = u.studentName;
						smatNo = u.matNo;
						sschoolName = u.schoolName;
						spin = u.pin;
					}						
					userList.add("Student Name: "+sname+" Mat. No.: "+smatNo+" School Name: "+sschoolName+" PIN "+spin);

					JOptionPane.showMessageDialog(myFrame, "User successfully registered");
					textField1.setText("");
					textField2.setText("");
					textField3.setText("");
					textField4.setText("");
					textField5.setText("");
				}else {
					JOptionPane.showMessageDialog(myFrame, "User not registered");	
				}
			}
			
		}
		

		public static void main(String[] args) {

			new UserInterface();

		}

	}
