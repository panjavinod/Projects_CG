package com.cg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class EmployeDetails{
	private int id;
	private String name;
	private String company;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}

public class Map_From_user {

	public static void main(String[] args) {
		Map<Integer,EmployeDetails> details=new HashMap<Integer,EmployeDetails>();
		System.out.println("Enter howmany details do you want");
		Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        for(int i=0;i<total;i++) {
        	EmployeDetails emp=new EmployeDetails();
        	System.out.println("Enter the id");
        	emp.setId(sc.nextInt());
        	System.out.println("Enter the name");
        	emp.setName(sc.next());
        	System.out.println("Enter the company");
        	emp.setCompany(sc.next());
        	details.put(emp.getId(), emp);
        	
        }
        for(Map.Entry<Integer,EmployeDetails> map:details.entrySet()) {
        	int id=map.getKey();
        	EmployeDetails employe=map.getValue();
        	System.out.println(id);
        	System.out.println(employe.getName()+" "+employe.getCompany());
        }
       
	}

}
