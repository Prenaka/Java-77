
public class Circle extends Shape {
	float radius;
	Circle(String color, float radius){
		super(color);
		this.radius = radius;
	}
	@Override
	void area() {
		System.out.println("Area of Circle = "+ (Math.PI*Math.pow(radius, 2)));
	}

}
