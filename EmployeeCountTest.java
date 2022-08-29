
public class EmployeeCountTest {

	public static void main(String[] args) {
		
		System.out.printf("Employees before instantiation: %d\n",EmployeeCount.getCount());
		
		EmployeeCount e1 = new EmployeeCount("Susan", "Baker");
		EmployeeCount e2 = new EmployeeCount("Bob", "Blue");
		
		System.out.println("\nEmployees after instantiation: ");
		System.out.printf( "via e1.getCount(): %d\n",e1.getCount());
		System.out.printf( "via e2.getCount(): %d\n",e2.getCount());
		System.out.printf( "via Employee.getCount(): %d\n",EmployeeCount.getCount());
		
		System.out.printf( "\nEmployee 1: %s %s\nEmployee 2: %s %s\n",e1.getFirstName(), e1.getLastName(),e2.getFirstName(), e2.getLastName());

	}

}
