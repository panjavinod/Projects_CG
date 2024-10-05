package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Float> list=new ArrayList<Float>();
		list.add(200000f);
		list.add(300000f);
		list.add(400000f);
		list.add(500000f);
		List<Float> li=list.stream().filter(a -> a>200000).map(am->am).collect(Collectors.toList());
		
System.out.println(li);
	}

}
