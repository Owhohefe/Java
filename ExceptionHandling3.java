import java.util.Scanner;


public class ExceptionHandling3 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 10");
		int number = myScanner.nextInt();
		//assert(number>=0 && number<=10):"bad number: "+number;
		assert ( number >= 0 && number <= 10 ) : "bad number: " + number;

		
		
		System.out.println(number);

	}

}
