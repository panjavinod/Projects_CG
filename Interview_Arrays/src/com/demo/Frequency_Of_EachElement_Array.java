package com.demo;

import java.util.Arrays;

public class Frequency_Of_EachElement_Array {

	public static void main(String[] args) {
		int array[]= {1,2,8,3,2,2,2,5,1};
		
//		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					array[j]=0;
				}
			}
			if(count>1 && array[i]!=0) {
				System.out.println(array[i]+" "+count);
			}
			
			count=0;
		}
	}

//	 public static void main(String[] args) {  
//	        //Initialize array  
//	        int [] array1 = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
//	        //Array fr will store frequencies of element  
//	        int [] array2 = new int [array1.length];  
//	        
//	        int visited = -1;  
//	        for(int i = 0; i < array1.length; i++){  
//	            int count = 1;  
//	            for( int j = i+1; j < array1.length; j++){  
//	                if(array1[i] == array1[j]){  
//	                    count++;  
//	                    //To avoid counting same element again  
//	                    array2[j] = visited; 
//	                }  
//	            } 
//	           
//	            if(array2[i] != visited)  
//	            	array2[i] = count;  
//	        }  
//	  
//	        //Displays the frequency of each element present in array  
//	        System.out.println("---------------------------------------");  
//	        System.out.println(" Element | Frequency");  
//	        System.out.println("---------------------------------------");  
//	        for(int i = 0; i < array2.length; i++){  
//	            if(array2[i] != visited)  
//	                System.out.println("    " + array1[i] + "    |    " + array2[i]);  
//	        }  
//	        System.out.println("----------------------------------------");  
//	    }
}
