
public class TestEmployee {

	public static void main(String[] args) {
		
		
		Employee [] theList = new Employee [4];
		
		SalariedEmployee employee1 = new SalariedEmployee("Efe", "Ekpomebe", 19000);
		HourlyEmployee employee2 = new HourlyEmployee("John", "Doe",10, 100);
		OnlyCommissionEmployee employee3 = new OnlyCommissionEmployee("Ken", "Omokhiomon", 0.05, 100000);
		SalariedCommissionEmployee employee4 = new SalariedCommissionEmployee("Ibiam", "Samson",12000, 0.05, 150000);
		
		theList[0] = employee1;
		theList[1] = employee2;
		theList[2] = employee3;
		theList[3] = employee4;
		
		for (Employee x:theList){
			System.out.println(x);
			
		}
		
		
		
		/*
		Employee employee1 = new SalariedEmployee("Efe", "Ekpomebe", 19000);
		Employee employee2 = new HourlyEmployee("John", "Doe",10, 100);
		Employee employee3 = new OnlyCommissionEmployee("Ken", "Omokhiomon", 0.05, 100000);
		Employee employee4 = new SalariedCommissionEmployee("Ibiam", "Samson",12000, 0.05, 150000);
		
		//System.out.println("Fixed Weekly Salary Employee");
		System.out.println(employee1);
		
		//System.out.println("Hourly pay Employee");
		System.out.println(employee2);
		
		//System.out.println("Commission Only Employee");
		System.out.println(employee3);
		
		//System.out.println("Base Salary plus Commission Employee");
		System.out.println(employee4);
		*/
	}

}
