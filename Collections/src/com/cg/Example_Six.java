package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Comparable provides a single sorting sequence.
//Comparable affects the original class, i.e., the actual class is modified.
//Comparable provides compareTo() method to sort elements
//Collections.sort(List) method.
class Person implements Comparable<Person>{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
//   based on the id 
//	public int compareTo(Person that) {
//		if(this.id>that.id) {
//			return 1;
//		}
//		return -1;
//
//	}
	
	// based on the name
	public int compareTo(Person that) {
		return this.name.compareTo(that.name);

	}
	
}
public class Example_Six {

	public static void main(String[] args) {
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person(21,"vinod"));
		list.add(new Person(18,"venky"));
		list.add(new Person(25,"anu"));
		list.add(new Person(16,"teenaj"));
		list.add(new Person(32,"sir"));
		
		Collections.sort(list);
		for(Person i:list) {
			System.out.println(i);
		}
	}

}
