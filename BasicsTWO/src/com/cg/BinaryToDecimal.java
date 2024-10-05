package com.cg;

import java.math.BigDecimal;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String binaryString="1010";
		int decimal=Integer.parseInt(binaryString,2);
		System.out.println(decimal);
		System.out.println(Integer.parseInt("11111", 2));
		System.out.println("-----------------octal to decimal---------------");
		String octalString="121";
		int decimall=Integer.parseInt(octalString, 8);
		System.out.println(decimall);
		System.out.println("-----------------octal to binary---------------");
		String octal="10";
     	int num=Integer.parseInt(octal, 8);
		String binary=Integer.toBinaryString(num);
		System.out.println(binary);
		System.out.println("-----------------binary to octal---------------");
		String Binary="1000";
		int Num=Integer.parseInt(Binary, 2);
		String Octal=Integer.toOctalString(Num);
		System.out.println(Octal);
		
        
		
	}

}
