package co.edureka.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>(new MyComparator());
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		System.out.println(names.add("Sunil")); //true
		names.add("Pankaj");
		names.add("Sanjay");
		names.add("Diliph");
		
		System.out.println(names);
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {		
		int n = o1.compareTo(o2);
		if(n>0)
			return -1;
		else if(n<0)
			return 1;
		else
			return 0;
	}
	
}
