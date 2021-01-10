package co.edureka.pack2;

import co.edureka.pack1.Nums;

//import co.edureka.pack1.Nums;

public class PackTest {

	public static void main(String[] args) {
		//co.edureka.pack1.Nums obj = new co.edureka.pack1.Nums(); //providing fully qualified package name
		Nums obj = new Nums();
		
		System.out.println("Sum = "+ obj.addNum(10, 20));
		System.out.println("Diff = "+ obj.subNum(20f, 10f));
	}
}