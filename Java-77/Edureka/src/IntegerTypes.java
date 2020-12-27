
public class IntegerTypes {

	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		System.out.println(Byte.MIN_VALUE); //-128
		System.out.println(Byte.MAX_VALUE); //127
		
		long pop = 9858475485L;
		System.out.println("World Population = " + pop);
		
		int n = (int)12L; //type-casting
		System.out.println(n);
	}
}
