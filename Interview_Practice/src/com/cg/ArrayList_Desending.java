package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ListIterator;

public class ArrayList_Desending {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the size do you want");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<size;i++) {
			int numbers=sc.nextInt();
			list.add(numbers);
		}
		
		
		Collections.sort(list);
		Collections.reverse(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		Comparator cmp=Collections.reverseOrder();
//		Collections.sort(list, cmp);
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		 ListIterator<Integer> itr=list.listIterator();
//		 while (itr.hasNext()) {
//			 itr.next();
//	        }
//        while(itr.hasPrevious()) {
//        	int num= itr.previous();
//        	System.out.println(num);
//        			
//        }
        
	}

}
