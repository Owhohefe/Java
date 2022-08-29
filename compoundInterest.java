
public class compoundInterest {

	public static void main(String[] args) {
		double interest = 0;
		double principal = 1000000;
		double rate = 0.10/4;
		double deposit=200000;
		System.out.println("S/N\tBeginPrincipal\tInterest\tDeposit\t\tEndPrincipal");
		for (int i=1; i<=20*4; i++){
			System.out.print(i+"\t");
			interest = (principal *Math.pow(1+rate,(1)))-principal;
			System.out.printf("%.2f \t",principal);
			System.out.printf("%.2f \t",interest);
			principal = principal+interest+deposit;
			System.out.printf("%.2f \t",deposit);
			System.out.printf("%.2f \n",principal);
		}
		System.out.println();
		System.out.printf("The final principal amount is %.2f",principal);
	}

}
