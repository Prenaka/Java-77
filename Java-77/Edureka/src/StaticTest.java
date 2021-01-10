
public class StaticTest {
	static {
		System.out.println("Static Block - 1");
		System.out.println("Application designed & developed by");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
	}
	static {
		System.out.println("static block - 2");
		System.out.println("team@edureka");
	}
}
