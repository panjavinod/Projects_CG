package com.cg;

import java.util.Arrays;

public class ConcatenateTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = new int[array1.length + array2.length];
        
        for(int i=0;i<array1.length;i++) {
        	result[i]=array1[i];
        }
        for(int i=0;i<array2.length;i++) {
        	result[(array1.length)+i]=array2[i];
        }
        
        System.out.println(Arrays.toString(result));
        for(int i=0;i<result.length;i++) {
        	System.out.println(result[i]);
        }

	}

}
