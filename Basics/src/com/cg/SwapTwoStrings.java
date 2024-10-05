package com.cg;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String s1="hello";
		String s2="main";
		System.out.println("Before Swap   "+s1+" "+s2);
//        s1=s1.concat(s2);
        s1=s1+s2;
       System.out.println(s1);
       System.out.println(s1.length());
       System.out.println(s2.length());
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
//        System.out.println(s1);
        System.out.println("After Swap   "+s1+" "+s2);
	}

}
