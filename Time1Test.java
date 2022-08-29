import com.deitel.jhtp.ch08.Time1;

public class Time1Test {

	public static void main(String[] args) {
		Time1 time = new Time1();
		
		System.out.print( "The initial universal time is: " );
		System.out.println(time.toUniversalString());
		System.out.print( "The initial standard time is: " );
		System.out.println(time.toString());
		System.out.println();
		
		time.setTime(21, 36, 40);
		System.out.print( "Universal time after setTime is: " );
		System.out.println(time.toUniversalString());
		System.out.print( "Standard time after setTime is: " );
		System.out.println(time.toString());
		System.out.println();
		
		try{
			time.setTime(99, 99, 99);
		}catch (IllegalArgumentException e){
			System.out.printf( "Exception: %s\n\n", e.getMessage());
		}
		
		System.out.print( "Universal time after setTime is: " );
		System.out.println(time.toUniversalString());
		System.out.print( "Standard time after setTime is: " );
		System.out.println(time.toString());
		System.out.println();

	}

}
