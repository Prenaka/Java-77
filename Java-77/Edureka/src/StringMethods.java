
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka";
		
		System.out.println("Length of String = "+ str.length());
		//System.out.println("Character @ index 0 = "+ str.charAt(7)); //java.lang.StringIndexOutOfBoundsException
		System.out.println("Character @ index 0 = "+ str.charAt(0));
		
		System.out.println("Index of \"e\" = "+ str.indexOf("e")); //0
		System.out.println("Index of \"e\" from location 2= "+ str.indexOf("e",2)); //4
		System.out.println("Index of \"ea\" = "+ str.indexOf("ea")); //-1
		System.out.println("Last Index of \"e\" = "+ str.lastIndexOf("e")); //4
		
		System.out.println(str.replace('e', '*'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str);
	}
}
