package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(84,78,96,52,49,63);
		//ArrayList<Integer> al = new ArrayList<>(marks);
		
		iterateList1(marks);
		iterateList2(marks);
		iterateList3(marks);
		iterateList4(marks);
		iterateList5(marks);
		
		System.out.println("--------------------------------");
		iterateList6(marks);
	}//main	


	static void iterateList1(List<Integer> datas) {
		System.out.println("1)iteration using for loop - only for java.util.List type");
		for(int i=0;i<datas.size();i++) {
			Integer n = datas.get(i);
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterateList2(List<Integer> datas) {
		System.out.println("2)iteration using enhanced for loop");
		for(Integer n : datas) {			
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	static void iterateList3(List<Integer> datas) {
		System.out.println("3)iteration using java.util.Iterator");
		Iterator<Integer> it = datas.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
	}

	static void iterateList4(List<Integer> datas) {
		System.out.println("4)iteration using java.util.ListIterator - only for java.util.List type");
		ListIterator<Integer> it = datas.listIterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n+"   ");
		}
		System.out.println();
	}	
	
	
	static void iterateList5(List<Integer> datas) {
		System.out.println("5)iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(datas);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
		System.out.println();
	}
	
	private static void iterateList6(List<Integer> marks) {
		ArrayList<Integer> newMarks = new ArrayList<>(marks);
		System.out.println(newMarks);
		Iterator<Integer> it = newMarks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();	
			/*
			if(n==96)
			  it.remove();
			*/
			it.remove();
			System.out.print(n+"   ");			
		}
		System.out.println();
		System.out.println(newMarks);		
	}	
}
