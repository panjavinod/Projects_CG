package com.cg;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDAteandTime {

	public static void main(String[] args) {
	LocalDateTime LDT=LocalDateTime.now();
	System.out.println("Before Formatting: " + LDT); 
	DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String foemateDateTime =LDT.format(formate);
	System.out.println("After Formatting: "+foemateDateTime);
	System.out.println("minus Days "+LDT.minusDays(10));
	System.out.println("Plus Days  "+LDT.plusDays(10));

	}

}
