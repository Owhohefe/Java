import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1 = new Account(50);
		Account acc2 = new Account(-23);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		
		acc1.credit(25);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		
		acc2.credit(25);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());

	}

}
