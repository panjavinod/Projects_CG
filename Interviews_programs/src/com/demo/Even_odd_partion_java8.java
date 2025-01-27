package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Even_odd_partion_java8 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(10,24,21,67,23);
		
		Map<Boolean,List<Integer>> partitioned=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);

        // Print the results
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
	}

}
