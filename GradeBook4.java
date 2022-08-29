
public class GradeBook4 {
	
	private String courseName;
	private int[][] grades;
	
	public GradeBook4(String name, int[][] gradesArray){
		
		courseName = name;
		grades = gradesArray;
	}
	
	public void setCourseName(String name){
		courseName = name;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void displayMessage(){
		System.out.printf("Welcome to the Grade Book for %s\n\n",getCourseName());
		
	}
	
	public void processGrades(){
		
		outputGrades();
		
		System.out.printf("\nLowest Grade is %2d\nHighest Grade is %2d\n\n", getMinimum(),getMaximum());
		
		outputBarChart();	
	}
	
	public int getMinimum(){
		
		int lowGrade = grades[0][0];
		
		for (int row = 0; row < grades.length;row++){
			for (int column=0; column<grades[row].length;column++){
				if(grades[row][column] < lowGrade){
					lowGrade = grades[row][column];
				}
			}
		}
		return lowGrade;
	}
	
	public int getMaximum(){
		int highGrade = grades[0][0];
		
		for (int row = 0; row < grades.length; row++){
			for (int column=0; column<grades[row].length;column++){
				if(grades[row][column] > highGrade){
					highGrade = grades[row][column];
				}
			}
		}
		
		return highGrade;
		
	}
	
	public double getAverage(int[]grades){
		double total = 0.0;
		
		for (int grade:grades){
			total += grade;
		}
		
		return total/grades.length;
	}
	
	
	public void outputBarChart(){
		
		System.out.println("Grade Distribution:");
		
		int[] frequency = new int[11];
		
		for (int row = 0; row < grades.length; row++){
			for (int column=0; column<grades[row].length;column++){
				++frequency[(grades[row][column]/10)];
			}
		}
		
		for (int count=0; count<frequency.length; count++){
			
			if(count==10){
				System.out.printf("%5d: ",100);
			}
			else{
				System.out.printf("%02d-%02d: ",count*10,count*10+9);
			}
			
			for (int stars = 0; stars<frequency[count];stars++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void outputGrades(){
		System.out.println("The Grades are:\n");
		
		System.out.printf("%12s%8s%8s%8s%8s\n","","Test 1","Test 2","Test 3","Average");
		
		for (int row = 0; row < grades.length; row++){
			System.out.printf("Student %2d: ",row+1);
			for (int column=0; column<grades[row].length;column++){
					System.out.printf("%8d",grades[row][column]);
			}
			System.out.printf("%8.2f\n",getAverage(grades[row]));
			//System.out.println();
		}
	}
}

