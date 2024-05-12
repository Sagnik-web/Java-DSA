package com.SB._06_HashSet;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hm = new HashSet<>();
		hm.add("C");
		hm.add("C++");
		hm.add("C#");
		hm.add("Java");
		hm.add("Javascript");
		
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.remove(3));
		
	}

}
