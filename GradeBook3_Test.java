
public class GradeBook3_Test {

	public static void main(String[] args) {
		
		int[] gradesArray = {87,68,94,100,83,78,85,91,76,87};
		
		GradeBook3 myGradeBook = new GradeBook3("Java Programming", gradesArray);
		
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	
	}

}
