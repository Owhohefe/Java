import java.util.Scanner;


public class ValueLost {
	
	public static void AmountLost(double DaysLost, double DailyProduction, double PricePerMT){
		double Amount = DaysLost*DailyProduction*PricePerMT;
		System.out.println("The amount lost "+"(@"+(int)DailyProduction+"MT/Day and N110,000.00/MT)\nis as shown below:\n");
		System.out.println("Days Lost\tAmount Lost (N)");
		System.out.printf("%,.2f\t\t%,.2f",DaysLost,Amount);
	}

	public static void main(String[] args) {
		
		int i=0;
		do{
			try{
				Scanner myScanner = new Scanner (System.in);
				System.out.println("Enter the number of production days lost");
				double DaysLost = myScanner.nextDouble();
				System.out.println("Enter the average daily production");
				double DailyProduction = myScanner.nextDouble();
				System.out.println("Enter the price per MT");
				double PricePerMT = myScanner.nextDouble();	
				System.out.println("\n\n");
				AmountLost(DaysLost,DailyProduction,PricePerMT);
				i=1;
			}catch(Exception e){
				System.out.println("You must enter a number for Days lost, Daily production and Price per MT");	
			}
		}while (i==0);
	}
}
