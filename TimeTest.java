
public class TimeTest {

	public static void main(String[] args) {
		
		Time timeObject = new Time();
		
		System.out.println("Print initial universal time ");
		System.out.println(timeObject.toUniversalString());
		System.out.println("Print initial standard time ");
		System.out.println(timeObject.toString());
		
		timeObject.setTime(21, 40, 40);
		
		System.out.println("Print new universal time ");
		System.out.println(timeObject.toUniversalString());
		System.out.println("Print new standard time ");
		System.out.println(timeObject.toString());
		
		try{
			timeObject.setTime(99, 99, 99);
		}
		catch(IllegalArgumentException e){
			System.out.printf("Exception:%s\n\n",e.getMessage());
			
			System.out.println("Print new universal time ");
			System.out.println(timeObject.toUniversalString());
			System.out.println("Print new standard time ");
			System.out.println(timeObject.toString());
			
		}
	}

}
