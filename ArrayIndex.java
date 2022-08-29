import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		int [] scores = new int [10];//{200,20,30,40,50,1000,60,70,80,90};
		
		Scanner myScanner = new Scanner (System.in);
		
		System.out.println("You are required to enter 10 scores");
		
		System.out.println("Enter first score ");
		System.out.print("1\t");
		scores [0] = myScanner.nextInt();
		
		for (int i=1; i<10; i++){
		System.out.println("Enter another score");
		System.out.print((i+1)+"\t");
		scores [i] = myScanner.nextInt();
		}
		
		printArray(scores);
	}
	
	public static void printArray(int [] array){
		int maxScore = 0;
		int totalScore = 0;
		int x;
		int y =0;
		
		for (x = 0; x<array.length; x++){
			if (array[x] > maxScore){
				maxScore =array[x];
				y = x;
			}
			totalScore += array[x];
		}
		System.out.println("The new Maximum Score is "+maxScore+" and the index is "+y);
		System.out.println();
		System.out.println("The total Score ="+totalScore);
	}
}