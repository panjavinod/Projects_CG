package com.cg;
import java.time.LocalTime;

public class Localtime {

	public static void main(String[] args) {
			LocalTime time = LocalTime.now();  
			System.out.println("Present time----------"+time);
			System.out.println("minus minutes time----"+time.minusMinutes(20));
			System.out.println("minus hours time------"+time.minusHours(1));
			System.out.println("Plus Hours time-------"+time.plusHours(1));
			System.out.println("plus minutes time-----"+time.plusMinutes(10));
	}

}
