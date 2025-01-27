package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Persona {
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class GroupPerson_BasedOnAGe {

	public static void main(String[] args) {
		
		 List<Persona> personList = Arrays.asList(
		            new Persona("Alice", 30),
		            new Persona("Bob", 25),
		            new Persona("Charlie", 30),
		            new Persona("David", 40),
		            new Persona("Eve", 25)
		        );
		 
		Map<Integer,List<Persona>> personsByAge= personList.stream()
				                                           .collect(Collectors.groupingBy(Persona::getAge));
		
		System.out.println(personsByAge);
		
		personsByAge.forEach((age, persons) -> {
            System.out.println("Age: " + age);
            persons.forEach(person -> System.out.println("\t" + person));
        });
		
//		Map<Integer, List<String>> names = personList.stream()
//	            .collect(Collectors.groupingBy(
//	                Persona::getAge, 
//	                Collectors.mapping(Persona::getName, Collectors.toList())
//	            ));
//		                
//	   System.out.println(names);

	}

}
