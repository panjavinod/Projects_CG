package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Student{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
}

public class ArrayList1 {

	public static void main(String[] args) {
		Student s1=new Student(101,"Sonoo",23);
		Student s2=new Student(102,"Ravi",21);
		Student s3=new Student(103,"Hanumat",25);
		ArrayList<Student> student=new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		System.out.println("------------Using iterator------------");
		Iterator itr=student.iterator();  	 
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		  System.out.println("------------Using for-each loop------------");
		  for(Student s:student) {
			  System.out.println(s.rollno+" "+s.name+" "+s.age);
		  }
		  System.out.println("------------Using for-each method------------");
		  student.forEach(n -> {System.out.println(n.rollno+" "+n.name+" "+n.age);});
		  
	}

}
