package com.cg;

import java.util.Scanner;

public class LEAPYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Year");
		int year=sc.nextInt();
		boolean leap=false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else {
					leap=false;
				}
			}else {
				leap=true;
			}
		}else {
			 leap=false;
		}
		
		
		if(leap) {
			System.out.println(year+"  Is A Leap Year");
		}
		else {
			System.out.println(year+"  Is Not A Laep year");
		}
		
	
//		if(year%4==0) {
//			System.out.println("Leap year");
//		}
//		else if(year%400==0) {
//			System.out.println("leap year");
//		}
//		else {
//			System.out.println("non leap year");
//		}
		
//		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//	         System.out.println("Specified year is a leap year");
//	      else
//	         System.out.println("Specified year is not a leap year");
	   
	}

}
