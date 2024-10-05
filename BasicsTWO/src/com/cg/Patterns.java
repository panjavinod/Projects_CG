package com.cg;

public class Patterns {
// -----------------System.out.println("Program to print half pyramid a using *");---------------
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	public static void main(String[] args) {
//	  for(int i=0;i<=5;i++) {
//		  for(int j=0;j<i;j++) {
//			  System.out.print("*"+" ");
//		  }
//		  System.out.println("");
//	  }
//
//	}
	
//	---------------System.out.println("Program to print half pyramid a using numbers");-----------
//	0 
//	0 1 
//	0 1 2 
//	0 1 2 3 
//	0 1 2 3 4 
//	public static void main(String[] args) {
//		  for(int i=0;i<=5;i++) {
//			  for(int j=0;j<i;j++) {
//				  System.out.print(j+" ");
//			  }
//			  System.out.println("");
//		  }
//
//		}
	
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
//	---------------System.out.println("Inverted half pyramid using *");------------------------------
//	public static void main(String[]args) {
//		for(int i=5;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println("");
//		}
//	}
//	---------------System.out.println("Inverted half pyramid using Numbers");------------------------------
	public static void main(String[]args) {
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
