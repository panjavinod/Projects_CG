package com.cg;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee a=new Employee("vinnu",1,"Male",new Adress("gokavaram","AP",533286));
		Employee a1=new Employee("vinod",2,"Male",new Adress("gokavaram","AP",533286));
		list.add(a);
		list.add(a1);
		System.out.println("-----------------using foreach loop--------------");
		System.out.println();
		for(Employee s:list) {
			System.out.println(s.name+" "+s.id+" "+s.Genderr+" "+s.adress);
		}
		System.out.println();
		System.out.println("------------using Iterator--------------");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Employee s1=(Employee)itr.next();
			System.out.println("name "+s1.name+" Id "+s1.id+" Gender "+s1.Genderr+" Adress "+s1.adress);
		}

	}

}
