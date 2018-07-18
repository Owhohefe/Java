import javax.swing.JOptionPane;

public class GUIAddition {

	public static void main(String[] args) {
		int x = 0;
	do{	
	try{
		String firstNumber = JOptionPane.showInputDialog("Enter the first number");
		String secondNumber = JOptionPane.showInputDialog("Enter second number");
		
		int Number1 = Integer.parseInt(firstNumber);
		int Number2 = Integer.parseInt(secondNumber);
		
		int sum = Number1 + Number2;
		
		JOptionPane.showMessageDialog(null, "The sum of the 2 numbers is "+sum, "Sum of Two Integers",
				JOptionPane.PLAIN_MESSAGE);
		x=1;
	}catch (Exception e){
		JOptionPane.showMessageDialog(null,"You have to enter integer values and click ok", "Error",
				JOptionPane.ERROR_MESSAGE);
	}

}while (x==0);
}
}