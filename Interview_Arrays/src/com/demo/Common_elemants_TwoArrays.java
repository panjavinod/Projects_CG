package com.demo;

public class Common_elemants_TwoArrays {

	public static void main(String[] args) {
		int[] array1=new int[] {1,2,3,4,5,7,8};
		int[] array2=new int[] {5,6,7,8,9};
		System.out.println("common elements are ");
		for(int i=0;i<array1.length;i++) {
			
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array2[j]);
				}
			}
		}
//		
		String[] array3=new String[] {"sup","manasa","vinod","teju"};
		String[] array4=new String[] {"aaaa","bbb","cccc","sup"};
		for(int i=0;i<array3.length;i++) {
			for(int j=0;j<array4.length;j++) {
				if(array3[i]==array4[j]) {
					System.out.println(array4[j]);
				}
			}
		}
	}
}
