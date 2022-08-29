
public class HourlyEmployee extends Employee{
	
	private double NumOfHoursWorked;
	private double hourlyRate;
	
	public HourlyEmployee (String fName,String lName, double hWorked, double hRate)
	{
		super(fName,lName);
		NumOfHoursWorked = hWorked;
		hourlyRate = hRate;
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

public double Earnings (){
	return (getHourlyRate()*getNumOfHoursWorked())+ (((getNumOfHoursWorked()-40)<0?0:(getNumOfHoursWorked()-40))*(1.5*getHourlyRate()));
}


public String toString(){
	return String.format("%s:\n%s\n%s: %,.2f\n%s: %,.2f\n%s: %,.2f\n\n",
			"Hourly pay Employee",super.toString(),
			"Hourly rate",getHourlyRate(),
			"Hours Worked",getNumOfHoursWorked(),
			"Hourly pay", Earnings ());
	
}
}
