import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling1 {
	
	public void quotient(int numerator, int denominator)throws ArithmeticException{
		
		int result = numerator/denominator;
		System.out.printf("\nThe result is %2d",result);
	}

	public static void main(String[] args) {
		ExceptionHandling1 myQuotient = new ExceptionHandling1();
		Scanner myScanner = new Scanner (System.in);
		int x = 0;
		do {
			try{
		System.out.println("Enter numerator");
		int numerator = myScanner.nextInt();
		System.out.println("Enter denominator");
		int denominator = myScanner.nextInt();
		myQuotient.quotient(numerator, denominator);
		x=1;
			}
			catch (InputMismatchException inputMismatchException)
			{System.err.printf("\nException: %s\n",inputMismatchException);
			myScanner.nextLine();
			System.out.println("You must enter Integers. Please try again!\n");
			}
			catch (ArithmeticException arithmeticException)
			{System.err.printf("\nException: %s\n",arithmeticException);
			myScanner.nextLine();
			System.out.println("You cannot divide by zero. Please try again!\n");
			}
	}
		while (x <=0);

}
}