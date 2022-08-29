
public class Interest {

	public static void main(String[] args) {
		double amount = 0.0;
		double principal = 1000.00;
		double rate = 0.05;
		
		System.out.println("Year\tAmount");
		
		for(int i = 1; i <= 10; i++){
			amount = principal * Math.pow(1+rate,i);
			System.out.printf("%d\t%,.2f\n",i,amount);
		}

	}

}
