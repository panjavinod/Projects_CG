package com.cg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Second_HighestSalary {
	public static int secondSalary(int[] arr) {
		
		return arr[arr.length-2];
		
	}

	public static void main(String[] args) {
		int[] array=new int[] {94000,25000,65000,34000,56000,45000};
		Arrays.sort(array);
		int sal=Second_HighestSalary.secondSalary(array);
		System.out.println(sal);
		System.out.println(Arrays.toString(array));
		int salary=array[array.length-2];
		System.out.println("Second highest salary is "+ salary);
		
		Set<Integer> hashSet = new HashSet<>();
		for (int num : array) {
            hashSet.add(num);
        }
		for (int num : hashSet) {
            System.out.print(num + " ");
        }
		

	}

}
