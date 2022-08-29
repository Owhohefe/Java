import java.util.Scanner;

public class Analysis {
	
	public void passFail(){
		Scanner input = new Scanner(System.in);
		int x = 0;
		int grade;
		int Count_pass = 0;
		int Count_Fail = 0;
		
		while (x < 10){
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			grade = input.nextInt();
			if (grade == 1){
				Count_pass = Count_pass + 1;
			}else if (grade == 2){
				Count_Fail = Count_Fail + 1;				
			}
			
			x = x + 1;
		}
		
		System.out.printf("A total of %d students passed the exam\n\n",Count_pass);
		System.out.printf("A total of %d students failed the exam\n\n",Count_Fail);
		
		if (Count_pass > 8){
			System.out.println("Bonus to instructor!");
		}
	}

	public static void main(String[] args) {
		Analysis A = new Analysis();
		A.passFail();

	}

}
