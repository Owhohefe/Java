
public class InitArray {

	public static void main(String[] args) {
		int [] array = new int [10];
		
		for(int i = 0; i <array.length; i++)
			array[i]=2+2*i;
			
		
		System.out.println("INDEX\tVALUES");
		for (int i = 0; i<array.length;i++){
			System.out.print(i+"\t");
			System.out.println(array[i]);
		}
	}

}
