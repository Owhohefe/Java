import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {

		double [] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		String x = Arrays.toString(doubleArray);
		System.out.println(x);
		
		System.out.printf("\ndoubleArray ");
		
		for (double values:doubleArray){
			System.out.printf("%.1f ",values);
		};
	
		int [] filledIntArray = new int [10];
		Arrays.fill(filledIntArray,7);
		System.out.printf("\nfilledIntArray: ");
		
		for (int values:filledIntArray){
			System.out.printf("%d ", values);
		};
		
		int [] array = {1,2,3,4,5,6};
		int [] arraycopy = new int[array.length];
		System.arraycopy (array,2,arraycopy,0,4);
		System.out.printf("\narraycopy: ");
		for(int values: arraycopy){
			System.out.printf("%d ", values);
		};
		
		boolean b = Arrays.equals(array, arraycopy);
		System.out.printf("\narray %s arraycopy\n",
				(b? "==" : "!=" ));
		
		boolean c = Arrays.equals(array,filledIntArray);
		System.out.printf("\narray %s filledIntArray", (c? "==":"!="));
		
		int location = Arrays.binarySearch(array, 17);
		System.out.println();
		System.out.println(location);
		if (location>=0){
			System.out.printf("\n\n5 is located at index %d", location);
		}else{
			System.out.printf("\n\nThe number 5 was not found");
		};
			
	}

}
