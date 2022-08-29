import javax.swing.JOptionPane;
public class DialogBox {

	public static void main(String[] args) {
		String number1;
		String number2;
		
		number1 = JOptionPane.showInputDialog("pick a number ");
		int no1 = Integer.parseInt(number1);
		
		number2 = JOptionPane.showInputDialog("pick another number ");
		int no2 = Integer.parseInt(number2);
		
		int sum = no1 + no2;
		
		String message = String.format("The sum of the first and second number picked is "+sum);
		
		JOptionPane.showMessageDialog(null, message);

	}

}
