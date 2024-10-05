package com.cg;

public class LongString {

//	public static void main(String[] args) {
//		 String[] input = {"3", "30", "34", "5", "9"};
//		 for(int i=input.length-1;i>0;i--) {
//			 String str="";
//			 if((input[i]+input[i-1]).compareTo(input[i-1]+input[i])>0){
//				 str+=input[i];
//			 }else {
//				 str+=input[i-1]+input[i];
//			 }
//			
//			 System.out.print(str);
//		 }
//
//	}
	
	public static void main(String[] args) {
	    String[] input = {"3", "30", "34", "5", "9"};
	    for (int i = 0; i < input.length - 1; i++) {
	        for (int j = 0; j < input.length - i - 1; j++) {
	            if ((input[j] + input[j + 1]).compareTo(input[j + 1] + input[j]) < 0) {
	                String temp = input[j];
	                input[j] = input[j + 1];
	                input[j + 1] = temp;
	            }
	        }
	    }

	    // Concatenate the sorted array elements to get the final output
	    StringBuilder output = new StringBuilder();
	    for (String s : input) {
	        output.append(s);
	    }

	    System.out.println(output.toString());
	}


}
