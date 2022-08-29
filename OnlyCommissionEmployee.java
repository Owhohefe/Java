
public class OnlyCommissionEmployee extends Employee{
	
	private double CommissionRate;
	private double grossSales;
	
	public OnlyCommissionEmployee (String fName,String lName, double cRate, double gSales)
	{
		super(fName,lName);	
		
		CommissionRate = cRate;
		grossSales = gSales;
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
	
public double Earnings (){
	return getGrossSales ()*getCommissionRate ();
}

public String toString(){
	return String.format("%s:\n%s\n%s: %,.2f\n%s: %,.2f\n%s: %,.2f\n\n",
			"Commission Only Employee",super.toString(), 
			"Commission rate",getCommissionRate(),
			"Gross Sales",getGrossSales(),
			"Commission", Earnings ());
	
}
}