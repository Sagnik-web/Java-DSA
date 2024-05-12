package com.SB._05_HashMap;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1,"Java");
		hm.put(2,"C");
		hm.put(3,"C++");
		hm.put(4,"Javascript");
		hm.put(5,"C#");
		
		System.out.println(hm.get(2));
		System.out.println(hm.size());
		System.out.println(hm.remove(3));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}

}
