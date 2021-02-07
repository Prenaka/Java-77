package co.edureka;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Sunil");
		
		Student st2 = new Student("Joseph");
		
		System.out.println(st1);
		System.out.println(st2);
	}
}
