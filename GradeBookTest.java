
public class GradeBookTest {

	public static void main(String[] args) {
		gradeCounter myGradeBook = new gradeCounter("CS101 Introduction to Java Programming");
		
		myGradeBook.displayMessage();
		myGradeBook.determineClassAverage();
	}
}
