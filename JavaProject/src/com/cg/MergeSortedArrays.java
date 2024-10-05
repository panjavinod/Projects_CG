package com.cg;

import java.util.Arrays;

public class MergeSortedArrays {

	public static int[] mergeArrays(int[] array1,int[] array2) {
		int[] mergedArray=new int[(array1.length+array2.length)];
		int i=0,j=0,k=0;
		while(i<array1.length && j<array2.length) {
			if(array1[i]<=array2[j]) {             
				mergedArray[k]=array1[i];          
				i++;
			}else {
                mergedArray[k] = array2[j];
                j++;
            }
			k++;
		}
			while (i < array1.length) {
	            mergedArray[k] = array1[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements from arr2, if any
	        while (j <array2.length) {
	            mergedArray[k] = array2[j];
	            j++;
	            k++;
	        }

		
		
		return mergedArray;
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 5,3, 7,};
        int[] arr2 = {2, 4, 6, 8};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}

}
