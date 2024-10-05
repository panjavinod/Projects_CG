package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=Arrays.asList(4,5,6,7,8);
//		
//		Consumer<Integer> c=new Consumer<Integer>() {
//		    public void accept(Integer i) {
//		    	System.out.println(i);
//		    }
//		}; 
//		values.forEach(c);
       
//		Consumer<Integer> c=i->System.out.println(i);
//        values.forEach(c);
//        values.forEach(i->System.out.println(i));
        
                  // method reference
		
       // values.forEach(System.out::println);
		values.forEach(Lambda3::doubleit);
        
	}
	public static void doubleit(int i) {
    	System.out.println(i*2);
    }
	

}
