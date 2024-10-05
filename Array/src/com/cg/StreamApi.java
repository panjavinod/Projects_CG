package com.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
//		int result =0;
//		for(int i:values) {
//			if(i%5==0) {
//				result+=i;
//			}
//		}
//        System.out.println(result);
		                 // filter
		System.out.println("-------------------------------------");
		System.out.println(values.stream()
				                 .filter(i -> i%5==0)         // filter --> 20,35,55,75
				                 .map(i -> i*2)               // map --> 40,70,110,150 
				                 .reduce(0,(c,e)->c+e));      // reduce --> 40+70=110+110=220+150=370
		System.out.println("-------------------------------------");
		System.out.println(values.stream()
				                 .filter(i -> i%5==0)       // filter --> 20,35,55,75
				                 .reduce(Integer::sum));    // reduce --> 20+35+55+75  == 185
		       
		
		System.out.println("-------------------------------------");
		               
		System.out.println(values.stream()
				                 .filter(i -> i%5==0)    // filter --> 20,35,55,75
				                 .findFirst());          // findFirst --> 20 
		
		System.out.println("-------------------------------------");
		               // in case we dont have any matching value 
		System.out.println(values.stream().filter(i -> i%9==0).findFirst().orElse(0));
		
		System.out.println("------------------count------------------");
		System.out.println( values.stream()
				                  .filter(i -> i>30)
				                  .count());
		System.out.println("------------------collect-------------------");
		System.out.println(values.stream().collect(Collectors.summingInt(i -> i)));
		System.out.println("-------------------------------------");
		System.out.println(values.stream()
				                 .filter(StreamApi::isDivisible)
				                 .map(StreamApi::mapDouble) 
				                 .findFirst());
	}
	public static boolean isDivisible(int i) {
		System.out.println("isDivisible "+i);
		return i%5==0;
	}
	public static int mapDouble(int i) {
		System.out.println("mapDouble "+i);
		return i*2;
	}

}
