import java.util.Scanner;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		
		CommissionEmployee employee = new CommissionEmployee();
		
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Enter your first name ");
		String fn = myScanner.nextLine();
		System.out.println("Enter your last name ");
		String ln = myScanner.nextLine();
		System.out.println("Enter your Social Security Number ");
		String ssn = myScanner.nextLine();
		System.out.println("Enter the Gross Sales ");
		double gs = myScanner.nextDouble();
		System.out.println("Enter the Commission Rate ");
		double cr = myScanner.nextDouble();
		
		employee.setFirstName(fn);
		employee.setLastName(ln);
		employee.setSSN(ssn);
		employee.setGrossSales(gs);
		employee.setCommissionRate(cr);
		
		System.out.printf("%s: \n\n%s", "The new employee is", employee);
	}
}
