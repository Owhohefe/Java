
public class Test7 {
	static String name = "Efe";
	String company;

	public static void main(String[] args){ 
		Test7 T = new Test7();
		T.name = "Ben";
		System.out.println(T.name);
		
		Test7 M = new Test7();
		System.out.println(M.name);

	}

}