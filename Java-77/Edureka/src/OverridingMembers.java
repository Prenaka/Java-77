class A1{
	int a=10,b=20;
	void display() {
		System.out.println("Inside class A: "+ a+" | "+b);		
	}
}

class B1 extends A1{
	int a=11, b=22;
	@Override //annotation - metadata
	void display() {
		System.out.println("Inside class A: "+this.a+" | "+b+" | "+super.a+" | "+super.b);
		super.display();
	}
}

public class OverridingMembers {
	public static void main(String[] args) {
		B1 obj = new B1();
		System.out.println(obj.a+" | "+obj.b);
		obj.display();
	}
}
