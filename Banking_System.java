package JavaIgniteDay10;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Banking_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b,w;
		try {
			System.out.println("Enter the balance :");
			b=sc.nextInt();
			System.out.println("Enter the withdrawl amount :");
			w=sc.nextInt();
			
			if(w > b ) {
				throw new Exception("In sufficent balance");
			}
			System.out.println("Withdrawl sucess !");
			System.out.println("Remaining balance :"+ (b-w));
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
		catch(Exception e) {
			System.out.println("In sufficent balance");
		}
		sc.close();
	}
}

