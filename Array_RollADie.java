import java.util.Random;

public class Array_RollADie {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		
		int[]frequency = new int[7];
		
		for (int i=0; i<6000000; i++){
			
			++frequency[1 + randomNumbers.nextInt(6)];
			
			/*int x = 1 + randomNumbers.nextInt(6);
			switch(x){
			case 1:
				++frequency[1];
				break;
			case 2:
				++frequency[2];
				break;
			case 3:
				++frequency[3];
				break;
			case 4:
				++frequency[4];
				break;
			case 5:
				++frequency[5];
				break;
			default:
				++frequency[6];
				break;
			}		*/
		}
		
		System.out.printf("%4s%10s\n","Face","Frequency");
		
		for(int Face = 1; Face < frequency.length; Face++){
			System.out.printf("%4d%10d\n", Face, frequency[Face]);			
		}
	}
}
