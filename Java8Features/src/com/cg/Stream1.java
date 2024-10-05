package com.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(4,2,3,1,5);
//		li.forEach(n->System.out.println(n));
		Stream<Integer> data=li.stream();
		//data.forEach(n->System.out.println(2));
		
		// we cant re use stream  if do that we ll get some exception
		//data.forEach(n->System.out.println(n));
		
		// Methods
		//count()
        //System.out.println(data.count());
		
		// sorted method()
        //Stream<Integer> sorted=data.sorted();
        //sorted.forEach(n->System.out.println(n));
		
		// map method()
        Stream<Integer> mapdata=data.map(n->(n*2));
       mapdata.forEach(n->System.out.println(n));
	}

}
