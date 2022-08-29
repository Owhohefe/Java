
public class BasePlusCommissionEmployee extends EmployeeCommission {
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String fn, String ln, String ssn, double gs, double cr, double bs){
		super(fn, ln, ssn, gs, cr);
		
		baseSalary = bs;	
	}
	
	public void setBaseSalary(double bs){
		if(bs>=0.0)
		baseSalary = bs;
		else 
			throw new IllegalArgumentException("Base salary must be greater than or equal to zero");
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
@Override
public double earnings(){
	return (baseSalary+super.earnings());
}

@Override
public String toString(){
return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f\n%s: %.2f\n",
		"Employee ",getFirstName(),getLastName(),
		"Social Security Number",getSSN(),
		"Gross Sales",getGrossSales(),
		"Commission Rate",getCommissionRate(),
		"Base Salary",getBaseSalary(),
		"Earnings",(baseSalary+(getGrossSales ()*getCommissionRate ())));	
}
}
