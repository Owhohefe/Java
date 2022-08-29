import java.util.Random;

public class Craps {
	
	public static int rollDice(){
		Random randomNumber = new Random();
		
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
		int sumofdice = die1 + die2;
		
		System.out.printf("You rolled %d + %d = %d\n",die1,die2,sumofdice);
		
		return sumofdice;
	}

	public static void main(String[] args) {
		int sum = rollDice();
		
		if (sum == 7 || sum == 11){
			System.out.printf("You rolled %d on first throw. You win!!\n", sum);
		}
		else if(sum == 2 || sum == 3 || sum == 12 ){
			System.out.printf("You rolled %d on first throw. You lose!!\n", sum);
		}
		else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
			int point = sum;
			int sum1 = 0;
			System.out.printf("You rolled %d on first throw. Point is %d.\n", sum, point);
			System.out.println();
			
			while (sum1 != point){
				sum1 = rollDice();
				
				if (sum1 == 7){
					System.out.printf("You rolled 7 after rolling %d as point.You lose!!\n", point);
					break;
				}
				else if (sum1 == point){
					System.out.printf("You rolled %d after rolling %d as point. You win!!",sum1,point);
				}
				else{
					System.out.println("Continue");
				}	
			}	
		}
	}

}
