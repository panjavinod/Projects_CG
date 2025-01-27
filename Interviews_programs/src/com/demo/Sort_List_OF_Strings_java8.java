package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_List_OF_Strings_java8 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("banana", "apple", "manago", "graps");

		list.stream().sorted().forEach(i -> System.out.println(i));
		
				
		
		//Using Java 8 streams, write a program to concatenate the names of all persons in a list separated by commas.
		
		String string =list.stream().map(i -> i).collect(Collectors.joining(","));
		System.out.println("Concatenate strings "+string);
		
		
		
		//Convert a list of strings to uppercase using a lambda expression and the Stream API.
	   	
		List<String> uppercase = list.stream()
				                     .map( str -> str.toUpperCase())
				                     .collect(Collectors.toList());
		
		uppercase.forEach(str -> System.out.println(str));
		
				
	
		//Write a program to find the first non-repeated character in a string using Java 8 streams.
		
		String str = "voiinodd";

		Character ch = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		if (ch != null) {
			System.out.println("First non-repeated character: " + ch);
		} else {
			System.out.println("No non-repeated character found.");
		}
		
		
		
		str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, Collectors.counting()))
		.entrySet().stream().filter(i -> i.getValue() == 1).forEach(entry->System.out.println(entry.getKey()));
		
		
		
	}

}
