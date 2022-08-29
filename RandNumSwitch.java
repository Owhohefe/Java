import java.util.Random;
public class RandNumSwitch {

	public static void main(String[] args) {
		Random myRandom = new Random();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		
		for (int i = 0; i<6000000; i++){
			int face = 1 + myRandom.nextInt(6);
			
			switch (face){
			
			case 1:
				a =a+1;
				break;
			case 2:
				b=b+1;
				break;
			case 3:
				c =c+1;
				break;
			case 4:
				d =d+1;
				break;
			case 5:
				e=e+1;
				break;
			case 6:
				f=f+1;
				break;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("The number of 1's is "+a);
		System.out.println("The number of 2's is "+b);
		System.out.println("The number of 3's is "+c);
		System.out.println("The number of 4's is "+d);
		System.out.println("The number of 5's is "+e);
		System.out.println("The number of 6's is "+f);
		
		System.out.println();
		System.out.println("The total roll of the dice is "+(a+b+c+d+e+f));
	}

}
