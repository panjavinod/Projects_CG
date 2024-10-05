package com.demo;

public class TypeConversion {

	public static void main(String[] args) {
//		int i=10;
//		byte b=(byte) i;
//		
//		float a=10.0f;     //4 
//		double d=a;
//		
//		float s=(float) d;
		
		//If you compare a long and float, 
		//the long is converted to a float because float is considered 
		//a wider type than a long.

		byte a=5;
		byte b=1;
		byte c=(byte) (a+b);
	}

}
