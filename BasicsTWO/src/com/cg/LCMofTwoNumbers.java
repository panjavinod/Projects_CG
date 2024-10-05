package com.cg;

public class LCMofTwoNumbers {

	public static void main(String[] args) {
		int n1=12;  //1,3,4,6,12
		int n2=9;  //1,3,9          commom 1 and 3
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		// LCM = (n1*n2)/GCD ---->   12*9/3  --->  108/3 == 36
		int lcm=(n1*n2)/gcd;
		System.out.println(lcm);
		System.out.println(n1++ +" "+ ++n1);
	}

}
