package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Arraylistt {
	public static void main(String[]ags) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list size");
		int a=sc.nextInt();
		List<String> sname=new ArrayList<String>();
		System.out.println("add the list elements");
		for(int i=0;i<a;i++) {
			String aa=sc.next();
			sname.add(i,aa);
		}
//		for(String string:sname) {
//			System.out.println(string);
//			sname.
//		}
		Collections.sort(sname);
		System.out.println("------------------list elemets----------------");
		Iterator itr=sname.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList<String> name=new LinkedList<String>();
		name.add("banana");
		name.add("graps");
		System.out.println("------------------reverse of list elemets----------------");
		Iterator it=name.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		sname.set(1,"graps");
		//foreach() method
		System.out.println("------------------for each method()----------------");
		sname.forEach(d -> {System.out.println(d);});
	}

}
