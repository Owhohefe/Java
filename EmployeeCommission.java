
public class EmployeeCommission {
	private String firstName;
	private String lastName;
	private String SocialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	public EmployeeCommission(String fn, String ln, String SSN, double gs, double cr){
		firstName = fn;
		lastName = ln;
		SocialSecurityNumber =SSN;
		grossSales = gs;
		commissionRate = cr;
		
	}


	public void setFirstName(String fn){
		firstName=fn;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName (String ln){
		lastName = ln;
	}

	public String getLastName(){
		return lastName;
	}

	public void setSSN (String ssn){
		SocialSecurityNumber = ssn;
	}

	public String getSSN(){
		return SocialSecurityNumber;
	}

	public void setGrossSales (double gs){
		if(gs>=0)
			grossSales=gs;
	}

	public double getGrossSales (){
		return grossSales;
	}

	public void setCommissionRate (double cr){
	 	if(cr>0 && cr<1) 
	 		commissionRate = cr;
	 	else 
	 		throw new IllegalArgumentException ("Commission rate must be > 0.0 and < 1.0");
	}

	public double getCommissionRate (){
		return commissionRate;
	}

	public double earnings (){
		return grossSales*commissionRate;
	}

	public String toString(){
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n",
				"commission Employee",firstName,lastName,
				"Social Security Number",SocialSecurityNumber,
				"Gross Sales",grossSales,"Commission Rate",commissionRate
		 );
	}


}

