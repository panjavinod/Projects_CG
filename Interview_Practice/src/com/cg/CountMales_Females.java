package com.cg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class EmpDetails{
	private String name;
	private String Gendr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getGendr() {
		return Gendr;
	}
	public void setGendr(String gendr) {
		this.Gendr = gendr;
	}
	
}

public class CountMales_Females {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int male=0,female=0;
		System.out.println("Enter the Employe Size  ");
		int number=sc.nextInt();
		System.out.println("Enter the EmpDetails ");
		List<EmpDetails> empList=new ArrayList<EmpDetails>();
		for(int i=0;i<number;i++) {
			EmpDetails emp=new EmpDetails();
			emp.setName(sc.next());
			emp.setGendr(sc.next());
			empList.add(emp);
		}
		
		Iterator itr=empList.iterator();
		while(itr.hasNext()) {
			EmpDetails empdetails=(EmpDetails)itr.next();
			if((empdetails.getGendr()).equals("male")) {
				male++;
			}
			else{
				female++;
			}
		}
		System.out.println("Males Are "+male);
		System.out.println("females Are "+female);
		

	}

}
