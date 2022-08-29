import java.util.Arrays;


public class TwoDimArray {
	
	public static void outputArray (int [][] array){
		
		System.out.println("Using deepToString");
		String x =Arrays.deepToString(array);
		System.out.println(x);
		System.out.println();
		
		System.out.println("Using for Loop");
		
		for (int row=0; row<array.length; row++){
			for(int col=0; col<array[row].length; col++)
				System.out.printf("%d ", array[row][col]);
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
	int [][] array1 = {{1,2,3},{4,5,6}};	
	int [][] array2 = {{1,2},{3},{4,5,6}};
	
	System.out.println("Elements of Array1");	
	outputArray(array1);
	System.out.println();
	System.out.println("Elements of Array2");	
	outputArray(array2);
	}

}
