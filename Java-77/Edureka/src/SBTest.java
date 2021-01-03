
public class SBTest {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb+" | Size="+sb.length()+" | Capacity="+sb.capacity());
		
		sb.append("edureka limited");
		System.out.println(sb+" | Size="+sb.length()+" | Capacity="+sb.capacity());
		
		sb.append("!");
		System.out.println(sb+" | Size="+sb.length()+" | Capacity="+sb.capacity());
		
		sb.insert(0, "**");
		System.out.println(sb+" | Size="+sb.length()+" | Capacity="+sb.capacity());
		
		System.out.println(sb.reverse());
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1+" | Size="+sb1.length()+" | Capacity="+sb1.capacity());
	}
}
