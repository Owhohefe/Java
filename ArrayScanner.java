import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
	Scanner myScanner = new Scanner (System.in);
	
	System.out.println("Enter number of Students ");
	int a = myScanner.nextInt();
	String names []= new String [a];
	
	Scanner newScanner = new Scanner (System.in);
	
	for (int i = 0; i<a; i++){
		System.out.println("Enter name of student");
		System.out.print(i+"\t");
		names[i]= newScanner.nextLine();
	}
	
	System.out.println();
	System.out.println("The names in the array are");
	String d = Arrays.toString(names);
	System.out.println(d);
	System.out.println();
	
	System.out.println("INDEX\tNAMES");
	for (int i =0; i<names.length; i++){
		System.out.print(i+"\t");
		System.out.println(names[i]);
	}

	}

}
