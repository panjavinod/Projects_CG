package com.cg;

import java.util.LinkedList;

public class Reverse_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> Llist=new LinkedList<Integer>();
		Llist.add(1);
		Llist.add(2);
		Llist.add(3);
		Llist.add(4);
		Llist.add(5);
		
		for(int i=Llist.size()-1;i>=0;i--) {
			System.out.println(Llist.get(i));
		}
		

	}

}
