import java.util.Scanner;


public class OCAebookTest {
	
	public static int daysOffWork (int...days){
		int daysoff = 0;
		for(int i=0; i<days.length; i++){
			daysoff += days[i];
		}
		return daysoff;
	}

	public static void main(String[] args) {
		
		int [] z = new int [100];
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Enter the values");
		String [] y = myScanner.nextLine().split("\\s");
		for (int i=0; i<y.length;i++){
			z[i] = Integer.parseInt(y[i]);
		}

		int x = daysOffWork(z);
		System.out.println(x);
		
		
	}

}
