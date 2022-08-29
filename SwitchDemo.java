import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your grade ");
		char name = myScanner.next().charAt(0);
		char grade = Character.toUpperCase(name);
		
		switch (grade){
		
		case 'A':
			System.out.println("You scored an A");
			break;
		case 'B':
			System.out.println("You scored a B");
			break;	
		case 'C':
			System.out.println("You scored a C");
			break;	
		case 'D':
			System.out.println("You scored a D");
			break;
		case 'E':
			System.out.println("You scored an E");
			break;
		case 'F':
			System.out.println("You scored an F");
			break;
		default:
			System.out.println("invalid entry");
			break;
		}
		System.out.println();
		System.out.println("You got the switch statement right!");
	}

}
