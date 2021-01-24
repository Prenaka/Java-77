package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		System.out.println(names.add("Sunil")); //true
		names.add("Pankaj");
		names.add("Sanjay");
		names.add("Diliph");
		
		System.out.println(names);
	}

}
