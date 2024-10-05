package com.cg;

import java.util.stream.Stream;

public class Enum2 {

	
		// TODO Auto-generated method stub
		public enum seasons {
	        Spring,
	        Summer,
	        Monsoon,
	        Autumn,
	        Winter
	    }
	    public static void main(String[] args)
	    {
	        // iteration over enum using java.util.stream
//	        Stream.of(seasons.values())
//	            .forEach(System.out::println);
	    	for (seasons s : seasons.values()) {
	            System.out.println(s);
	        }
	    }
	}


