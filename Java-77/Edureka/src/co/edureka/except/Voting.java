package co.edureka.except;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String anyOneInLine = "Y";
		while(anyOneInLine.equalsIgnoreCase("Y")) {
		 try {	
			System.out.print("Enter Age of Voter: ");
			int age = sc.nextInt();
			if(age<18)
				throw new InvalidAgeException("age should be >= 18");
			else
				System.out.println("VOTING DONE!!");
		 }catch(Exception ex) {
			 System.out.println("ERROR: "+ex.toString());
		 }
		 System.out.print("Anyone else to Vote: ");
		 anyOneInLine = sc.next();
		}//loop
	}

}
