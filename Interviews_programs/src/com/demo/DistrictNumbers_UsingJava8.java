package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistrictNumbers_UsingJava8 {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(10,50,10,30,20,40,20);
		List<Integer> distincNumbers=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Numbers is "+distincNumbers);
	}

}
