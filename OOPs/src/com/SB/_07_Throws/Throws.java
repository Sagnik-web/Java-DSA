package com.SB._07_Throws;

public class Throws {
	
 	public static void Arithmatic() throws ArithmeticException {
		int a = 10;
		int b = 0;
		
		
		int c = a/b;
		System.out.println(c);
		
	}

	public static void main(String args[]) throws ArithmeticException {
	
//		try {
//			Arithmatic();
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		
		System.out.println("Sagnik Biswas");
		Arithmatic();
		System.out.println("SB");
	}
}
