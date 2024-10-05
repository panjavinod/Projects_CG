package com.cg;

import java.time.LocalDate;
import java.time.Month;

public class BirthdayUsingDateMonth {

	public static void main(String[] args) {
		int birthDate=6;
		Month birthMonth=Month.JULY;
		
		LocalDate cureentDate=LocalDate.now();
		int date = cureentDate.getDayOfMonth();
		Month month=cureentDate.getMonth();
		
      if(birthDate==date && birthMonth==month) {
    	  System.out.println("HAPPY BIRTHDAY");
      }
      else {
    	  System.out.println("TO DAY NOT YOUR BIRTHDAY");
      }
	}

}
