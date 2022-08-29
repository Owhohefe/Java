

public class ObjectFieldClass {
	String name;
	int age;
	
	ObjectFieldClass(){
		age = 22;
	}
	
	
	
	public void setName(String val){
		name = val;
	}
	
	public void printObj(){
		System.out.println("name is: "+name+" age is: "+age);		
	}
	
}
