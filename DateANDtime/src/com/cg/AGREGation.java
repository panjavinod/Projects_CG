package com.cg;

class Adress{
	String city,state,country;

	public Adress(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}

public class AGREGation {
	int id;  
	String name;  
	Adress address;  
	
	
	
	public AGREGation(int id, String name, Adress address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
         void display() {
	             System.out.println(id+"   "+name);
	             System.out.println(address.city+"  "+address.state+"   "+address.state);
           }


	public static void main(String[] args) {
		Adress a1=new Adress("RJY","AP","india");
		Adress a2=new Adress("GKRM","AP","india");
		
		AGREGation aa1=new AGREGation(100,"DON",a1);
		AGREGation aa2=new AGREGation(200,"BON",a2);
		
		aa1.display();
		aa2.display();
		
	}

}
