import java.util.Scanner;

public class AbstractClassTest extends AbstractClass1 implements AbstractClass2, Interface3{
	
	public void printGrade(String courseName, int Score){
		
		Scanner Keyboard = new Scanner (System.in);
		System.out.println("Enter CourseName");
		courseName = Keyboard.nextLine();
		System.out.println("Enter Score");
		Score = Keyboard.nextInt();
		
		String grade = "No Grade";
		
		int A=70, B=60, C=50, D=40, E=35, F=34;
		
		if ("Math".equalsIgnoreCase(courseName)){
			if(Score >=70 && Score<= 100){
				grade ="A";
			} else if (Score >= 60 && Score <=69){
				grade = "B";
			} else if (Score >= C && Score <=59){
				grade = "C";
			} else if (Score >= D && Score <=49){
				grade = "D";
			} else if (Score >= E && Score <=39){
				grade = "E";
			} else if (Score <=F){
				grade = "F";
			} else {System.out.println("Invalid Score");
			}
			System.out.println(grade);
		}else{
			System.out.println("This is not my course");
		}	
	}
	
	public void leapYear(int year){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a year");
		year = input.nextInt();
		
		if ((year%4)==0){
			System.out.println(year+" is a leap year");
		}else{
			System.out.println("This is not a leap year");
		}	
	}
	
	
	public void printAge(int birthYr, int endYr){
		
		Scanner myScanner = new Scanner (System.in);
		System.out.println("What is your birth year?");
		birthYr = myScanner.nextInt();
		System.out.println("What is the current year?");
		endYr = myScanner.nextInt();
		
		int result = endYr - birthYr;
		System.out.println(result);	
	}
	
	public void printDays(){
		System.out.println("Tuesday");
		}
	
	public static void main(String[] args) {
		AbstractClass1 Obj = new AbstractClassTest();
		
		Obj.printDays();
	}

}
