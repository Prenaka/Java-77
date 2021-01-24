package co.edureka;

public class WrapperTest {

	public static void main(String[] args) {		
		Integer i1 = new Integer(25);
		Integer i2 = new Integer("25");
		Integer i3 = Integer.valueOf(25);
		Integer i4 = Integer.valueOf("25");
		System.out.println(i1+" | "+i2+" | "+i3+" | "+i4);
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1+" | "+c2);
		
		byte b = i1.byteValue();
		short s = i1.shortValue();
		int i = i1.intValue();
		long l = i1.longValue();
		float f = i1.floatValue();
		double d = i1.doubleValue();
		System.out.println(b+" | "+s+" | "+i+" | "+l +" | "+f+" | "+d);
		
		System.out.println("--------------------------------");
		int n1 = 26;
		Integer n2 = n1;//boxing
		int n3 = n2; //unboxing
		System.out.println(n1+" | "+n2+" | "+n3);
		System.out.println("Type of n2 = "+ n2.getClass().getName());
	}
}
