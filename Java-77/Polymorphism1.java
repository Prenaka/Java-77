class A{
	private A(){
		System.out.println("A constructor");
	}
	A(int n){}
	void display(){
		System.out.println("A");
	}
}

class B extends A{
	B(){	
		super(10);
		System.out.println("B constructor");
	}
	@Override
	void display(){
		System.out.println("B");
	}
}

class Polymorphism1 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		A obj = new B();
		obj.display();
	}
}
