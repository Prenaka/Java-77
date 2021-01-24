package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) throws InterruptedException {
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		System.out.println(names.add("Sunil")); //true
		names.add("Pankaj");
		names.add("Sanjay");
		names.add("Diliph");
		
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name+" | ");
			Thread.sleep(1000);
		}
		System.out.println();
		
		names.add(null);
		System.out.println(names);
	}
}
