package com.cg;

public class AverageUsingArray {
      
	public static void main(String[] args) {
		double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;
        for(double a:numArray) {
        	sum+=a;
        }
        System.out.println("------------------Average of Array------------------");
        double average=(sum/numArray.length);
        System.out.println(average);
        System.out.println("------------------Largest element of Array------------------");
//        int a[]= {1,20,40,39,65};
        double max=numArray[0];
        for(double i=0;i<numArray.length;i++) {
        	if(max<numArray[(int) i]) {
        		max=numArray[(int) i];
        	}
        }
        System.out.println("The Largest Elemenet Is "+max);
	}

}
