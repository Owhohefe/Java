import java.util.Scanner;

public class MaximumFinder {
	
	public static double maximum(double x, double y, double z){
		double maximumValue = x;
		
		if(y > maximumValue){
			maximumValue = y;
		}
		
		if(z > maximumValue){
			maximumValue = z;
		}
		
		return maximumValue;
	}

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter three floating-point values separated by spaces: ");
		
		double num1 = myScanner.nextDouble(); 
		double num2 = myScanner.nextDouble(); 
		double num3 = myScanner.nextDouble();
		
		double result = maximum(num1,num2,num3);
		
		System.out.println(result);

	}

}
