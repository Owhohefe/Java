import java.util.Scanner;
public class SumEvenIntegers {
	
	public static void sumIntegers (int n){
	int sum = 0;
	int counter = 0;
	System.out.println("S/N\tEvenNumbers");
	for (int i = 0; i <=n; i++){
		int x =i%2;
		if (x==0){
			counter = counter + 1;
			System.out.print(counter+"\t");
			System.out.println(i);
			sum = sum+i;
		}	
	}
	System.out.println();
	System.out.println("The even numbers between 0 and "+n+" are "+counter+" and their sum is "+sum);
}
	public static void main(String[] args) {
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Enter a number");
		int x = myScanner.nextInt();
	sumIntegers(x);	
	}
}
