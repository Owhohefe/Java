import java.util.Calendar;
import java.util.Scanner;

public class Overloading {
	
	static Calendar cal = Calendar.getInstance();
	private static int currentYear = cal.get(Calendar.YEAR);
	private static final int minimumAge = 35;
	private static final int maximumAge = 90;
	
	public static void printAge(String name, int birthYear, int currentYear){
		int Age = currentYear-birthYear;
		System.out.println("\n"+"Welcome "+ name+"\n"+"You are "+Age+" years old");
	}

	public static void printAge(String name, int birthYear, int currentYear, int minimumAge){
		int Age = currentYear-birthYear;
		if(Age>=minimumAge){
			System.out.println("\n"+"Welcome "+ name+"\n"+"You are "+Age+" years old. Hence, you are above the minimum age of "+minimumAge);
		}else {
			System.out.println("\n"+"Welcome "+ name+"\n"+"You are "+Age+" years old. Hence, You are below the minimum age of "+minimumAge);
		}
	}
	
	public static void printAge(String name, int birthYear, int currentYear, int minimumAge, int maximumAge){
		int Age = currentYear-birthYear;
		if(Age>=minimumAge && Age<=maximumAge){
			System.out.println("\n"+"Welcome "+ name+"\n"+"You are "+Age+" years old. "
					+ "Hence, you are within the age range of "+minimumAge+ " and "+maximumAge);
		}else {
			System.out.println("\n"+"Welcome "+ name+"\n"+"You are "+Age+" years old. "
					+ "Hence, you are not within the age range of "+minimumAge+ " and "+maximumAge);
		}
	}

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = myScanner.nextLine();
		System.out.println("Enter your year of birth");
		int birthYear = myScanner.nextInt();
		printAge(name, birthYear, currentYear, minimumAge, maximumAge);
	}

}
