package co.edureka.except;

import java.util.Scanner;

public class FinallyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("enter first number: ");
			int x = sc.nextInt();
			
			System.out.print("enter second number: ");
			int y = sc.nextInt();
			int z = x/y;
			System.out.println("Result = " + z);
		}catch(ArithmeticException ex) {
			System.out.println("EXCEPTION: "+ex.toString());
		}
		finally {
			System.out.println("Application Designed & Developed by");
			System.out.println("Team @ edureka");
			sc.close();
		}
		
		System.out.println("--- main method ends ---");
	}
}
