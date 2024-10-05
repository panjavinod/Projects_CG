package com.cg;

class Adress{
	String city;
    String State;
    String country;
	public Adress(String city, String state, String country) {

		this.city = city;
		State = state;
		this.country = country;
	}
    
}
class Employee{
	String name;
	int id;
	Adress adress;
	public Employee(String name, int id, Adress adress) {
	
		this.name = name;
		this.id = id;
		this.adress = adress;
	}
	void dispaly() {
    	System.out.println(name+" "+id);
    	System.out.println(adress.city+" "+adress.State+" "+adress.country);
    }
	
}
public class Aggregation {

	public static void main(String[] args) {
		Adress a1=new Adress("Gokavaram","Ap","India");
		Adress a2=new Adress("Korukonda","Ap","India");
        
		Employee e1=new Employee("vinod",825,a1);
		Employee e2=new Employee("vinnu",85,a2);
		
		e1.dispaly();
		e2.dispaly();
	}

}
