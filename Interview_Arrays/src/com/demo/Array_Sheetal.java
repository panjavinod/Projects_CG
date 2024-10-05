package com.demo;

public class Array_Sheetal {

	public static void main(String[] args) {
		int[] array=new int[]{1,3,6,9,12,14,17,22,27,30};
		int sum=33;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==sum) {
					System.out.println(sum +" Elements Are "+array[i]+" "+array[j]);
				}
			}
		}
	}

}
