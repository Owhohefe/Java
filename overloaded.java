
public class overloaded {
	
	public static int add(String name, int x){
		System.out.println("Method 1");
		System.out.printf("My name is %s and I am %d feet tall\n", name, x);		
		return x;	
	}
	
	public static int add(int x){
		System.out.println("Method 2");
		System.out.printf("My name is %s and I am 0 feet tall\n", x);		
		return x;
		
	} 

	public static void main(String[] args) {
		add("Efe", 6);
		add(6);

	}

}
