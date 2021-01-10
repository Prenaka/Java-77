import java.util.Scanner;

public class AbsTest {

	public static void main(String[] args) {
		Shape shape = null;
		//shape = new Shape(); //error - cannot instantiate the type Shape
		Scanner sc = new Scanner(System.in);
		System.out.print("Which shape you need [1-Rect | 2-Circle]: ");
		int opt = sc.nextInt();
		
		if(opt == 1)
			shape = new Rectangle("Red",10,4);
		else if(opt == 2)
			shape = new Circle("Blue",2.5f);
		else {
			System.out.println("Invalid Shape... Try Again");
			return;
		}
		
		System.out.println(shape.getColor());
		shape.setColor("Black");
		shape.area();
		
		System.out.println("Shape = "+ (shape instanceof Shape));
		System.out.println("Rectangle = "+ (shape instanceof Rectangle));
		System.out.println("Circle = "+ (shape instanceof Circle));
	}

}
