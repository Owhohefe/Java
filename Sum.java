
public class Sum {

	public static void main(String[] args) {
		int total = 0;
		
		for (int i = 2; i <= 20; i++){
			if (i % 2 == 0){
				total += i;
			}
		}
		
		System.out.printf("Sum is = %d", total);

	}

}
