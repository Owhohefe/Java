import javax.swing.JOptionPane;

public class GUI_Addition {

	public static void main(String[] args) {
		
		String firstNumber = JOptionPane.showInputDialog("Enter first Integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second Integer");
		
		int first = Integer.parseInt(firstNumber);
		int second = Integer.parseInt(secondNumber);
		
		int result = first + second;
		
		JOptionPane.showMessageDialog(null, "The sum is " + result,"Sum of Two Integers", JOptionPane.INFORMATION_MESSAGE );

	}
}
