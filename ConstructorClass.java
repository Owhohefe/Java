
public class ConstructorClass {
	String name;
	int age;
	
	ConstructorClass(){
		this(30, "Efe");	
	}
	
	ConstructorClass(int age, String name){
		this.age = age;
		this.name = name;
		System.out.println("His name is "+name+" and he is "+age+" years old");
	}
}
