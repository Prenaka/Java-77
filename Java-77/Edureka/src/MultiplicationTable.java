import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Which Number's Multiplication Table: ");
		int num = sc.nextInt();
		
		printTable(num); //method call
		sc.close();
	}
	
	/* method to display multiplication table of a number */
	static void printTable(int n)
	{
		for(int i=1;i<=10;i++) {
			int p = n*i;
			System.out.println(n+" x "+i+" = "+p);			
		}
	}
}
