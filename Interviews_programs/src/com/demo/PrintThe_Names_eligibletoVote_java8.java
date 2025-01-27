package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class PrintThe_Names_eligibletoVote_java8 {

	public static void main(String[] args) {
		List<Person> personList=new ArrayList<Person>();
		personList.add(new Person("james",23));
		personList.add(new Person("hulk",16));
		personList.add(new Person("riyaz",19));
		personList.add(new Person("hami",16));
		personList.add(new Person("tink",25));
		System.out.println("--------------------Using ForEach method---------------------");
		personList.stream()
		          .filter(person -> person.age>18)
		          .forEach(person->System.out.println(person.name));
		
//		System.out.println("--------------------Using collectors method---------------------");
//		List<Person> Eligible =personList.stream()
//                             .filter(person -> person.age>18)
//                             .collect(Collectors.toList());
//		System.out.println(Eligible);
		
//		System.out.println("--------------------Using map---------------------");
//		List<String> names=personList.stream()
//				                     .map(p->p.name)
//				                     .collect(Collectors.toList());
//		System.out.println(names);
		
		
		
		
		//Given a list of Person objects with name and age fields,
		//write a program to find the oldest person using streams.
		
		
		 Optional<Person> oldperson = personList.stream().max(Comparator.comparing(Person::getAge));
		 
		 oldperson.ifPresent(person -> System.out.println(person.getName()+" "+ person.age));
		 
		 Optional<Person> person =personList.stream()
		    .sorted((o1, o2) -> o2.getAge() - o1.getAge()).findFirst();
		    //.forEach(person -> System.out.println(person.getName() + " - " + person.getAge())); 

		 System.out.println(person);
	}

}
