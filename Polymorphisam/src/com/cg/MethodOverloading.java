package com.cg;

public class MethodOverloading {
//	static int add(int a,int b){return a+b;}  
//	static double add(int a,int b){return a+b;}  
    public static int Add(int a) {
		
		
		return a+3;
    }
public static double Add(double a) {
		
		
		return a+5;
    }


    public static void Add(int a,int b,String c) {
		
    	System.out.println(a+b+c);
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(MethodOverloading.add(11,11));
		System.out.println(MethodOverloading.Add(10));
		System.out.println(MethodOverloading.Add(10.3));
         Add(20,12,"Profit");
	}

}
