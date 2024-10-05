package com.cg;

public class Second_LargestNumber_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {14, 46, 47, 94, 52, 86, 36, 89 };
		int max=0;
		int secondMax=0;
		int thirdMax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}
			else if(arr[i]>thirdMax) {
				thirdMax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
		System.out.println(thirdMax);
	}

}
