

public class ObjectFieldClassTest {

	public static void main(String[] args) {
		ObjectFieldClass p1 = new ObjectFieldClass ();
		ObjectFieldClass p2 = new ObjectFieldClass ();
		
		p1.name = "Harry";
		p2.setName("Ben");
		
		p1.printObj();
		p2.printObj();
		
	}

}
