package com.cg;

public class MissingNumberFinder {
   public static int findMissingNumber(int[] nums) {
	   int n=nums.length+1;
	   int totalsum=n*(n+1)/2;
	   int actualsum=0;
	   for(int num:nums) {
		   actualsum+=num;
	   }
	   return totalsum-actualsum;
   }
	public static void main(String[] args) {
		int[] nums = {1,2,3, 4, 5, 6,7,9};
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing Number is "+missingNumber);
	}

}
