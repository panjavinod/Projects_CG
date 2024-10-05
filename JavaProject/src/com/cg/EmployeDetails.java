package com.cg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employe{
	private String name;
	private String username;
	
	public void setNmae(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		return username;
	}
	
}
class EmployeValidation{
	public static List<Employe> check(List<Employe> employe){
		Iterator itr=employe.iterator();
		List<Employe> findedemploye=new ArrayList<Employe>();
		while(itr.hasNext()) {
			Employe emp=(Employe) itr.next();
			if(emp.getName().equals("vinod")) {
				findedemploye.add(emp);			 
			}
		}
		return findedemploye;
		
		
		
		
	}
}

public class EmployeDetails {

	public static void main(String[] args) {
		List<Employe> employedetails=new ArrayList<Employe>();
		System.out.println("Enter how many employe details do you want");
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		for(int i=0;i<total;i++) {
			Employe emp=new Employe();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the username");
			String username=sc.next();
			emp.setNmae(name);
			emp.setUsername(username);
			employedetails.add(emp);
		}
		List<Employe> matchingEmployees=EmployeValidation.check(employedetails);
		if (!matchingEmployees.isEmpty()) {
            System.out.println("Matching employee details:");
            for (Employe emp : matchingEmployees) {
                System.out.println("Name: " + emp.getName() + ", Username: " + emp.getUsername());
            }
        } else {
            System.out.println("No employee found with the given name.");
        }
		
	}

}
