import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		int v=0;
		do{	
		try{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter number of Students ");
		int y = myScanner.nextInt();
		
		String names []= new String[y];
		
		Scanner input = new Scanner(System.in);
		int i=0;
		do {
		System.out.println("Enter name of student");
		names[i]=input.nextLine();
		i++;
		}
		while(i<y);
		System.out.println("\n"+"The names are;");
		System.out.println("S/N\tNames");
		int count = 0;
		for (String x : names){
			System.out.print((count+1)+"\t");
			System.out.println(x);
			count++;
		}
		v=1;
		}catch(Exception e){
			System.out.println("You must enter an Integer number of students");
		}
		}while (v==0);
	}

}
