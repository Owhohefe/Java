
public class ArrayMethod {
	
	public static int [] scores = {10,20,30,40,50,100,60,70,80,90};
	public static int maxScore = 0;
	public static int totalScore = 0;
	
	public static void main(String[] args) {
		
		maxFigure(scores);
		totalFigures(scores);
	}
	
	public static void maxFigure(int  array []){
	 for (int i=0; i<array.length;i++){
			if (array[i]> maxScore){
				maxScore = array[i];
			} 	
		}
	 System.out.println(maxScore);
	}
  
	public static void totalFigures(int  array []){
	 		 for (int i=0; i<array.length;i++){
			 totalScore+=array[i];
				} 
		 System.out.println(totalScore);
			}

}