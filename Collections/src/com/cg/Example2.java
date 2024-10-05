package com.cg;

import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {

	public static void main(String[]args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		System.out.println("Engter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				list1.add(i);	
			}else {
				list2.add(i);
			}
			
		}
		System.out.println("Even Numbers "+list1);
		System.out.println("Odd Numbers "+list2);
		
	}
}
