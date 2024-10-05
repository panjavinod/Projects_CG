package com.demo;

import java.util.Arrays;

public class Duplicate_Array_Elements {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,2,3,1};  
	        System.out.println("Duplicate elements in given array: ");   
//	        Arrays.sort(arr);
	        
	        for(int i = 0; i < arr.length; i++) { 
	        int count =1;
	            for( int j = i+1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  	{
	                	count++;
	                	arr[j]=0;
	                }
	                
	            }  
	           
	            if(count>1 && arr[i]!=0) {
	            	System.out.println(arr[i]+" "+count);
	            }
	            
	            
	        }  
	        
	        //Write a Java program to find duplicate values in an array of string values.
	        String[] str = new String [] {"java","c","java","phython","c","html","css","java"};  
	       
	        for(int i=0;i<str.length;i++) {
	        	int count=1;
	        	for(int j=i+1;j<str.length;j++) {
	        		if(str[i] != null && str[i].equals(str[j])) {
	        			count++;
	        			str[j]=null;
	        		}
	        	}
	        	if(count>1 && str[i]!=null) {
	        		System.out.println(str[i]+" "+count);
	        	}
	        }
	        
	       
	}
	
	
	
//	public static void main(String[] args) {
//		   
//	      //Declare and initialize the array elements
//	      int[] array = { 2, 3, 5, 4, 3, 1, 3, 2, 1, };
//	      
//	      //sorting an array
//	      Arrays.sort(array);
//	      
//	      //declaring the variables
//	      int i,j,frequency;
//	      System.out.println("These elements are repeated along with its frequency-");
//	      
//	      //loop for logic implementation
//	      for(i=0; i<array.length; i++){
//	          frequency = 1;
//	          for(j=i+1; j<array.length; j++){
//	             if(array[j] == array[i]){
//	                frequency++;
//	             } else {
//	                break;
//	             }
//	          }
//	     
//	          i=j-1;
//	          
//	          if(frequency > 1){
//	          
//	             //printing the output
//	             System.out.println(array[i] + " --> " + frequency);
//	          }
//	       }
//	    }
//
}
