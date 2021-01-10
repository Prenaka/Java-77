
public class Rectangle extends Shape {
	int length, breadth;
	
	Rectangle(String color, int length, int breadth){
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	void area() {		
		System.out.println("Area of Circle = "+ (this.length * this.breadth));
	}
}
