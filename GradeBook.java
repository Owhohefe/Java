import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	
	public GradeBook(String name){
		
		courseName = name;
	}
	
	/*public void setCourseName(String name){
		
		courseName = name;
	}*/
	
	public String getCourseName(){
		
		return courseName;
	}

	public void displayMessage(){
		
		System.out.printf("Welcome to the Grade Book for %s", getCourseName());
	}
	
	public void determineClassAverage(){
		Scanner myScanner = new Scanner (System.in);
		
		int x = 0;
		int score = 0;
		int sum = 0;
		double Average = 0;
		
		System.out.println("\n");

		System.out.print("Enter score or -1 to quit: ");
		score = myScanner.nextInt();
		
		while (score != -1){
			sum = sum + score;
			x = x + 1;
			System.out.print("Enter score or -1 to quit: ");
			score = myScanner.nextInt();
			
		}
		
		if (x != 0){
			Average = (double)sum/x;
			System.out.printf("\nTotal of the %d Grades is %d\n",x, sum);
			System.out.printf("Class Average is %.2f\n", Average);
		}
		else{
			System.out.println("No grades were entered");
		}
		
		
		
	}

}
