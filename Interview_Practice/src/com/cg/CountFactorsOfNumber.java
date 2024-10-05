package com.cg;

public class CountFactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		for(int i=1;i<=25;i++) {
			if(25%i==0) {
				count++;
			}
		}
		System.out.println("The factors of the number  "+count);
	}

}
