import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = input1.nextInt();
		System.out.println("Enter the second number");
		int num2 = input1.nextInt();
		
		int sum1 = num1 + num2;
		
		//System.out.println("The sum of the two numbers is " + sum1);
		System.out.printf("The sum of the two numbers is %s",sum1);
	}

}
