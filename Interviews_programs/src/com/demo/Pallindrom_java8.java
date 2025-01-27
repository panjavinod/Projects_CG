package com.demo;

import java.util.stream.IntStream;

public class Pallindrom_java8 {

	public static void main(String[] args) {
		String input="madAm";
		
		boolean isPrime=checkPrime(input);
		 if(isPrime) {
			 System.out.println("pallindorm");
		 }else {
			 System.out.println("Not Pallindrom");
		 }
		

	}

	private static boolean checkPrime(String input) {
		
		String normalizedInput = input.toLowerCase(); 
		
return IntStream.range(0, input.length()/2).allMatch(i->normalizedInput.charAt(i) == normalizedInput
				                                        .charAt(normalizedInput.length() - 1 - i));
	}

}
