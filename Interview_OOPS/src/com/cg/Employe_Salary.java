package com.cg;
class Employe{
	  private String name;
	  private String jobTitle;
	  private double salary;
	public Employe(String name, String jobTitle, double salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	public void raiseSalary(double percentage) {
	    salary = salary + salary * percentage / 100;
	  }
	
	public void printEmployeeDetails() {
	    System.out.println("Name: " + name);
	    System.out.println("Job Title: " + jobTitle);
	    System.out.println("Salary: " + salary);
	  }
	  
}
public class Employe_Salary {

	public static void main(String[] args) {
		
Employe e=new Employe("hulk","HR manager",40000);
Employe e2=new Employe("Bulk","Manager",60000);
e.raiseSalary(8);
e2.raiseSalary(12);
e.printEmployeeDetails();
System.out.println("----------------------------------");
e2.printEmployeeDetails();
	}

}
