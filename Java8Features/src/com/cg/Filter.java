package com.cg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(3,4,2,6,5,1);
		
		// predicate is the functional interface of filter
		Predicate<Integer> predi= n ->n%2==1;
		//Function is the functional interface of map
		Function<Integer,Integer> fun=t-> t*2;
		// here three streams is there
		li.stream()
//		  .filter(n->n%2==1)
		  .filter(predi)
		  .sorted()
//		  .map(n->(n*2))
		  .map(fun)
		  .forEach(n->System.out.println(n));
int num=li.stream().reduce(0,(c,e)->c+e);
System.out.println("sum of numbers "+num);
	}

}
