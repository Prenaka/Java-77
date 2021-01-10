package co.edureka.except;

public class Except3 {

	public static void main(String[] args) {
		String data = "625";
		System.out.println(data + 25); //62525
		/*--- parsing - process of converting a data in string form to a numeric type --*/
		int n = Integer.parseInt(data);
		System.out.println(n); //625
		System.out.println(n + 25); //650
		
		data = "A";
		n = Integer.parseInt(data); //java.lang.NumberFormatException
		System.out.println(n);
	}
}
