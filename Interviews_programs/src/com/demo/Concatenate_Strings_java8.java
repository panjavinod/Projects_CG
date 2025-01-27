package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Personn{
	
    private String name;
    private int age;

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class Concatenate_Strings_java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Personn> personList = Arrays.asList(
	            new Personn("Alice", 30),
	            new Personn("Bob", 25),
	            new Personn("Charlie", 35)
	        );
		
	
		 String concatenatedNames = personList.stream()
         .map(Personn::getName) 
         .collect(Collectors.joining(", ")); 

     System.out.println("Concatenated Names: " + concatenatedNames);
     
     List<String> str= Arrays.asList("vinod","panja");
     String strr=str.stream().map(st -> st).collect(Collectors.joining(", "));
     System.out.println(strr);
     
//     List<String> name = Arrays.asList("venkatesh", "panja");
//     List<String> str = Arrays.asList("vinod", "panja");
//
//     // Combine the two lists
//     List<String> combinedList = Stream.concat(name.stream(), str.stream())
//                                       .collect(Collectors.toList());
//
//     System.out.println(combinedList);
     
    

	}

}
