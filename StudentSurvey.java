import java.util.Scanner;
public class StudentSurvey {

	public static void main(String[] args) {
		
		int [] scores = new int [20];
		int [] frequency = new int [6];
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Enter 20 scores (between 1 and 5)");
	for (int i =0; i<scores.length; i++){
	int x = myScanner.nextInt();
	scores[i]=x;}
	
	for (int answer=0; answer<scores.length; answer++){
		try{
	++frequency[scores[answer]];
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.printf("scores [%d] = %d\n\n", answer, scores[answer]);
		}
	}
	
	
	System.out.printf("%s\t%s\n","Rating", "Frequency");
	
	for (int rating = 1; rating<frequency.length; rating++){
		System.out.printf("%d\t%2d\n", rating, frequency[rating]);
	}
	}
}
