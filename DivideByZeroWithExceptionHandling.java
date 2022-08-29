import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroWithExceptionHandling {
	
	public static int quotient(int numerator, int denominator)throws ArithmeticException{
		return numerator/denominator;
	}
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		boolean continueLoop = true;
		//DivideByZeroWithExceptionHandling DBZEH = new DivideByZeroWithExceptionHandling();
		do{
			try{
				System.out.println("Enter the numerator: ");
				int x = myScanner.nextInt();
				System.out.println("Enter the denominator: ");
				int y = myScanner.nextInt();
				//int result = DBZEH.quotient(x, y);
				int result = quotient(x, y);
				System.out.printf("Result: %d/%d = %d\n",x,y,result);
				continueLoop = false;
			}catch (InputMismatchException e){
				System.err.printf("Exception: %s\n",e);
				myScanner.nextLine();
				System.out.println("You must enter integer values");
			}catch (ArithmeticException e){
				System.err.printf("Exception: %s\n",e);
				System.out.println("Zero is an invalid denominator. Please try again.\n");
			}catch (Exception e){
				System.err.printf("Exception: %s\n",e);
				System.out.println("An unexpected error occured. Please try again.\n");
			}	
		}while(continueLoop);
	}
}
