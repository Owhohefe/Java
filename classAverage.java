import java.util.Scanner;

public class classAverage {
	
	public void displayMessage(){
		Scanner oldScanner = new Scanner (System.in);	
		System.out.println("Please enter your name ");
		String name = oldScanner.nextLine();
		System.out.println("\n\n\n");
		System.out.println("Welcome "+name+" to the program that computes average");
		
	}
		
	public void determineAverage(){
		Scanner myScanner = new Scanner (System.in);
		int counter = 0;
		int score = 0;
		int sum = 0;
		int average;
		
		System.out.print("Enter grade or -1 to quit: ");
		score = myScanner.nextInt();
	while (score!=-1){
		sum = sum + score;
		counter =counter+1;
		System.out.print("Enter grade or -1 to quit: ");
		score = myScanner.nextInt();
		}
	if(counter !=0){
	average = sum/counter;
	System.out.println("The sum of the "+counter+" numbers is "+sum);
	System.out.println("The average of the "+counter+" numbers is "+average);	
	}
	else {System.out.println("No score was entered");}
	}
}
