package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" |Size = "+names.size());
		
		/*--- to add elements to ArrayList ---*/
		names.add("Sunil");
		names.add("Sunil");
		names.add("Anil");
		names.add("Pankaj");
		names.add("Naveen");
		names.add("Charles");
		names.add("Sunil");
		names.add("Sachin");
		System.out.println(names+" |Size = "+names.size());
		
		names.add(1,"Chris");
		System.out.println(names+" |Size = "+names.size());
		//to replace an existing element
		names.set(1, "Chris Warth");
		System.out.println(names+" |Size = "+names.size());
		
		/*---searching an object in List ---*/
		System.out.println("Is \"Sunil\" in List = "+ names.contains("Sunil"));
		System.out.println("Index of \"Sunil\" from start = "+ names.indexOf("Sunil"));
		System.out.println("Index of \"Sunil\" from last = "+ names.lastIndexOf("Sunil"));
		
		/*-- get an object in an index ---*/
		System.out.println("Person in index 1 = "+ names.get(1));
		
		/*-- to remove an element from a List --*/
		System.out.println(names.remove(2)); //Sunil
		System.out.println(names.remove("Sunil"));//true
		
		System.out.println(names+" |Size = "+names.size());
	}
}
