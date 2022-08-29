import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	
	public static int quotient (int numerator, int denominator)throws ArithmeticException{
		return numerator/denominator;
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do{
		try{
			System.out.println("Please enter an Integer numerator");
			int numerator = myScanner.nextInt();
			System.out.println("Please enter and integer denominator");
			int denominator = myScanner.nextInt();
			int result = quotient(numerator, denominator);
			System.out.printf("\nResult: %d/%d = %d\n", numerator, denominator, result);
			continueLoop = false;
		}
		catch (InputMismatchException inputMismatchException){
			System.err.printf("\nException: %s\n", inputMismatchException);
			myScanner.nextLine();
			System.out.println("You must enter Integers. Please try again\n");
		}
		catch (ArithmeticException ArithmeticException){
			System.err.printf("\nException: %s\n", ArithmeticException);
			System.out.println("Zero is an invalid denominator. Please try again.\n" );
		}
		}while (continueLoop);

	}

}
