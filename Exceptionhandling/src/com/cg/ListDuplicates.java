package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDuplicates {

	public static void checkDuplicate(List<Integer> list) throws Exception {
		List<Integer> newlist=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(!newlist.contains(list.get(i))) {
				newlist.add(list.get(i));
			}else {
				throw new Exception(list.get(i)+" is deplicate ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Iterations Do you Want");
		int count=sc.nextInt();
		System.out.println("Enter List elements");
		List<Integer> numbers=new ArrayList<Integer>();
		for(int i=0;i<count;i++) {
			int n=sc.nextInt();
			numbers.add(n);
		}
		try {
			checkDuplicate(numbers);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
