
public class WhileDemo {

	public static void main(String[] args) {
		int maxAttempts = 9;
		int start = 0;
		while (start<=maxAttempts){
			System.out.print(start+"\t");
			System.out.println("Keep trying!");
			start++;
		}
		System.out.println("Time is up!");
	}
}
