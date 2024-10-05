package com.cg;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number =371;
		int originalnumber, remainder, result = 0;
		originalnumber=number;
		while(originalnumber!=0) {
			remainder=originalnumber%10;
			result+=Math.pow(remainder, 3);
			originalnumber/=10;
		}
		if(result == number) {
			System.out.println("its a amstrong number");
		}
		else {
			System.out.println("its not a amstrong number");
		}
		
	}

}
