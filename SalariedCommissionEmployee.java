
public class SalariedCommissionEmployee extends OnlyCommissionEmployee{
	
	private double BaseSalary;
	
	public SalariedCommissionEmployee (String fName,String lName, double bSalary, double cRate, double gSales)
	{
		super(fName,lName,cRate,gSales);
		BaseSalary = bSalary;
		
	}
	
	public void setBaseSalary (double bSalary){
		BaseSalary = bSalary;
	}
	
	public double getBaseSalary (){
		return BaseSalary;
	}
		
public double Earnings (){
	return (getBaseSalary ()+(0.1*getBaseSalary ())+(getGrossSales ()*getCommissionRate ()));
	
}

public String toString(){
	return String.format("%s:\n%s: %s %s\n%s: %,.2f\n%s: %,.2f\n%s: %,.2f\n%s: %,.2f\n%s: %,.2f\n%s: %,.2f\n\n",
			"Base Salary plus Commission Employee","Name",getFirstName(),getLastName(),
			"Commission rate",getCommissionRate(),
			"Gross Sales",getGrossSales(),
			"Commission",(getGrossSales ()*getCommissionRate ()),
			"Base Salary",getBaseSalary (),
			"10% 0f Base Salary",(0.1*getBaseSalary ()),
			"Total pay", Earnings ());
	
}
}