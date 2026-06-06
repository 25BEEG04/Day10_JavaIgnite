package JavaIgniteDay10;
import java.util.Scanner;
public class ATM_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b,w,r;
		try {
			System.out.println("Enter the account balance :");
			b=sc.nextInt();
			System.out.println("Enter the withdrawl amount :");
			w=sc.nextInt();
			if(w > b )
				System.out.println("Invalid input");
			if(w < 0 )
				System.out.println("Withdrawl amount cannot be negative");
			r = b-w;
			System.out.println("Withdraw Sucessfully \n Remaining Balance is: "+ r) ;
		}
		catch(Exception e) {
			System.out.println("Invalid input\n Please enter a valid number");
		}
		sc.close();
	}
}
