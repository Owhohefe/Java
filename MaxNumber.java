import java.util.Scanner;

public class MaxNumber {
	
	public static void maximum(double x, double y, double z){
		if ((z>y) && (z>x)){
			System.out.println("The maximum number is: " +z);
		}
		else if((y>x) && (y>z)){
			System.out.println("The maximum number is: " +y);
		}
		else if((x>y) && (x>z)){
			System.out.println("The maximum number is: " +x);
		}
		else{System.out.println("invalid numbers");}
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = myScanner.nextInt();
		System.out.println("Enter the second number");
		double num2 = myScanner.nextInt();
		System.out.println("Enter the third number");
		double num3 = myScanner.nextInt();
		
		maximum (num1, num2, num3);
	}

}
