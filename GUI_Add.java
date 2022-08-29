import javax.swing.JOptionPane;

public class GUI_Add {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Enter the first number");
		
		String y = JOptionPane.showInputDialog("Enter the second number");
		
		double num1 = Double.parseDouble(x);
		
		double num2 = Double.parseDouble(y);
		
		double sum = num1 + num2;
		
		String message = String.format("The sum of the 2 numbers is %s", sum);
		
		JOptionPane.showMessageDialog(null, message);
		
		

	}

}
