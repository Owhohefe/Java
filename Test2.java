import java.util.Arrays;


public class Test2 {
	
	public static void array1(){
		String [] array2 = new String [5];
		for (int i=0; i<array2.length;i++){
			array2[i]="Hello"+" "+i;
		}
		for(String x:array2){
			System.out.println(x);
		}
		String y = Arrays.toString(array2);
		System.out.println(y);
	}

	public static void main(String[] args) {
		int sum = 0;
		char [] x = new char []{'p','a','u','l'};
		char [] y = new char []{'p','u','u','l'};
		
		for (int i = 0; i<x.length;i++){
		
			if (x[i] == y[i]){
			sum = sum+1;
			}	
		}
		
		System.out.println(sum);
		array1();
		
		int []a = new int[]{1,2,3,4};
		int []b = a.clone();
		
		String z = Arrays.toString(b);
		System.out.println(z);

	}
	
}
