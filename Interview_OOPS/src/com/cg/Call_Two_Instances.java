package com.cg;

class Person{
	public String name;
	public int age;
//	public Person() {
//		
//		this.name = "vinod";
//		this.age = 23;
	//}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

	
	
}
public class Call_Two_Instances {

	public static void main(String[] args) {
		
Person p=new Person("vinod",23);
Person p1=new Person("Vinnu",22);
System.out.println("First Instance "+p.toString());
System.out.println("Second Instance "+p1.toString());
	}

}
