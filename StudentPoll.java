
public class StudentPoll {

	public static void main(String[] args) {
		int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		int[] frequency = new int [6];
		
		for (int i=0; i<responses.length;i++){
			try{
				++frequency[responses[i]];		
				}
			catch (Exception e){
				System.out.println(e);
				System.out.printf("responses[%d]= %d\n",i,responses[i]);
			}
		}
		System.out.println("Response"+"\t"+"Frequency");
		
		for(int j=1; j<frequency.length;j++){
			System.out.println(j+"\t\t"+frequency[j]);
		}
	}

}
