package com.cg;

import java.util.*;


class Customer{
	int SrollNo;
	String Sname;
	int Sage;
	public Customer(int srollNo, String sname, int sage) {
		super();
		SrollNo = srollNo;
		Sname = sname;
		Sage = sage;
	}
	
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> list=new ArrayList<Customer>();
		Customer s1=new Customer(101, "Revanth", 35);
		Customer s2=new Customer(102,"Merina",30);
		Customer s3=new Customer(103,"Srihan",27);
		Customer s4=new Customer(104,"Siri",26);
		Customer s5=new Customer(105,"vasanthi",25);
		list.add(new Customer(106,"Vinod",23));
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		Customer st=(Customer)itr.next();
		if(st.Sage<30) {
			System.out.println(st.SrollNo+" "+st.Sname+" "+st.Sage);
		}
}
		
//	Iterator itr=list.iterator();  	 
//	  while(itr.hasNext()){  
//		  Customer st=(Customer)itr.next();  
//	    System.out.println(st.SrollNo+" "+st.Sname+" "+st.Sage);  
//	  } 
		System.out.println("------------Using forEach-Loop----------------");
		for(Customer ct:list) {
			if(ct.Sage<30) {
				System.out.println(ct.SrollNo+" "+ct.Sname+" "+ct.Sage);
			}
		}

		
	}

}
