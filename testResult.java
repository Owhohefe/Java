import java.util.Scanner;
public class testResult {
	
	public static void takeGrade (int x, int countOne, int countTwo){
		Scanner myScanner = new Scanner (System.in);
		
		while (x <10){
			System.out.println("Enter 1 for pass and 2 for fail ");
			System.out.print((x+1)+"\t");
			int grade = myScanner.nextInt();
			if (grade==1){
				countOne = countOne+1;
			}
			else {countTwo =countTwo+1;}
			x++;
		}

		System.out.println(countOne+" students passed the test");
		System.out.println(countTwo+" students failed the test");
		
		if(countOne>8){
			System.out.println("The lecturer deserves a bonus");
		}
		else {
			System.out.println("The lecturer should work harder");
		}	
	}

	public static void main(String[] args) {
	takeGrade(0,0,0);
	}

}
