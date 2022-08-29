
public class Test6 {

	public static void main(String[] args) {
		int [] seconds = new int []{1,2,3};
		int [] minutes = new int []{1,2,3};
		int [] hours = new int []{1,2,3};
		
		for (int x : hours){
			for (int y : minutes){
				for(int z : seconds){
					System.out.println(x+":"+y+":"+z);
				}
			}
		}	
	}
}
