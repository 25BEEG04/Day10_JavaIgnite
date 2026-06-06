package JavaIgniteDay10;
import java.util.Scanner;
public class Student_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,i,index;
		System.out.println("Enter the number of students :");
		num=sc.nextInt();
		int []marks= new int [num];
		System.out.println("Enter the marks:");
		for(i=0;i<num;i++) {
			marks[i]=sc.nextInt();
		}
		
		try {
			System.out.println("Enter the index");
			index = sc.nextInt();
			
			 System.out.println("Marks = " + marks[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index !!");
		}
		catch(Exception err) {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
