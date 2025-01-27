package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_ListTo_Map_java8 {
	
	//Convert a list of integers to a map where the key is the integer and 
	//the value is the square of that integer using java8.

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(2,4,6);
		
		Map<Integer,Integer> map=list.stream().collect(Collectors.toMap(n->n, n->(n*n)));
		
		map.forEach((key,value)-> System.out.println(key+" SQUARE IS "+value));
		
		
	}

}
