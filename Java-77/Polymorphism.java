class A{
	void display(){
		System.out.println("A");
	}
}

class B extends A{
	@Override
	void display(){
		System.out.println("B");
	}
}

class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		A obj = new B();
		obj.display();
	}
}
