package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<>();
		
		System.out.println(bank.put("Sunil",15000f)); //null
		System.out.println(bank.put("Sunil",11500.5f)); //15000.0
		System.out.println(bank.put("Rahul",25000f));
		bank.put("Jeffery",45000f);
		bank.put("Charles",15700f);
		bank.put("Chris",25000f);
		
		System.out.println(bank);

	}

}
