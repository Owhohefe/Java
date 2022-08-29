
public class Employee {
	
	private String firstName;
	private String LastName;
	
	/*
	private double WeeklySalary;
	private double BaseSalary;
	private double CommissionRate;
	private double grossSales;
	private double NumOfHoursWorked;
	private double hourlyRate;
	*/
	
	public Employee(String fName,String lName
			//, double wSalary,double bSalary, double cRate, double gSales, double hWorked, double hRate
			){
		firstName = fName;
		LastName = lName;
		
		/*
		WeeklySalary = wSalary;
		BaseSalary = bSalary;
		CommissionRate = cRate;
		grossSales = gSales;
		NumOfHoursWorked = hWorked;
		hourlyRate = hRate;
		*/
	}
	
	public void setFirstName (String fName){
		firstName = fName;
	}
	
	public String getFirstName (){
		return firstName;
	}
	public void setLastName (String lName){
		LastName = lName;
	}
	
	public String getLastName (){
		return LastName;
	}
	/*
	public void setWeeklySalary (double wSalary){
		WeeklySalary = wSalary;
	}
	
	public double getWeeklySalary (){
		return WeeklySalary;
	}
	
	public void setBaseSalary (double bSalary){
		BaseSalary = bSalary;
	}
	
	public double getBaseSalary (){
		return BaseSalary;
	}
	
	public void setCommissionRate (double cRate){
		CommissionRate = cRate;
	}
	
	public double getCommissionRate (){
		return CommissionRate;
	}
	
	public void setGrossSales (double gSales){
		grossSales = gSales;
	}
	
	public double getGrossSales (){
		return grossSales;
	}
	
	public void setNumOfHoursWorked (double hWorked){
		NumOfHoursWorked = hWorked;
	}
	
	public double getNumOfHoursWorked (){
		return NumOfHoursWorked;
	}
	
	public void setHourlyRate (double hRate){
		hourlyRate = hRate;
	}
	
	public double getHourlyRate (){
		return hourlyRate;
	}
	
	*/
	public String toString(){
		return String.format("%s: %s %s",
				"Name",getFirstName(),getLastName());
}
}

