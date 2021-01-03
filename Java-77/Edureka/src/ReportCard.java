/*
 Application to generate a Report Card
*/
import java.util.*;

class ReportCard 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("enter student name: ");
		String name = sc.nextLine();

		System.out.print("enter the number of subjects: ");
		int no = sc.nextInt();
		
		/*create an array to stor marks*/
		int[] marks = new int[no];

		//method call for marksEntry
		marksEntry(marks);
		//System.out.println(Arrays.toString(marks));
		
		
		//method call to generate the report card
		printReportCard(name,marks,no);
	}

	/*method for marks entry*/
	static void marksEntry(int[] marks)
	{
		for(int i=0;i<marks.length;i++){
			System.out.print("enter mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
	}

	/*method for printing report card*/
	static void printReportCard(String name, int[] marks, int no)
	{
       System.out.println("--------------------------------------------");
	   System.out.println("\tREPORT CARD");
	   System.out.println("NAME: "+ name);
	   System.out.println("--------------------------------------------");
	   System.out.println(" SUBJECT\t MARKS");
	   System.out.println("--------------------------------------------");

	   int total = 0;
	   for(int i=0;i<no;i++){
		   total += marks[i];
		   System.out.println("Subject-"+(i+1)+"\t  "+marks[i]);
	   }

	   System.out.println("--------------------------------------------");
	   float avg = ((float)total)/no;
	   //System.out.println("TOTAL: "+total+"   AVERAGE: "+avg);
	   System.out.printf("TOTAL: %d    AVERAGE:%.2f \n", total, avg);
	   System.out.println("--------------------------------------------");
	}
}
