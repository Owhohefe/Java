
public class DoWhileDemo {

	public static void main(String[] args) {
		int maxAttempts = 9;
		int start = 0;
		do {
			System.out.print((start+1)+"\t");
			System.out.println("Keep trying!");
			start++;}
			while (start<maxAttempts);

		System.out.println("Time is up!");
	}
 
}
