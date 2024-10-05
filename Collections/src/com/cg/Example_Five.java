package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Customor{
	int age;
	String name;
	public Customor(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "age=" + age + ", name=" + name;
	}
	
}
public class Example_Five {
    
	public static void main(String[] args) {
		System.out.println("-----------------sorting arrayList based on last digit---------------");
		List<Customor> list=new ArrayList<Customor>();
		
//		list.add(37);
//		list.add(23);
//		list.add(78);
//		list.add(91);
//		list.add(42);
		
		// The Comparator provides multiple sorting sequences
		//Comparator provides compare() method to sort elements.
		//We can sort the list of elements  by Collections.sort(List, Comparator) method.
		
//		Comparator<Customor> comparator=new Comparator<Customor>() {
//
//			public int compare(Customor i, Customor j) {
//				if(i.age%10>j.age%10) {
//					return 1;
//				}
//				return -1;
//			}
//			
//		};
		
		
		// lambda expression and ternory operator
		Comparator<Customor> comparator=(i,j)-> i.age%10>j.age%10?1:-1;
		//Comparator<Customor> comparator=(c1,c2)-> c1.name.compareTo(c2.name);
		
//		public int compare(Customor c1, Customor c2) {
//			
//			return c1.name.compareTo(c2.name);
//		}
//    };
		
		list.add(new Customor(21,"vinod"));
		list.add(new Customor(18,"venky"));
		list.add(new Customor(25,"anu"));
		list.add(new Customor(16,"teenaj"));
		list.add(new Customor(32,"sir"));
		
		Collections.sort(list, comparator);
		//Collections.sort(list, (i,j) -> Integer.compare(i.age%10,j.age%10));
		for(Customor i:list) {
			System.out.println(i);
		}

	}

}
