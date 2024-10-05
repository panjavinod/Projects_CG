package com.cg;
class Student{
	private String name;
	private String college;
	
	public Student(String name, String college) {
		
		this.name = name;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + college + "]";
	}
	
	
}
public class Object_Creation {

	public static void main(String[] args) {
		Student s=new Student("Harha","JpM");
		System.out.println(s.toString());
		
	}

}
