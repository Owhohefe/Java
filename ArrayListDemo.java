import java.util.ArrayList;

import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		ArrayList <Integer> scores = new ArrayList <Integer>();
		
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Enter the scores ");
		
		String [] tokens = myScanner.nextLine().split("\\s");
		
		for (int i=0; i<tokens.length; i++){

		scores.add(Integer.parseInt(tokens[i]));	
		}
		
		for (int x=0;x<scores.size();x++){
			if (scores.get(x)==1){
				a=a+1;
			}
			else if (scores.get(x)==2){
				b=b+1;
			}
			else if (scores.get(x)==3){
				c=c+1;
			}
			else if (scores.get(x)==4){
				d=d+1;
			}
			else if (scores.get(x)==5){
				e=e+1;
			}
			
		}
		
		System.out.println(scores.size());
		System.out.println(scores.get(2));
		System.out.println(b);
		
		
	}

}
