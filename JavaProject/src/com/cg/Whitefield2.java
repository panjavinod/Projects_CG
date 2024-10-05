package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Whitefield2 {

	public static void main(String[] args) {
		int array[] = new int[] {-5,7,8,-2,-4};
		//Arrays.sort(array);
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}

		List<Integer> list=Arrays.asList(-5,7,8,-2,-4);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		
		//-------------------- ArrayList descending --------------------------
		int temp;
		boolean swapped;

		do {
		    swapped = false;
		    for (int i = 0; i < list.size() - 1; i++) {
		        if (list.get(i) > list.get(i + 1)) {
		            // Swap elements
		            temp = list.get(i);
		            list.set(i, list.get(i + 1));
		            list.set(i + 1, temp);
		            swapped = true;
		        }
		    }
		} while (swapped);
System.out.println(list);
		
	}

}
