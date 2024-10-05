package com.cg;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class LocalDATE {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Today Date "+date);
		System.out.println("YesterDay date "+date.minusDays(1));
		System.out.println("Tomorrow date "+date.plusDays(1));
		System.out.println("--------------Leap Year method-----------------");
		System.out.println(date.isLeapYear());
		

	}

}
