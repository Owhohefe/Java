import java.util.ArrayList;
import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {

				ArrayList <Integer> scores = new ArrayList <Integer>();
				int [] frequency = new int [6];
				
				Scanner myScanner = new Scanner (System.in);
				System.out.println("Enter the scores ");
				
				String [] tokens = myScanner.nextLine().split("\\s");
				
				for (int i=0; i<tokens.length; i++){

				scores.add(Integer.parseInt(tokens[i]));	
				}
				
				for (int x=0;x<scores.size();x++){
					++frequency[scores.get(x)];	
				}
				
				System.out.printf("%s\t%s\n", "INDEX", "FREQUENCY");
				
				for(int a =1; a<frequency.length;a++){ 
				System.out.printf("%2d\t%2d\n",a,frequency[a]);}
				
			}

		}


