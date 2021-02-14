package co.edureka;

public class Test {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums nums = locator.getNums();
		
		int sum = nums.addNum(10, 23);
		System.out.println("Sum = "+ sum);
		
		float diff = nums.subNum(10.3f,  23.1f);
		System.out.println("Diff = "+ diff);
	}
}
