package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Creation_OF_Stream {

	public static void main(String[] args) {
		
// ------------------USING STREAM -------------------------------------------
//		Stream<String> stream=Stream.of("a","b","c","d");
//		stream.forEach(i->System.out.println(i));
//		stream.forEach(System.out::println);
		
// --------------USING COLLECTIONS -----------------------------------------------
		
//		Collection<String> collection=Arrays.asList("java","python","c++");
//	    for(String coll:collection) {
//		     System.out.println(coll);	
//		   }
		
// ---------------- USING LIST ----------------------------------------------
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
//		list.stream().forEach(i->System.out.println(i));
		
// --------------USING SET -----------------------------------------------------
		
		//Set<Integer> set=(Set<Integer>) Arrays.asList(1,2,3,4,5,6); ll get error
//		Set<Integer> set = new HashSet<>(list);
//        Stream<Integer> stream4 = set.stream();
//        stream4.forEach(System.out::println);
		
// -------------------------- USING ARRAY -------------------------
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> arraystream = Arrays.stream(arr);
		arraystream.forEach(i->System.out.println(i));
		
	}

}
