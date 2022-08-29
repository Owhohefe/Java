
public class SalariedEmployee extends Employee{
	private double WeeklySalary;
	
	public SalariedEmployee (String fName,String lName, double wSalary)
	{
		super(fName,lName);
		WeeklySalary = wSalary;
	}

	public void setWeeklySalary (double wSalary){
		WeeklySalary = wSalary;
	}
	
	public double getWeeklySalary (){
		return WeeklySalary;
	}
	
public double Earnings (){
	return getWeeklySalary();
	
}

public String toString(){
	return String.format("%s:\n%s\n%s: %,.2f\n\n",
			"Fixed Weekly Salary Employee",super.toString(),
			"Fixed weekly Salary", getWeeklySalary());
	
}
}