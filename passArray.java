import java.util.Arrays;


public class passArray {
	
	public static void modifyArray (int [] array2){
		
		for (int i=0; i<array2.length; i++){
			array2[i]*=2;
		}
		
		System.out.print("The elements of the array are ");
		for(int a:array2)
			System.out.printf("%d ", a);
		System.out.println();
	}
	
	public static void modifyElement (int element){
		
		element *=2;
		System.out.printf("The new value of element is %d", element);
	}
	
	
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(array));
		
		modifyArray(array);
		
		modifyElement(array[3]);
		
		
		
	}

}
