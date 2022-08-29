
public class SumTwoDimArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
		
		int total = 0;
		for (int row = 0; row < a.length; row++)
			
		{
		for (int column = 0; column < a[ row ].length; column++)
		total += a[ row ][ column ];
		//System.out.println("The total after row "+row+" is "+total);
		} // end outer for
		
		System.out.println();
		System.out.println("The total of the elements in the 3 rows is "+total);

	}

}
