package com.cg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDate1="06/07/1999";  
		try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			System.out.println(sDate1+"\t"+date1);  
		} catch (ParseException e) {
			
			e.printStackTrace();
		}  
	}

}
