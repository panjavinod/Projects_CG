package com.demo;

public class Elements_In_Even_Odd_Positions {

	public static void main(String[] args) {
		                      //1,2,3,4,5,6,7,8n--->position
		int [] array=new int[] {1,2,3,4,5,6,7,8};
		                      //0,1,2,3,4,5,6,7 ---> index
		
		for(int i=1;i<array.length;i=i+2) {
			System.out.println("Even postion Elements In "+array[i]);
		}
		System.out.println("---------------------");
		for(int i=0;i<array.length;i=i+2) {
			System.out.println("Odd postion Elements In "+array[i]);
		}

	}

}
