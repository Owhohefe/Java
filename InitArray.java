
public class InitArray {

	public static void main(String[] args) {
		int[]x = new int[10];
		
		int v = 0;
		
		for(int i = 2; i<=20; i++){
			if(i%2==0){
				x[v]=i;
				v++;
			}
		}
		
		System.out.printf("%5s%8s\n","Index","Value");
		for (int j = 0; j < x.length;j++){
			System.out.printf("%5s%8s\n",j,x[j]);
			
		}
	}

}
