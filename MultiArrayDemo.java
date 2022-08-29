
public class MultiArrayDemo {

	public static void main(String[] args) {
		String [][]names = new String [2][4];
			names[0][0]="Dr";
			names[0][1]="Prof";
			names[0][2]="Ass. Prof";
			names[0][3]="Mr";
			names[1][0]="Philip";
			names[1][1]="Emmanuel";
			names[1][2]="Efe";
			names[1][3]="Tudor";
			
			for(int i =0; i<1; i++){
				for (int j =0;j<names[i].length;j++){
					//System.out.printf("%s %s",names[i][j],names[1][j]);
					System.out.println(names[i][j]+" "+names[1][j]);
					//System.out.println();
				}
			}
	}

}
