
public class InitArray2 {

	public static void main(String[] args) {
		
		if(args.length != 3){
			System.out.println("Error: Please re-enter the entire command, including\n" + "an array size, initial value and increment.");	
		}else{
			
			int arrayLength = Integer.parseInt(args[0]);
			int [] array = new int [arrayLength];
			
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			for (int counter = 0; counter<array.length; counter++){
				array[counter]= initialValue + increment*counter;
			}
			
			System.out.printf("%5s%8s\n","Index","Value");
			
			for (int counter=0; counter<array.length;counter++){
				System.out.printf("%5s%8s\n",counter,array[counter]);
			}
		}
	}

}
