import java.util.ArrayList;
import java.util.Iterator;


public class Test5 {
	
	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<>();
		
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("five");
		
		System.out.println(v.get(2));
		
		System.out.println(v.contains(new String("one")));
		System.out.println(v.indexOf("two"));
		v.remove(2);
		
		
		Iterator it = v.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		
		v.clear();
		System.out.println(v);
	}
}
