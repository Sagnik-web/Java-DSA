package com.SB._06_StaticFinal;

public class StaticFinal {
	
	// We cant change the final value
	public static final String name="Sagnik Biswas";
	
	
//	public static final void myName() {
//		System.out.println(name);
//	}
	

//	default, public, protected, private
	static final String myName() {
//		System.out.println(name);
		return name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(name);
		System.out.println(myName());
//		myName();
	}

}
