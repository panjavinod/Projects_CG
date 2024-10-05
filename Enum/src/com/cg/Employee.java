package com.cg;

public class Employee {
	 String name;
	 int id;
	 String Genderr;
	Adress adress;
	public Employee(String name, int id, String genderr, Adress adress) {
		super();
		this.name = name;
		this.id = id;
		this.Genderr = genderr;
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", Genderr=" + Genderr + ", adress:" + adress + "";
	}
	

	
	
}
