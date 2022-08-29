
public class SumIntOdd {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		for (int i=1; i<99; i++){
			int x =i%2;
			if (x!=0){
				sum = sum+i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}
