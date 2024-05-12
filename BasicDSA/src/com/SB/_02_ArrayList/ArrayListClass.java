package com.SB._02_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.add(70);
		arr.add(80);
		
		

//		arr.set(8, 90);
		
		System.out.println(arr.set(7, 90));
		System.out.println(arr.remove(4));
		System.out.println(arr.size());
		System.out.println(arr);
		System.out.println(arr.get(1));
		
		
	}

}
