
public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		
		EmployeeCommission employee1 = new EmployeeCommission ("Sue", "Jones", "222-22-2222", 10000, .06);
		BasePlusCommissionEmployee employee =new BasePlusCommissionEmployee("Efe","Ekpomebe","333-444-555-666",10000.00,0.04,1000);
		EmployeeCommission employee2 = employee;
		
		System.out.printf("\n\n%s:\n%s\n","This is for the New employee",employee1);
		System.out.printf("\n\n%s:\n%s\n","This is for the New employee",employee);
		System.out.printf("\n\n%s:\n%s\n","This is for the New employee",employee2);
	}

}
