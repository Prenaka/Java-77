
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {92,88,76,93,80,71};
		System.out.println("No of Subjects = " + marks.length);
		
		//array iteration using a normal for loop
		for(int i=0;i<marks.length;i++) {
			System.out.println("Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		System.out.print("Marks Obtained   :   ");
		//array iteration using enhanced for loop
		for(int x : marks) {
			System.out.print(x+" | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
