package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check_Specific_element_java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String> list = Arrays.asList("apple","banana","sapota");
//		
//		String element ="sapota"; 

		List<Integer> list = Arrays.asList(10,20,30);

		int element = 10;

		boolean check = list.stream().anyMatch(i -> i.equals(element));

		if (check) {
			System.out.println("The list contains: " + element);
		} else {
			System.out.println("The list Not contains: " + element);
		}

	}

}
