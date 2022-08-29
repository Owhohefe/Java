import java.util.ArrayList;
import java.util.Scanner;

public class OCAebook {

	public static int daysOffWork (ArrayList <Integer> days){
		int daysoff = 0;
		for(int i=0; i<days.size(); i++){
			daysoff += days.get(i);
		}
		return daysoff;
	}

	public static void main(String[] args) {
		ArrayList <Integer> z = new ArrayList <Integer>();
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Enter the values");
		String [] y = myScanner.nextLine().split("\\s");
		for (int i=0; i<y.length;i++){
			z.add(Integer.parseInt(y[i]));
		}
	
		int x = daysOffWork(z);
		System.out.println(x);
		
		
	}
		
	}
	

