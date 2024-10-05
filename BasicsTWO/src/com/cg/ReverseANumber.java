package com.cg;

public class ReverseANumber {

	public static void main(String[] args) {
	int number=235;
	int reversed = 0;
	while(number>0) {
		int digit=number%10;                     // 235%10 --- 5 , 3  ,2
		reversed=reversed*10+digit;              // 0*10+5--5 => 5*10+3--53 => 53*10+2 =>532
		number/=10;         // 23 ,2
	}
	System.out.println(reversed);
  }

}
