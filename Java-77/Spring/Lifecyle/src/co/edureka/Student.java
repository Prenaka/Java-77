package co.edureka;

public class Student {
	private String name;

	public Student() {
		System.out.println("Inside zero argument constructor");
	}

	public Student(String name) {
		System.out.println("Inside one argument constructor");
		this.name = name;
	}

	public String getName() {
		System.out.println("Inside getName() method");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName() method");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	public void myInit1() {
		System.out.println("User-defined initialization method - 1");
	}
	public void myInit2() {
		System.out.println("User-defined initialization method - 2");
	}	
	
	public void myDestructor() {
		System.out.println("User-defined destructor method..");
	}
}
