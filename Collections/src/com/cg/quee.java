package com.cg;

import java.util.PriorityQueue;
import java.util.Queue;

public class quee {

	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<>();
		q.add("DOG");
		q.add("Elephant");
		q.add("monkey");
		System.out.println("-----------------Before PULL------------------");
		System.out.println(q);
		System.out.println("-----------------After poLL--------------------");
		q.poll();
	   System.out.println(q);
	}

}
