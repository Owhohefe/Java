import java.util.Scanner;

public class Area {
	
	public void Calc_Area(){
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double x = input1.nextDouble();
		System.out.println("Enter the breadth: ");
		double y = input1.nextDouble();
		double area = x * y;
		
		System.out.println("The area is equal to "+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area Area1 = new Area();
		Area1.Calc_Area();
	}

}
