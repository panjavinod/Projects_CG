package com.cg;

public class GCD {

	public static void main(String[] args) {
		int n1=81;
		int n2=153;
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		System.out.println("Both Numbers Divided By "+gcd);
	}
	
//	public static void main(String[] args) {
//        int n1 = 366, n2 = 60;
//        int hcf = hcf(n1, n2);
//
//        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
//    }
//
//    public static int hcf(int n1, int n2)
//    {
//        if (n2 != 0)
//            return hcf(n2, n1 % n2);
//        else
//            return n1;
//    }

}
