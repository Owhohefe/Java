
public class Test3 {
	
	String name;
	
	Test3(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Test3){
			Test3 p = (Test3)obj;
			boolean isEqual = p.name.equals(this.name);
			return isEqual;
		}else
			return false;
	}

	public static void main(String[] args) {
		Test3 B = new Test3("Paul");
		Test3 C	= new Test3("Ben");
		boolean y = B.equals (C);
		System.out.println(y);
		
		
	}

}
