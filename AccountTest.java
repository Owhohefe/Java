import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		
		Account account1 = new Account (50.00);
		Account account2 = new Account (-7.53);
		
		System.out.println("Your account (account1) balance is "+account1.getBalance());
		System.out.println("Your account (account2) balance is "+account2.getBalance());
		
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Enter amount deposited for account1 ");
		double amountDep1 = myScanner.nextDouble();
		
		System.out.println("Enter amount deposited for account2 ");
		double amountDep2 = myScanner.nextDouble();
		
		account1.credit(amountDep1);
		account2.credit(amountDep2);
		
		System.out.println("Your account (account1) balance is "+account1.getBalance());
		System.out.println("Your account (account2) balance is "+account2.getBalance());
		
	}

}
