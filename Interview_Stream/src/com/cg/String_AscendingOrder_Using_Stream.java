package com.cg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class String_AscendingOrder_Using_Stream {

	public static void main(String[] args) {
		List < String > fruits = new ArrayList < String > ();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
		
        // USING internal stream methods 
        List<String> list=fruits.stream()
        		                .sorted(Comparator.naturalOrder())
        		                .collect(Collectors.toList());
        System.out.println(list);
        
        // USING LambdaExpression
        List<String> list1=fruits.stream()
        		                 .sorted((o1,o2)->o1.compareTo(o2))
        		                 .collect(Collectors.toList());
        System.out.println(list1);
        
        //USING Sorted Method
        List < String > sortedList2 = fruits.stream()
        		                            .sorted().collect(Collectors.toList());
        System.out.println(sortedList2);
        
        System.out.println("---------------------Desending Order-------------------------");
        
        List<String> listdes=fruits.stream()
        		                   .sorted(Comparator.reverseOrder())
        		                   .collect(Collectors.toList());
        System.out.println(listdes);
        
        
        List<String> listdes1=fruits.stream()
        		                    .sorted((o1,o2)->o2.compareTo(o1))
        		                    .collect(Collectors.toList());
        System.out.println(listdes1);
        
	}

}
