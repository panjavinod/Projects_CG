package com.cg;

public class UncheckedExceptionh {

	public static void main(String[] args) {
		
		                       //ArithmeticException
		
//		try {
//           int a=100/0;
//           
//		}catch(ArithmeticException e){
//                 System.out.println(e);
//		   }
		
		                       //NullPointerException
//		String s=null;
//	     try {
//		char a=s.charAt(0);
//	     }catch(NullPointerException e) {
//		System.out.println(e);
//	     }
		
		                        //NumberFormatException
//		String s="java";
//		try {
//		int a=Integer.parseInt(s);
//		}catch(NumberFormatException e) {
//		System.out.println(e);
//		}
		
		                        //ArrayIndexOutOfBoundsException
//		int[] a=new int[5];
//		try {
//		a[10]=50;
//		}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println(e);
//		}
		
//		                        //StringIndexOutOfBoundsException
		String s="java";
		try {
			char a=s.charAt(6);
		}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e);
		}
       }

}
