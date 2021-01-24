package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		System.out.println(names.add("Sunil")); //true
		names.add("Pankaj");
		names.add("Sanjay");
		names.add("Diliph");
		
		System.out.println(names);
		
		//names.add(null); //java.lang.NullPointerException
		System.out.println(names);		
	}
}
