package com.demo;

public class Even_Odd_Array {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Even Elements in Array "+a[i]);
			}else {
				System.out.println("Odd Elements in Array "+a[i]);
			}
		}

	}

}
