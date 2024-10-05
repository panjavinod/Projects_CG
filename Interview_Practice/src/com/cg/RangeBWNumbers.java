package com.cg;

public class RangeBWNumbers {

	public static void main(String[] args) {
		int count=0;
		for(int i=5;i<20;i++) {
			if(i%3==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
