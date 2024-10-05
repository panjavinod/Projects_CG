package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Desending {

	public static void main(String[] args) {
		Set<Integer> numberset = new HashSet<Integer>();
		numberset.add(10);
		numberset.add(5);
		numberset.add(7);
		numberset.add(1);
		numberset.add(9);
		
		List<Integer> numbersList = new ArrayList<>(numberset);
		Collections.sort(numbersList);
		Collections.reverse(numbersList);
		
		System.out.println(numbersList);
        
	}

}
